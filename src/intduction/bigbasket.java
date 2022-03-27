package intduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class bigbasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espn.in/soccer/table/_/league/eng.1");
		List<WebElement> elementsList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//System.out.println(originalList);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Assert.assertFalse(originalList.equals(sortedList));
		
	}

}
