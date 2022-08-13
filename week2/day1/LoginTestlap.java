package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps");
	       driver.manage().window().maximize();
	       WebElement elementUsername = driver.findElement(By.id("username"));
	       elementUsername.sendKeys("Demosalesmanager");
	       WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
	       elementPassword.sendKeys("crmsfa");
	       WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	       elementLogin.click();
	       
	       WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
	       String Text = elementWelcomeMessage.getText();
	       System.out.println(Text);
	}

}
