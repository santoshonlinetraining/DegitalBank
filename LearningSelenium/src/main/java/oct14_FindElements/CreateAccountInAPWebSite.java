package oct14_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountInAPWebSite {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("santosh2@test.com");
		driver.findElement(By.id("SubmitCreate")).click();
	
		//select title
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("id_gender1")).click();
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Santosh");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kuamr");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByVisibleText("1  ");
		
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("8");
		
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByIndex(10);
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Santosh");
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("DC");
		
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("ameerpet");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
		
		Select selState = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
		selState.selectByVisibleText("Arizona");
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("987654321");
		
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
