package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
        
        driver.findElement(By.id("ext-gen240__ext-gen254")).click();
        driver.findElement(By.id("ext-gen270")).sendKeys("9790275849");
        
        WebElement leadFind = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        leadFind.click();
        
        Thread.sleep(5000);

        String leadId = driver.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext'])")).getText();
        System.out.println(leadId);

        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext'])")).click();
        
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        
        WebElement findLead1 = driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']"));
        findLead1.click();
        
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(leadId);
        
        WebElement leadFind1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        leadFind1.click();
        
        //boolean finalValue = driver.findElement(By.xpath("//div[@id='ext-gen437']")).isDisplayed();
        //System.out.println(finalValue);
        
        Thread.sleep(5000);
        
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText());
        
        
	}

}
