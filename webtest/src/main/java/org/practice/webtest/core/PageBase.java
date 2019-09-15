package org.practice.webtest.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

	private String title;
	
	private WebDriver driver;
	
	private String link;
	
	private String pageLoadText;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPageLoadText() {
		return pageLoadText;
	}

	public void setPageLoadText(String pageLoadText) {
		this.pageLoadText = pageLoadText;
	}

	public PageBase(WebDriver driver) {
		this.driver = driver;
	}
	
	/*** 
	 * Incase we need support for before constructor , we need to add driver constructor.
	 */
	private PageBase() {
		
	}
	
	public void initElement() {
		initElement(this);
	}
	
	public <AnyPage extends PageBase> AnyPage initElement(AnyPage apage) {
		PageFactory.initElements(driver, apage);
		
		return apage;
	}
	
	
}
