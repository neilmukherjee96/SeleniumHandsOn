import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// this is where we write selenium code
		// creating a driver object based on chrome browser
		// invoke the .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neilm\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());// validate if page title is correct
		System.out.println(driver.getCurrentUrl());// to validate if we landed on correct URL
		// System.out.println(driver.getPageSource()); to get the page source,in secure
		// sites we dont get access to page
		// source
		driver.get("http://yahoo.com");// after google the website of yahoo will load
		driver.navigate().back();// it should automatically navigate back to the previous URL
		driver.navigate().forward();// takes it forward to the other webpage.We dont have to click the back button
									// this way
		driver.close();// closes the browsers after execution and optimises CPU performance
		// driver.quit();closes all the browsers that were opened by selenium script-
		// for child window concept
		

	}

}
