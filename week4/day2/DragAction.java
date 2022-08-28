package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://jqueryui.com/draggable/");
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.findElement(By.linkText("Draggable")).click();

	       driver.switchTo().frame(0);
	       Actions  builder =new Actions(driver);
	       
	       WebElement draggable = driver.findElement(By.id("draggable"));
	       draggable.click();
	       
	       
	       builder.dragAndDropBy(draggable,100,100).perform();
	       
	       driver.switchTo().defaultContent();
	}

}
