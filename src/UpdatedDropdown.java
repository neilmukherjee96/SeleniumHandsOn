import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
	public static void main(String[] args) throws InterruptedException {
		int ctr=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neilm\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		while(ctr<2) {
		driver.findElement(By.id("hrefIncAdt")).click();//2 adults here	
		ctr++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
	}

}
