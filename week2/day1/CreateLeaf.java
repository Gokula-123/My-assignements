package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeaf {

	private static List<WebElement> findElements;

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
	       if(Text.contains("Welcome")) {
	    	   System.out.println("login successfully");
	       }
	       else {
	    	   System.out.println("login failed");
	       }
	       WebElement loginCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	       loginCRMSFA.click();
	       
	       WebElement clickLead = driver.findElement(By.linkText("Leads"));
	       clickLead.click();
	       
	       WebElement clickCreateLead = driver.findElement(By.linkText("Create Lead"));
	       clickCreateLead.click();
	       
	       WebElement typecName = driver.findElement(By.id("createLeadForm_companyName"));
	       typecName.sendKeys("Amazon");
	       
	       WebElement typefName = driver.findElement(By.id("createLeadForm_firstName"));
	       typefName.sendKeys("Gokula");
	       
	       WebElement typelName = driver.findElement(By.id("createLeadForm_lastName"));	
	       typelName.sendKeys("Sundar");
	       
	       WebElement selectSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	       selectSource.sendKeys("Direct Mail");
	       
           WebElement selectCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));	       
	       Select s1 = new Select(selectCampaign);
	       s1.selectByVisibleText("eCommerce Site Internal Campaign");
	       
	       WebElement selectIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	       Select s2 = new Select(selectIndustry);
	       s2.selectByValue("IND_SOFTWARE");
	       
	       WebElement selectOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	       Select s3 = new Select(selectOwner);
	       s3.selectByIndex(4);
	       
	       WebElement clickleaf = driver.findElement(By.name("submitButton"));
	       clickleaf.click();
	       
	}

}
