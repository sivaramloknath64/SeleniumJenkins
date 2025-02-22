package SauceLabs.Slk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AppTest {

    public static void main(String[] args) throws MalformedURLException {
        // Setup Chrome options with desired capabilities
        ChromeOptions options = new ChromeOptions();
        options.setPlatformName("Windows 11"); // Set platform
        options.setBrowserVersion("latest");   // Set the browser version


        // Define Sauce Labs options (credentials and job details)
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-lokteja143-76606");  // Replace with your Sauce Labs username
        sauceOptions.put("accessKey", "a81cd1dc-2f5a-4fde-b749-c7012b3ad5d0");  // Replace with your Sauce Labs access key
       //sauceOptions.put("platformName", "Windows 11");  // Example platform
       // sauceOptions.put("browserVersion", "latest");  // Example browser version (Chrome latest)

        // Attach the Sauce Labs options to the ChromeOptions
        options.setCapability("sauce:options", sauceOptions);

        //try {
            // Set up the URL for Sauce Labs remote WebDriver session
            URL sauceUrl = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");

            // Create a RemoteWebDriver session using the Sauce Labs URL
            WebDriver driver = new RemoteWebDriver(sauceUrl, options);

            // Run your test (Example: Open a webpage and validate the title)
            driver.get("https://saucedemo.com");
            String title = driver.getTitle();
            boolean titleIsCorrect = title.contains("Swag Labs");

            // Print the result of the test
            System.out.println("Test status: " + (titleIsCorrect ? "Passed" : "Failed"));

            // End the session
            driver.quit();

			/*
			 * } catch (Exception e) { // Handle any exceptions that occur
			 * e.printStackTrace(); }
			 */
    }
}
