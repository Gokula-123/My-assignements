package week6.day2;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicData {
	public RemoteWebDriver driver;
	public String excelFileName;//empty variable in super class
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void preConditions(String url, String browser)  {
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
public void postConditions()  {
		driver.close();
	}
	
	@DataProvider  
	public String[][] sendData() throws IOException {
		//String[][] data = TestDataDynamic.getData("test data");{while calling individual excel files}
		String[][] result = TestDataDynamic.getData(excelFileName);//{while calling any excel files}
		return result;
	
	}

}

