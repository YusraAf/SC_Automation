package org.practice.webtest.regression;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.practice.webtest.core.Browser;
import org.practice.webtest.core.PropertyLoader;
import org.practice.webtest.pages.Dashboard;
import org.practice.webtest.pages.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class RegressionStepDefinition {
	
	private WebDriver driver;
	private Login loginPage;
	private Dashboard dashboard;
	private double amount;
	private String getUserFirstName(String email) {
		return "Zenubia";
	}
	
	public RegressionStepDefinition() {
		try {
			PropertyLoader.loadDefaultProperties();			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initiateABrowser() {
		driver=Browser.getInstance();
	}
	
	@Given("^I want to invest (.+) AED in a Property$")
	
	public void investInProperty(double amount) {
		this.amount=amount;
		System.out.println("Amount: "+ amount);
	}
	
	@When("^I login as (.+) and password (.+)$")
	
	public void loginAs(String username, String password) {
		initiateABrowser();
		loginPage = new Login(driver);
		loginPage.initElement();
		loginPage.txt_username.clear();
		loginPage.txt_username.sendKeys(username);
		loginPage.txt_password.clear();
		loginPage.txt_password.sendKeys(password);
		loginPage.btn_login.click();
		
		dashboard = new Dashboard(loginPage.getDriver());
		dashboard.initElement();
		Assert.assertEquals("Failed Login", getUserFirstName(username)+dashboard.getPageLoadText(), dashboard.lbl_dashboardLabel.getText());
	}
	
	public void testPropertyLoader() {
		System.out.println(System.getProperty("app.url"));
	}
}
