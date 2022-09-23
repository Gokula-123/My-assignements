package week6.day2;

		// TODO Auto-generated method stub
		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class CreateLead2DData {

			@Test(dataProvider="sendData")
			public void runCreateLead(String username,String passwd,String cname,String fname,String lname) {
				
				WebDriverManager.chromedriver().setup();
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("http://leaftaps.com/opentaps");
		        driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys(username);
				driver.findElement(By.id("password")).sendKeys(passwd);
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
				driver.findElement(By.name("submitButton")).click();
				driver.close();
				
		}
			@DataProvider  
			public String[][] sendData() {
				String[][] data = new String[2][5];
				data[0][0]="DemoSalesManager";
				data[0][1]="crmsfa";
				data[0][2]="TestLeaf";
				data[0][3]="Hari";
				data[0][4]="R";
				data[1][0]="DemoCSR";
				data[1][1]="crmsfa";
				data[1][2]="TestLeaf";
				data[1][3]="Babu";
				data[1][4]="M";
				return data;
				
				
			}


	}
	
		


