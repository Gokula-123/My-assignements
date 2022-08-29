package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerttypes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.leafground.com/");
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       driver.findElement(By.xpath("//span[text()='Browser']/ancestor::a")).click();
       driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
              
       driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[1]")).click();
       Alert alert = driver.switchTo().alert();
       String simple = alert.getText();
       System.out.println(simple);
       alert.accept();
       
       driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[2]")).click();
       Alert alert1 = driver.switchTo().alert();
       String confirm = alert1.getText();
       System.out.println(confirm);
       alert1.accept();

       driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[5]")).click();
       Alert alert2 = driver.switchTo().alert();
       String text = alert2.getText();
       alert2.sendKeys("Gokula");
       System.out.println(text);
       alert2.accept();
       
       driver.findElement(By.xpath("//span[text()='Delete']/ancestor::button")).click();
       driver.findElement(By.xpath("//span[text()='Yes']/ancestor::button")).click();
       
       driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[6]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//a[@role=\"button\"])[4]")).click();
       

       
	}

}
