package intduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class implicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		String[] item = {"Epigamia"};
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("li.hvr-drop"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.cssSelector("input#input"))).click().keyDown(Keys.SHIFT).sendKeys("almond milk").doubleClick().build().perform();
		a.sendKeys(Keys.ENTER).perform();
List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class,'prod-name')]/h6"));
		
		for(int i=0;i<products.size();i++)
		{
			String name= products.get(i).getText();
			//String formattedName = name[0].trim();
			System.out.println(name);
			Thread.sleep(2000L);
			
			
			
		
			
			Thread.sleep(2000L);
			
			if(name.contains("Epigamia"))
			{
				
			//	driver.findElements(By.cssSelector("button.btn-add")).get(i).click();
				a.sendKeys(Keys.CONTROL).click().build().perform();
				
			
			}
		}
		}
	}


