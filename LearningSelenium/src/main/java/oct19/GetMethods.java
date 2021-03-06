package oct19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1 get
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//2 getCurrentUrl
		String getURL = driver.getCurrentUrl();
		
		System.out.println("URL is " + getURL);
				
		String searchKeyword = "DRESSES";
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(searchKeyword);
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		String getSearchResult = driver.findElement(By.xpath("//span[@class='lighter']")).getText();
		
		if(getSearchResult.contains(searchKeyword)) {
			System.out.println("Search key word is matching PASS");
		} else {
			System.out.println("Search key word is NOT matching FAIL");
		}
		
		String getURL2 = driver.getCurrentUrl();
		System.out.println("URL after search " + getURL2);
		
		
		// 3 getTitle
		driver.findElement(By.linkText("Contact us")).click();
		String getCurrentPageTitle = driver.getTitle();
		System.out.println("Title is :> "+getCurrentPageTitle);
		
		// 4 getSourceCode
		String getSourceCode = driver.getPageSource();
		System.out.println("print the source code ===> " + getSourceCode);
		
	}

}
