package org.practice.webtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.practice.webtest.core.PageBase;

public class Dashboard extends PageBase{

	public Dashboard(WebDriver driver) {
		super(driver);
		this.setLink("dashboard-smart-crowd");
		this.setPageLoadText("’s ODashboard");
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/jhi-dashboard-smart-crowd[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	public WebElement lbl_dashboardLabel;
	
}
