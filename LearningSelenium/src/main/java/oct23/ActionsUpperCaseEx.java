package oct23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUpperCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				
				Actions action = new Actions(driver);
				
				WebElement search = driver.findElement(By.xpath("//input[@id='search_query_top']"));
								
				action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("digitalCutlet").build().perform();
				
	}

}
