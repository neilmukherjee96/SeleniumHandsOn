import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffRegex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neilm\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("[title*='Already'")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("hello");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("yoloit");
		driver.findElement(By.cssSelector("input[value*='Sign']")).click();

	}

}
