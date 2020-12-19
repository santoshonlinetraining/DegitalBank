package oct22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				
				List<WebElement> elementName = driver.findElements(By.tagName("a"));
				
				System.out.println(elementName.size());
				
				for (int i=0; i<elementName.size();i++){
			      System.out.println("Radio button text:" + elementName.get(i).getText());
			    }
								
	}
}

