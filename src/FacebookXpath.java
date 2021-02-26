import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neilm\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neil@aol.com");
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@name='login']")).click();

	}
}
