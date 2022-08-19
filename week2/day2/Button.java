package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");
        driver.manage().window().maximize();
        
        WebElement title = driver.findElement(By.xpath("(//h5[text()='Click and Confirm title.'])/following::button[1]"));
        title.click();
        driver.navigate().back();
        
        System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled());
        
        System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
        
        System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
        
        System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
        
        WebElement sucess = driver.findElement(By.xpath("(//span[text()='Success'])[1]"));
        System.out.println(sucess.getCssValue("background-color"));
        Actions actions = new Actions(driver);
        actions.moveToElement(sucess);
        System.out.println(sucess.getCssValue("background-color"));
        
        driver.findElement(By.xpath("//span[text()='Image']")).click();
        driver.findElement(By.xpath("//div[@class='card ui-fluid']")).click();
        
        List<WebElement> buttons = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
        int size = buttons.size();
        System.out.println(size);
         
	}

}
