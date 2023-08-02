package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterDefination extends BaseClass{

	@Given("User open Register Page url on {string} browser")
	public void user_open_register_page_url_on_browser(String browsername) {
	    initilization(browsername);
	}

	@When("User Enter valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} click on submit button")
	public void user_enter_valid_and_and_and_and_and_and_and_click_on_submit_button(String fname, String lname, String email, String reemail, String password, String date, String month, String year) {
		RegisterPage reg=new RegisterPage();
		reg.RegisterFunctinality(fname, lname, email, reemail, password, date, month, year);
	}
	@After
	public static void screenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] ts=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ts, "image/png", scenario.getName());
		}
		else {
			byte[] ts1=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ts1, "image/png", scenario.getName());
		}
	}
}
