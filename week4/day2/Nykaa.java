package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.nykaa.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           
	       WebElement newBrand = driver.findElement(By.xpath("//a[text()='brands']"));
	       Actions hover = new Actions(driver);
	       hover.moveToElement(newBrand).perform();
	       driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
	       
	       String title = driver.getTitle();
	       if(title.contains("L'Oreal Paris")) {
	    	   System.out.println("IN");
	       }
	       driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
	       driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	       driver.findElement(By.xpath("//span[text()='Category']")).click();
	       driver.findElement(By.xpath("//span[text()='Hair']")).click();
	       driver.findElement(By.xpath("//span[contains(text(),'Hair Care')]")).click();
	       driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	       driver.findElement(By.xpath("//span[text()='Concern']")).click();
	       driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

	       List<WebElement> filters = driver.findElements(By.xpath("//div[@class='css-19j3ean']//span"));
           for(WebElement fill : filters) {
        	   String text = fill.getText();
        	   if(text.contains("Shampoo") ||text.contains("Color Protection"))
               System.out.println("Filters Applied");
           }
	       
           driver.findElement(By.xpath("//img[contains(@alt,'Colour Protect Shampoo')]")).click();
           Set<String> shampoo = driver.getWindowHandles();
           List<String> convert = new ArrayList<String>(shampoo);
           driver.switchTo().window(convert.get(1));
           WebElement mrp = driver.findElement(By.xpath("//span[contains(text(),'₹')]"));
           String text = mrp.getText();
           System.out.println(text);
           driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
           driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
           WebElement total = driver.findElement(By.xpath("//span[contains(text(),'₹')]/parent::div[contains(@class,'15py5ir')]"));
           String text1 = total.getText();
           System.out.println(text1);
           driver.findElement(By.xpath("//span[text()='Proceed']")).click();
           driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
           if(text.equals(text1)) {
        	   System.out.println("SAME");
           }
           else {
           System.out.println("Including TAX");
           }
	}

	

}
