package org.practice.webtest.core;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
private static WebDriver driver;

public static void initBrowser() {
	cleanCookieCache();
	//fluent wait. It will keep the browser
	nullifyImplicitWait();
	setJSTimeOut(Long.valueOf(System.getProperty("js.wait")));
	setImplicitWait(Long.valueOf(System.getProperty("implicit.wait")));
	setSize();
}
private static void cleanCookieCache() {
driver.manage().getCookies().clear();
driver.manage().deleteAllCookies();
}

public static void nullifyImplicitWait() {
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
}
public static void setJSTimeOut(long sec) {
	driver.manage().timeouts().setScriptTimeout(sec, TimeUnit.SECONDS);
}
public static void setImplicitWait(long newWaittime_InSeconds) {
	driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
}

public static void setSize() {
	if("false".equals(System.getProperty("browser.maximize"))) {
		driver.manage().window().setSize(new Dimension(
				Integer.valueOf(System.getProperty("browser.width")),
				Integer.valueOf(System.getProperty("browser.height"))));
	}
}

public static void resetImplicitWait() {
	driver.manage().timeouts().implicitlyWait(Long.valueOf(System.getProperty("implicit.wait")), TimeUnit.SECONDS);
}

public static void close() {
	driver.quit();
	driver=null;
}
public static WebDriver getInstance() {
	if(driver==null) {
		driver= getDefaultBrowser();
	}
	return driver;
}
private static WebDriver getDefaultBrowser() {
	return getABrowser(System.getProperty("browser.default"));
}
private static WebDriver getABrowser(final String browserName) {
	// TODO Auto-generated method stub
	if("chrome".equals(browserName)) {
		return initChrome();
	}else if ("firefox".equals(browserName)) {
		return initFirefox();
	}else if ("ie".equals(browserName)) {
		return initIE();
	}
	
	else {
		throw new RuntimeException("No valid Browser Found");
	}
}
private static WebDriver initIE() {
	// TODO Auto-generated method stub
	return null;
}
private static WebDriver initFirefox() {
	// TODO Auto-generated method stub
	return null;
}
private static WebDriver initChrome() {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	initBrowser();
	return driver;
}	
private static void clearChromeBrowserData() {
	driver.get("chrome://settings/clearBrowserData");
	driver.findElement(By.id("clearBrowsingDataConfirm")).click();
}
public static WebDriverWait setWebDriverWait(long sec) {
	WebDriverWait wait;
	if(Long.valueOf(System.getProperty("page.element.wait"))<sec) {
		wait=new WebDriverWait(driver, sec);
	}else {
		wait= new WebDriverWait(driver, Long.valueOf(System.getProperty("page.element.wait")));
	}
	
	return wait;
}
public static JavascriptExecutor getJs() {
    return (JavascriptExecutor) driver;
}

public static void runJs(final String js) {
    ((JavascriptExecutor) driver).executeScript(js);
}

public static void runJsAsync(final String js) {
    ((JavascriptExecutor) driver).executeAsyncScript(js);
}


}








