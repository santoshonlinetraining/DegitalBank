package oct22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://automationpractice.com/index.php");
				
				
				driver.findElement(By.linkText("Sign in")).click();
				
				driver.findElement(By.id("email_create")).sendKeys("santosh3@test.com");
				driver.findElement(By.id("SubmitCreate")).click();
			
				//select title
			/*	try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				driver.findElement(By.id("id_gender1")).click();
				
				driver.findElement(By.id("customer_firstname")).sendKeys("Santosh");
				driver.findElement(By.id("customer_lastname")).sendKeys("Kuamr");
				driver.findElement(By.id("passwd")).sendKeys("123456");
	}
}
