package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
	DashboardAction dashAction;
	
	@Step
	public void verifyLogin() {
		dashAction.verifyLogin();
	}

}
