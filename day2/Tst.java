package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        //driver.get("www.google.com");
        //driver.manage().window().maximize();
        
        WebElement dop = driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
	}

}
