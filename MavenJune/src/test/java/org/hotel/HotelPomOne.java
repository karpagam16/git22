package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPomOne extends BaseClass {
	public HotelPomOne() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input[@name='username']")
	private WebElement username;
    public WebElement getUsername() {
		return username;
	}
    @FindBy(xpath="//table[2]/tbody/tr/td[2]/form/table/tbody/tr[3]/td[2]/input[@name='password']")
    private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input[@name='login']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
    
}
