package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import base.Setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class stepDefination extends Setup {
	public static String email;
	public static String password;
	public static String envData ;
	public static String driverType;
	public static String url;

	@Before
	public void startTest() { // happen before each test scenario
		driverType = "ch";
		envData = "prd";
		driver = setupBrowser(driverType);
		switch (envData) {
		case "qa":
			url = "http://demo.guru99.com/test/newtours/register.php";
			break;
		case "stg":
			url = "https://www.google.com/";
			break;
		case "prd":
			url = "https://www.makemytrip.com/";

			break;

		}
		driver.get(url);
	}

	@After
	public void endTest(Scenario scenario) {

		if (scenario.isFailed()) {
			Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
		}
		driver.quit();
	}

}
