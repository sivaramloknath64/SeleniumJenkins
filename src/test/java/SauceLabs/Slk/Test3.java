package SauceLabs.Slk;

import org.testng.annotations.Test;

public class Test3 extends parallelbase{
    
    @Test
    public void testtExample() {
        driver.get("https://www.google.com");
        // Your test steps here
        driver.getTitle();
        System.out.println(	driver.getTitle());
    	
        
        
    }
    

}
