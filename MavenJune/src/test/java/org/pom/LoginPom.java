package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class LoginPom extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		//calling basclass methods
		BaseClass b = new BaseClass();
	b.browserChrome("https://en-gb.facebook.com/");	
	LoginPomOne a = new LoginPomOne();
	WebElement username = a.getUsername();
	username.sendKeys("ganapathy");
	WebElement password = a.getPassword();
	password.sendKeys("1234556");
	driver.navigate().refresh();
	username.sendKeys("GANAPATHY");
	Thread.sleep(3000);
	WebElement clickpage = a.getClickpage();
	clickpage.click();
	driver.quit();
	}
}
