package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cucumberSteps {
	WebDriver driver;

	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Then("^navigate the url$")
	public void navigate_the_url() throws Throwable {
		driver.navigate().to("https://facebook.com");
	}

	@Then("^enter (.*) and (.*)$")
	public void enter_username_password(String username, String password) throws Throwable {
		System.out.println("scenario 1" + username + " and " + password);
	}

}
