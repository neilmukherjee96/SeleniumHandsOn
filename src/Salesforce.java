import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neilm\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");// URL in the project
		driver.findElement(By.cssSelector("#username")).sendKeys("sayandas8@gmail.com");// helps us locate the textbox
																						// by
																						// the
																						// ID
																						// after inspecting src file.

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("neil!006");// never put xpath that starts with
																					// HTML
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());// we validate the CSS
																									// in browser and
																									// print the error
																									// message
																									// displayed.

	}

}
