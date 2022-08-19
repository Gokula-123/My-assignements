package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        
	        driver.get("http://leaftaps.com/opentaps");
	        driver.manage().window().maximize();
	        
	        WebElement userLogin = driver.findElement(By.xpath("//input[@id='username']"));
	        userLogin.sendKeys("Demosalesmanager");
	        
	        WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
	        userPassword.sendKeys("crmsfa");
	        
	        WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
	        login.click();
	        
	        
	        WebElement crmsfa = driver.findElement(By.xpath("//a[contains(text(),'RM/SFA')]"));
	        crmsfa.click();
	        
	        WebElement lead = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
	        lead.click();
	        
	        WebElement createlead = driver.findElement(By.xpath("//a[contains(text(),'reate Lea')]"));
	        createlead.click();
	        
	        WebElement leadform = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
	        leadform.sendKeys("AMAZON");
	        
	        WebElement fname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
	        fname.sendKeys("Gokula");
	        
	        WebElement lname = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
	        lname.sendKeys("Sundar");
	        
	        WebElement localfname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
	        localfname.sendKeys("Gokz");
	        
	        WebElement leadcreated = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
	        leadcreated.click();
	        
	        String titlepage = driver.getTitle();
	        System.out.println(titlepage);
	        if(driver.getTitle().contains("opentaps")) {
	        	System.out.println("Form created successfully");
	        }
	        else {
	        	System.out.println("Form creation failed");
	        }    
	}
	}

