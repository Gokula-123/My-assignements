package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContacts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("http://leaftaps.com/opentaps/control/login");
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   
	       driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	       driver.findElement(By.id("password")).sendKeys("crmsfa");
	       driver.findElement(By.className("decorativeSubmit")).click();
	       
	       driver.findElement(By.linkText("CRM/SFA")).click();
	     
	       driver.findElement(By.linkText("Contacts")).click();
	       driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	       
	       driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	       Set<String> newWindow = driver.getWindowHandles();
           List <String> listWindow = new ArrayList<>(newWindow);
           driver.switchTo().window(listWindow.get(1));
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
           driver.switchTo().window(listWindow.get(0));


	       driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	       Set<String> newWindow1 = driver.getWindowHandles();
           List <String> listWindow1 = new ArrayList<>(newWindow1);
           driver.switchTo().window(listWindow1.get(1));
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
           driver.switchTo().window(listWindow1.get(0));


	       driver.findElement(By.xpath("//a[text()='Merge']")).click();
	       driver.switchTo().alert().accept();
	       
           System.out.println(driver.getTitle());
           
           }

}
