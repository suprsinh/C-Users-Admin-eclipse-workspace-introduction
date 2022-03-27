package intduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Thirdprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded = {"Epigamia","So Good","Raw Pressery"};
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.cssSelector("input#input")).sendKeys("almond milk");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.cssSelector("button.bb-search")).click();
		List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class,'prod-name')]/h6"));
		
		for(int i=0;i<products.size();i++)
		{
			String name= products.get(i).getText();
			//String formattedName = name[0].trim();
			System.out.println(name);
			Thread.sleep(2000L);
			
			
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			Thread.sleep(2000L);
			
			if(itemsNeededList.contains(name))
			{
				driver.findElements(By.cssSelector("button.btn-add")).get(i).click();
			
			}
		}
		}
		
		
		
		
		
	}


