package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

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
	       
	       dom.findElementByXPath("//span[text()='Learning on Trailhead']").click();
       
           dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
           
           driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
           
           WebElement para = driver.findElement(By.xpath("(//div[contains(text(),'Salesforce Architects')])[1]"));
           System.out.println(para.getText());
           
           List<WebElement> architect = driver.findElements(By.xpath("//div[@class='slds-size--1-of-1 slds-large-size--1-of-3 slds-p-horizontal--medium slds-p-vertical--medium']//a"));
    	   System.out.println("\n" + driver.getTitle());
           for (WebElement archi : architect) {
			String text = archi.getText();
           if(text.contains("Architect")) {
               System.out.println(text);}
	}
           
           driver.findElement(By.linkText("Application Architect")).click();

           List<WebElement> application = driver.findElements(By.xpath("(//div[@class='slds-container--center slds-container--x-large slds-p-top--small'])[1]//a"));
    	   System.out.println("\n" + driver.getTitle());
           for (WebElement app : application) {
   			String text = app.getText();
   			if(text.contains("Architect")||text.contains("Platform")){
                  System.out.println(text);}
   	}

	}
	}
