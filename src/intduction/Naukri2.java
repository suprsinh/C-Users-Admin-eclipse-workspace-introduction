package intduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2000)");
	//	js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
	//	List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	}

}
