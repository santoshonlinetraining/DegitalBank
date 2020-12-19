package oct16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToAP_GetLoginText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh2@test.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		
		String websiteText = "Welcome to your account. Here you can manage all of your personal information and orders.";
		
		String welcomeText;
		welcomeText = driver.findElement(By.xpath("//p[@class='info-account']")).getText();
		
		System.out.println(welcomeText);
		
		if(websiteText.equals(welcomeText)) {
			System.out.println("Welcome Text is matching");
		} else {
			System.out.println("welcome text is not matching");
		}
	}

}
