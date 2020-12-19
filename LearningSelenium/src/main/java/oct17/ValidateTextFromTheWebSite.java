package oct17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTextFromTheWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		String facebookWelcomePageText = driver.findElement(By.xpath("//h4[text()='Follow us on Facebook']")).getText();
		
		System.out.println(facebookWelcomePageText);
		
		if(facebookWelcomePageText.contains("Facebook")) {
			System.out.println("Text match");
		} else {
			System.out.println("text not matched");
		}
		
		String bigText = driver.findElement(By.xpath("//p[contains(text(),'Selenium Framework website')]")).getText();
		System.out.println(bigText);
		
	}

}
