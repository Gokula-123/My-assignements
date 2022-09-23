package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FIllInMandatoryFields extends ServiceNowMethod{
	@BeforeTest
		public void setData() {
		excelFileName="test4";
	}
	@Test(dataProvider = "sendData")
	public void runFIllInMandatoryFields(String username,String password,String knowledge,String description) {
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(30);
		dom.findElementByXPath("//div[@id='all']").click();
		dom.setImplicitWait(30);
		dom.findElementByXPath("//span[text()='Knowledge']").click();
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Create an Article']")).click();
		driver.switchTo().defaultContent();
		WebElement frame1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frame1);
		//driver.findElement(By.xpath("//span[text()='knowledge base']")).click();
		driver.findElement(By.xpath("//span[text()='knowledge base']")).sendKeys(knowledge,Keys.ENTER);
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']//span")).click();
		driver.findElement(By.xpath("//span[text()='IT']")).click();
		driver.findElement(By.xpath("//span[text()='Java']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//span[text()='Short description']")).sendKeys(description);
		driver.findElement(By.xpath("(//button[text()='Submit')[2]])")).click();
		driver.switchTo().defaultContent();
		
	}
}
