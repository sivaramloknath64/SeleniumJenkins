package SauceLabs.Slk;

import org.testng.annotations.Test;

public class Test2 extends parallelbase {
	
	@Test
	public void Example() {
		driver.get("https://www.instagram.com");
		// Your test steps here
	System.out.println(	driver.getTitle());
		

	}

}
