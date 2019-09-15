package org.practice.webtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.practice.webtest.core.PageBase;

public class Login extends PageBase{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="username")
	@CacheLookup
	public WebElement txt_username;
	@FindBy(id="password")
	@CacheLookup
	public WebElement txt_password;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/jhi-home[1]/div[1]/div[1]/div[1]/form[1]/label[1]/span[1]/a[1]")
	@CacheLookup
	public WebElement link_forget_password;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/jhi-home[1]/div[1]/div[1]/div[1]/form[1]/button[1]")
	@CacheLookup
	public WebElement btn_login;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/jhi-home[1]/div[1]/div[1]/div[1]/form[1]/div[5]/a[1]")
	@CacheLookup
	public WebElement link_create_account;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/jhi-home[1]/div[1]/div[1]/div[1]/form[1]/div[1]")
	@CacheLookup
	public WebElement lbl_login;
	

}
