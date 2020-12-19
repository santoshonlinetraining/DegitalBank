package oct21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsWithPrompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://javascript.info/alert-prompt-confirm");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//a[@class='toolbar__button toolbar__button_run'])[5]")).click();
				
				driver.switchTo().alert().accept();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.switchTo().alert().accept();
				
				
				//click on cancel
				driver.findElement(By.xpath("(//a[@class='toolbar__button toolbar__button_run'])[5]")).click();
				
				driver.switchTo().alert().dismiss();
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.switchTo().alert().accept();
				
				
	}

}
