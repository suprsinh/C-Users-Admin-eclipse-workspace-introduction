package intduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement S1=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		String s2= S1.getText();
		
		System.out.println(s2);
		
String s3= S1.getAttribute("href");

System.out.println(s3);
		
	}

}
