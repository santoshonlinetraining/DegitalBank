package dec18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-Shirts");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();

		String searchText = driver.findElement(By.xpath("//span[@class='lighter']")).getText();
		
		System.out.println(searchText);
		if(searchText.contains("T-SHIRTS")) {
			System.out.println("search successfully done");
		} else {
			System.out.println("search was not done properly ");
		}
		
		String res[] = searchText.split("\"");
		System.out.println("0" + res[0]);
		System.out.println("1" + res[1]);
		
		if(res[1].equalsIgnoreCase("T-Shirts")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		String searchValue = driver.findElement(By.xpath("//input[@id='search_query_top']")).getAttribute("value");
		System.out.println(searchValue);
		
		
	}

}
