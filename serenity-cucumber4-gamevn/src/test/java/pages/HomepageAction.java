package pages;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

public class HomepageAction extends PageObject{
	
	public void turnOffTelex() {
		$(By.id("mudim-off")).click();
	}
	
	public void openLoginForm() {
		//$(By.xpath("//a[@class='concealed noOutline'][@href='login/']")).click();
		$(By.xpath("//a[@class='concealed noOutline'][@href='login/']")).click();
	}
	
	public void typeUsername() {
		$(By.id("LoginControl")).type("Scorpion06");
	}
	
	public void typePassword() {
		$(By.id("ctrl_password")).type("kungfu");
	}
	
	public void clickLoginButton() {
		$(By.xpath("//input[@class='button primary']")).click();
	}
	

}
