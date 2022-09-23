package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class CreateNewCaller extends ServiceNowMethod{
	@BeforeTest
		public void setData() {
		excelFileName="test3";
	}
	@Test(dataProvider = "sendData")
	public void runCreateNewCaller(String username,String password,String fname,String lname) {
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(30);
		dom.findElementByXPath("//div[@id='all']").click();
		dom.setImplicitWait(30);
		dom.findElementByXPath("//span[text()='Callers']").click();
		WebElement frame = dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		WebElement frame1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys(lname);
		driver.findElement(By.xpath("(//button[text()='Submit')[2]])")).click();
		driver.switchTo().defaultContent();
		WebElement frame2 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame2);
		WebElement proposal = driver.findElement(By.xpath("//tr[@id='row_sys_user_a67718b62f861110fde8c886f699b637']/td[4]"));
		String text = proposal.getText();
		if(text.equalsIgnoreCase("gokulasthe"))
		{
			System.out.println("verified");
		}
		driver.switchTo().defaultContent();
	}

}


