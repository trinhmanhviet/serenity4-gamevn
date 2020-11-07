package pages;

import net.thucydides.core.pages.PageObject;

public class DashboardAction extends PageObject{
	
	public void verifyLogin() {
		System.out.println(getDriver().getTitle());
	}

}
