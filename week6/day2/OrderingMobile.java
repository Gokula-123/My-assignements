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

public class OrderingMobile extends ServiceNowMethod{
	@BeforeTest
		public void setData() {
		excelFileName="test1";
	}
	@Test(dataProvider = "sendData")
	public void runOrderingMobile(String username,String password,String color,String storage) {
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		Shadow dom = new Shadow(driver);
		dom.setImplicitWait(30);
		dom.findElementByXPath("//div[@id='all']").click();
		dom.setImplicitWait(30);
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frame = dom.findElementByXPath("//*[@id='gsft_main']");
		driver.switchTo().frame(frame);
		dom.findElementByXPath("//h2[contains(text(),'Mobiles')]").click();
		dom.findElementByXPath("//a[contains(text(),'Apple iPhone 6s')]").click();
        Select s = new Select(driver.findElement(By.xpath("(//table[@aria-label='Apple iPhone 6s']//select)[2]")));
        s.selectByVisibleText(color);
        Select s1 = new Select(driver.findElement(By.xpath("(//table[@aria-label='Apple iPhone 6s']//select)[3]")));
        s1.selectByValue(storage);
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		driver.switchTo().defaultContent();
		dom.setImplicitWait(30);
		WebElement frame1 = dom.findElementByXPath("//*[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		WebElement mobileOrder = driver.findElement(By.xpath("//*[@id=\"sc_order_status_intro_text\"]/dl/dt[1]"));
		String order = mobileOrder.getText();
		if(order.equalsIgnoreCase("Order Placed")) {
			WebElement requestNumber = driver.findElement(By.xpath("//a[@id='requesturl']/b"));
			String req = requestNumber.getText();
			System.out.println(req);
		}
		driver.switchTo().defaultContent();

	}

}
