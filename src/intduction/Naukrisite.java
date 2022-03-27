package intduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukrisite {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		
		
		driver.findElement(By.cssSelector("div.drawer-wrapper")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId =it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//div[contains(@class,'lftBrd')]/div[2]/input")).sendKeys("selenium");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();  
}
}
