
package newTourTravel.stepsFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import newTourTravel.LoginPage;

public class Login {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"M:\\CucumberFramework\\NewTourTravel\\src\\test\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);

	}

	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;

	}

	@Given("^User navigates to NewTour Travel and Tour$")
	public void user_navigates_to_NewTour_Travel_and_Tour() throws Throwable {
		driver.get("http://newtours.demoaut.com/");

	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		LoginPage Login = new LoginPage(driver);
		Login.Login_Application();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		boolean signOff = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		AssertJUnit.assertTrue(signOff);

		if (driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()) {
			System.out.println("Home Page is Displayed");

		} else {
			System.out.println("Home Page is not displayed");
		}
	}

}
