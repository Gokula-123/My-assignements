package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        
        WebElement userLogin = driver.findElement(By.id("username"));
        userLogin.sendKeys("Demosalesmanager");
        
        WebElement userPassword = driver.findElement(By.id("password"));
        userPassword.sendKeys("crmsfa");
        
        WebElement login = driver.findElement(By.className("decorativeSubmit"));
        login.click();
        
        WebElement welcome = driver.findElement(By.tagName("h2"));
        String greeting = welcome.getText();
        System.out.println(greeting);
        if(greeting.contains("Sales")) {
        	System.out.println("Successful login");
        }
        else {
        	System.out.println("failed login");
        }
        
        WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
        crmsfa.click();
        
        WebElement lead = driver.findElement(By.linkText("Leads"));
        lead.click();
        
        WebElement createlead = driver.findElement(By.linkText("Create Lead"));
        createlead.click();
        
        WebElement leadform = driver.findElement(By.id("createLeadForm_companyName"));
        leadform.sendKeys("AMAZON");
        
        WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
        fname.sendKeys("Gokula");
        
        WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
        lname.sendKeys("Sundar");
        
        WebElement localfname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
        localfname.sendKeys("Gokz");
        
        WebElement dept = driver.findElement(By.name("departmentName"));
        dept.sendKeys("CRM");
        
        WebElement desc = driver.findElement(By.id("createLeadForm_description"));
        desc.sendKeys("Selenium Webinar classes");
        
        WebElement mail = driver.findElement(By.id("createLeadForm_primaryEmail"));
        mail.sendKeys("gokulasundar96@gmail.com");
        
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select s1 = new Select(state);
        s1.selectByVisibleText("New York");
        
        WebElement leadcreated = driver.findElement(By.className("smallSubmit"));
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
