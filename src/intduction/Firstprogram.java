package intduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.navigate().back();
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		Thread.sleep(2000L);
		driver.close();
	}

}
