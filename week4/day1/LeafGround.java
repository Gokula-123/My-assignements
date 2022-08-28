package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://leafground.com/window.xhtml");
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       //Click and Confirm new Window Opens
	       driver.findElement(By.xpath("//button[@id=\"j_idt88:new\"]")).click();
	       Set<String> leafGround1 = driver.getWindowHandles();
	       List <String> list = new ArrayList<String>(leafGround1);
	       driver.switchTo().window(list.get(1));
	       String dashBoard = driver.getTitle();
	       if(driver.getTitle().equals("Dashboard")) {
	    	   System.out.println(dashBoard);
	       }
	       driver.switchTo().window(list.get(1)).close();
	       driver.switchTo().window(list.get(0));

	       //Find the number of opened tabs
	       driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt91\"]")).click();
	       Set<String> leafGround2 = driver.getWindowHandles();
	       List <String> list1 = new ArrayList<String>(leafGround2);
	       for(String eachHandle : leafGround2) {
	       driver.switchTo().window(eachHandle);
	       if(driver.getTitle().equals("Window")) {
	       break;}}
	       driver.switchTo().window(list1.get(0));
	      
	       
	       //Close all windows except Primary
	       driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt93\"]")).click();
	       Set<String> leafGround3 = driver.getWindowHandles();
	       List <String> list2 = new ArrayList<String>(leafGround3);
	       System.out.println(list2.size());
	       for(String eachHandle : leafGround3) {
	    	   driver.switchTo().window(eachHandle);
	    	   if(!driver.getTitle().equals("Window")) {
	        driver.close();}
	       }
           driver.switchTo().window(list2.get(0));
	       System.out.println("primary window is open : " + driver.getTitle());
	       
	       
	       //Wait for 2 new tabs to open
	       driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt95\"]")).click();
	       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	       wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	       Set<String> leafGround4 = driver.getWindowHandles();
	       List <String> list3 = new ArrayList<String>(leafGround4);
	       System.out.println(list3.size());
	       driver.switchTo().window(list3.get(0));
	       
	       driver.quit();

	}

}
