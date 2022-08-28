package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://jqueryui.com/selectable/");
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.findElement(By.linkText("Selectable")).click();
	       
	       driver.switchTo().frame(0);
	       Actions  builder =new Actions(driver);
	       
	       WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
	       WebElement item3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
	       WebElement item5 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
	       WebElement item7 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]"));
           
	       builder.keyDown(item1, Keys.CONTROL).perform();
	       builder.keyDown(item3, Keys.CONTROL).perform();
	       builder.keyDown(item5, Keys.CONTROL).perform();
	       builder.keyDown(item7, Keys.CONTROL).perform();

	       driver.switchTo().defaultContent();
	       
	}

}
