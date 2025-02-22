package SauceLabs.Slk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import java.net.URL;

public class parallelbase {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        // Hub URL where the grid is running
        URL gridUrl = new URL("http://localhost:4444/wd/hub");
        
        // Desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities(); // For Chrome, you can change it for Firefox, Safari, etc.
        capabilities.setBrowserName("chrome");
        
        // RemoteWebDriver instance
        driver = new RemoteWebDriver(gridUrl, capabilities);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
