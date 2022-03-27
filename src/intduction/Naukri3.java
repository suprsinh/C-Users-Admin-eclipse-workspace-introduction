package intduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri3 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'two')]/p[0]"));
        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
}
}
