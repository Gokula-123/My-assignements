package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://login.salesforce.com/");
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("ramkumar.ramaiah@testleaf.com");
	       driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Password#123");
	       driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"setupHomeCarousel_page1\"]/article[2]/div[2]/div[3]/button")).click();
	       
	       Set<String> salesForce = driver.getWindowHandles();
	       List <String> list = new ArrayList<String>(salesForce);
	       driver.switchTo().window(list.get(1));
           
	       driver.findElement(By.xpath("/html/body/div/button[2]")).click();
	       System.out.println(driver.getTitle());
	       
	       driver.switchTo().window(list.get(0));

           driver.quit();

	}

}
