package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        
	        driver.get("https://erail.in/");
	        driver.manage().window().maximize();
	        
            WebElement from = driver.findElement(By.id("txtStationFrom"));
            from.clear();
            from.sendKeys("MS",Keys.TAB);
			
			WebElement to = driver.findElement(By.id("txtStationTo"));
			to.clear();
			to.sendKeys("PDY",Keys.TAB);
			
			WebElement checkout = driver.findElement(By.id("chkSelectDateOnly"));
			checkout.click();
			
       	    List<WebElement> rows = driver.findElements(By.xpath("(//table)[3]/tbody/tr"));
       	    List<WebElement> columns = driver.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));
       	    
       	    for(int i=1;i<=rows.size();i++) {
       	    	
       	    	for(int j=1;j<=columns.size();j++) {
       	    		String text = driver.findElement(By.xpath("(//table)[3]/tbody/tr["+i+"]/td["+j+"]")).getText();
                 System.out.print(text + "    ");
       	    	}
       	    	System.out.println();
       	    }
       }

}
