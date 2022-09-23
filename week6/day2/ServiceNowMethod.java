package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowMethod {
	public RemoteWebDriver driver;
	public String excelFileName;
	
	@Parameters({"url"})
	@BeforeMethod
	public void preconditions(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postconditions() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
		String[][] result = ExcelServiceNow.getData(excelFileName);
		return result;
	}
}
