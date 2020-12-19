package oct23;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement link = driver.findElement(By.linkText("Sign in"));
			
		List<WebElement> resultOfLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Num of Links" + resultOfLinks.size());
		
		for(int i=0; i<resultOfLinks.size(); i++) {
			System.out.println("Link Name is =>" + resultOfLinks.get(i).getText());
			
			if(resultOfLinks.get(i).getText().equals("Amazon Pay")) {
				System.out.println("Amazon Pay link is Exist");
				break;
			} else {
				System.out.println("Amazon Pay lnk is NOT Exist");
			}
			
		}
		
	}

}
