package SauceLabs.Slk;

import org.testng.annotations.Test;

public class Test1 extends parallelbase{
	
	 @Test
	    public void testExample() {
	        driver.get("https://www.facebook.com");
	        // Your test steps here
	        driver.getTitle();
	        System.out.println(	driver.getTitle());
	    	
	    }
	    

}
