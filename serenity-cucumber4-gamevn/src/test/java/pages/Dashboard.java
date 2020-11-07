package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
	DashboardAction dashAction;
	
	@Step
	public void verifyLogin() {
		dashAction.verifyLogin();
		System.out.println("Demo code new");
	}
	
	// vi du file nay da edit xong nhe

}
