package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	@Before
	public void initializeTest() {
		System.out.println("opening the app");
	}
	
	@After
	public void teardownTest() {
		System.out.println("close the browser");
	}
	
	

}
