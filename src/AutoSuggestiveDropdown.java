
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neilm\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));// lists all the
																										// three
																										// matching
																										// elements
																										// since
		// we are using FindElements
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
	}

}
