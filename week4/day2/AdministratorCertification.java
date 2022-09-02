package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://login.salesforce.com/");
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
	       driver.findElement(By.id("password")).sendKeys("Password#123");
	       driver.findElement(By.id("Login")).click();

           driver.findElement(By.xpath("//*[@id=\"setupHomeCarousel_page1\"]/article[2]/div[2]/div[3]/button")).click();
	       
	       Set<String> salesForce = driver.getWindowHandles();
	       List <String> list = new ArrayList<String>(salesForce);
	       driver.switchTo().window(list.get(1));
           
	       driver.findElement(By.xpath("/html/body/div/button[2]")).click();
	       
	       driver.findElement(By.linkText("Resources")).click();
	       
	       
	       Shadow dom=new Shadow(driver); 
	       dom.findElementByXPath("//span[text()='Learning']").click();
	       
	       WebElement learnOnHead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
	       learnOnHead.click();
          
           
           dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
           
           driver.findElement(By.linkText("Administrator")).click();
           String certificate = driver.getTitle();
          if(certificate.contains("Administrator")) {
        	  System.out.println("Administrator Certifications");
          }
          else
          {
        	  System.out.println("TRY AGAIN");
          }
           
	}

}
