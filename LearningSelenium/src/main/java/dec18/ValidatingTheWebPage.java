package dec18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		
		boolean res = driver.findElement(By.xpath("//input[@id='search_query_top']")).isDisplayed();
		
		if(res == true) {
			System.out.println("Automation practise website opened successfully");
		} else {
			System.out.println("Automation practise website NOT Opened");
		}
		
		
		String getWebPageName =  driver.findElement(By.xpath("//h1[text()='Automation Practice Website']")).getText();
		System.out.println(getWebPageName);
		
		if(getWebPageName.equals("Automation Practice Website")) {
			System.out.println("Automation Practice Website text is available on home page: PASS ");
		} else {
			System.out.println("Automation Practice Website text is NOT available on home page :: Fail");
		}
		
		
	}

}
