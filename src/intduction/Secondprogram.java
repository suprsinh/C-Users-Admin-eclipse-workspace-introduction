package intduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[contains(@class,'searchBar')]")).sendKeys("kurtis");
		driver.findElement(By.xpath("//a[contains(@class,'submit')]")).click();
		driver.findElement(By.xpath("//header[contains(@class,'container')][contains(@id,'header')]"));
		//driver.findElement(By.xpath("//a[contains(@href,'gerua-mustard-yellow--red-empire-a-line-pure-cotton-kurti/6540132/buy')]")).click();
		//System.out.println(driver.findElement(By.xpath("//a[contains(@href,'gerua-mustard-yellow--red-empire-a-line-pure-cotton-kurti/6540132/buy')]/div[2]/h3")).getText());
		//driver.navigate().back();
		//driver.navigate().forward();
		
		
		
		
	}

}
