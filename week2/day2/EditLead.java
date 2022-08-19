package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://leaftaps.com/opentaps/control/main");
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
        
        WebElement findLead = driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']"));
        findLead.click();
        
        WebElement fname = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
        fname.sendKeys("Gokula");
        
        WebElement leadFind = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        leadFind.click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext'])")).click();
        
        System.out.println(driver.getTitle());
       
        WebElement edit = driver.findElement(By.xpath("//a[text()='Edit']"));
        edit.click();
        
        WebElement cname = driver.findElement(By.id("updateLeadForm_companyName"));
        cname.clear();
        
        WebElement newName = driver.findElement(By.id("updateLeadForm_companyName"));
        newName.sendKeys("Thought Works");
        
        WebElement update = driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
        update.click();
        
        boolean edited = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
        System.out.println(edited);
        
        driver.close();
        
	}

}
