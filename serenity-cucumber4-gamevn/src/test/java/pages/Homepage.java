package pages;

import net.thucydides.core.annotations.Step;

public class Homepage {
	
	HomepageAction homeAction;
	
	@Step
	public void openHomePage() {
		homeAction.open();
	}
	
	@Step
	public void turnOffTelex() {
		homeAction.turnOffTelex();
	}
	
	@Step
	public void openLoginForm() {
		homeAction.openLoginForm();
	}
	
	@Step
	public void enterUsername() {
		homeAction.typeUsername();
	}
	
	@Step
	public void enterPassword() {
		homeAction.typePassword();
	}
	
	@Step
	public void clickLoginButton() {
		homeAction.clickLoginButton();
	}

}
