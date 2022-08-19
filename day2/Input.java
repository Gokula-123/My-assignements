package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("j_idt88:name")).clear();
        driver.findElement(By.id("j_idt88:name")).sendKeys("Gokula");
        
        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("-India");
        
        driver.findElement(By.id("j_idt88:j_idt93")).isDisplayed();
        
        driver.findElement(By.id("j_idt88:j_idt95")).clear();
        
        driver.findElement(By.id("j_idt88:j_idt97")).getText();
        
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("gokulasundar96@gmail.com",Keys.TAB);
        
        WebElement confirm = driver.findElement(By.id("j_idt88:j_idt101"));
        String text = confirm.getText();
        if(text.contains("Gokula")) {
        	System.out.println("moved to next tab");
        }
        else {
        	System.out.println("not moved");
        }
        confirm.sendKeys("Hi, I am Gokula from Amazon");
        
        WebElement error = driver.findElement(By.id("j_idt106:thisform:age"));
        error.sendKeys(Keys.TAB);
        String errorMsg = error.getText();
        if(errorMsg.contains("error")) {
        	System.out.println("flow correct");
        }
        else {
        	System.out.println("flow incorrect");
        }
        driver.navigate().back();
        
        System.out.println(driver.findElement(By.id("j_idt106:j_idt113")).getLocation());
        
        WebElement dob = driver.findElement(By.id("j_idt106:j_idt116_input"));
        dob.sendKeys("01/06/1996");
        String dob1 = dob.getText();
        if(dob1.contains("1996")) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("no");
        }
        
        WebElement spin = driver.findElement(By.id("j_idt106:j_idt118_input"));
        for(int i=0;i<6;i++) {
        	spin.sendKeys(Keys.ARROW_UP);
        } System.out.println(spin.getText());
        
        driver.findElement(By.id("j_idt106:slider")).sendKeys("90");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt120\"]/span")).isDisplayed());
        
        driver.findElement(By.id("j_idt106:j_idt122")).click();
        System.out.println(driver.findElement(By.xpath("/html/body/div[4]")).isEnabled());
        
	}

}
