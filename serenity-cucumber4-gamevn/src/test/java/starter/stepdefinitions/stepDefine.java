package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.Dashboard;
import pages.Homepage;

public class stepDefine {
	
	@Steps
	Homepage homepage;
	
	@Steps
	Dashboard dashboard;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		homepage.openHomePage();
		homepage.turnOffTelex();
	}

	@When("user open login form")
	public void user_open_login_form() {
		homepage.openLoginForm();
	}

	@When("user type username")
	public void user_type_username() {
		homepage.enterUsername();
	}

	@When("user type password")
	public void user_type_password() {
		homepage.enterPassword();
		homepage.clickLoginButton();
	}

	@Then("user can login")
	public void user_can_login() {
		dashboard.verifyLogin();;
	}

}
