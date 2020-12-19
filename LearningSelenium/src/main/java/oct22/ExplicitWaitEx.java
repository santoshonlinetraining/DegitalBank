package oct22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				
				driver.findElement(By.linkText("Sign in")).click();
				
				driver.findElement(By.id("email_create")).sendKeys("santosh3@test.com");
				driver.findElement(By.id("SubmitCreate")).click();
			
				//select title
				WebDriverWait wait = new WebDriverWait(driver, 6); //seconds
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
				driver.findElement(By.id("id_gender1")).click();
				
				driver.findElement(By.id("customer_firstname")).sendKeys("Santosh");
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname")));
				driver.findElement(By.id("customer_lastname")).sendKeys("Kuamr");
				
				
				driver.findElement(By.id("passwd")).sendKeys("123456");
				
	}
}
