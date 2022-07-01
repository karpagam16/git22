package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPomOne extends BaseClass {
	//constructor
	public LoginPomOne() {
		PageFactory.initElements(driver, this);
	}
@CacheLookup
@FindBys({
	@FindBy(id="email"),
	@FindBy(xpath="//input[@id='email']")
})
private WebElement username;
public WebElement getUsername() {
	return username;
}
@FindAll({
	@FindBy(id="pass"),
	@FindBy(xpath="//input[@id='email']") 
})
private WebElement password;
public WebElement getPassword() {
	return password;
}
@FindBy(linkText="Create a Page")
private WebElement clickpage;
public WebElement getClickpage() {
	return clickpage;
}

}
