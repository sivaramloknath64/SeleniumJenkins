package SauceLabs.Slk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;

import java.net.URL;

public class DockerTest {

	public static void main(String[] args) throws Exception {
		// URL of the Selenium Grid Hub (running on localhost)
		String seleniumGridURL = "http://localhost:4444/wd/hub"; // or "http://selenium-hub:4444/wd/hub" if using Docker
																	// network

		// Set the capabilities for Chrome (you can also use Firefox, Edge, etc.)
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setBrowserName("chrome");
		

		// Connect to the Selenium Grid
		WebDriver driver = new RemoteWebDriver(new URL(seleniumGridURL), capabilities);

		// Open Google and search for Selenium
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Selenium Grid");
		driver.findElement(By.name("q")).submit();

		// Wait for the search results to load
		Thread.sleep(2000);
		System.out.println("Search Result Page Title: " + driver.getTitle());

		// Quit the browser
		driver.quit();
	}
}
