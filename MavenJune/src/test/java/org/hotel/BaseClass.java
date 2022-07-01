 package org.hotel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
//***********************************************************************************************************
//																BROWSER LAUNCH METHODS
//browser launh setup onfiguration for chrome
public static void browserChrome (String url) {
	WebDriverManager.chromedriver().setup();
	 driver  = new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	}
//browser launh setup onfiguration for firefox
public void browserFirefox (String url) {
	WebDriverManager.firefoxdriver().setup();
	 driver  = new FirefoxDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	}
//browser launh setup onfiguration for edge
public void browserEdge (String url) {
	WebDriverManager.edgedriver().setup();
	 driver  = new EdgeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	}
//browser launh setup onfiguration for IE
public void browserIE (String url) {
	WebDriverManager.iedriver().setup();
	 driver  = new InternetExplorerDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	}
//browser launh setup onfiguration for opera
public void browserOpera (String url) {
	WebDriverManager.operadriver().setup();
	 driver  = new OperaDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
	}
//**************************************************************
//URL FETCHING METHODS
//get the url
public String getUrl () {
	String url = driver.getTitle();
	System.out.println("The URL of the webpage is:"+url);
	return url;
	}
//get current url
public String getLiveUrl () {
	String url = driver.getCurrentUrl();
	System.out.println("The URL of the current webpage is:"+url);
	return url;
	}
//***********************************************************************************************************************
//														WEBELEMENT LOCATOR METHODS
//finding locator by id
public WebElement findElementId (String id) {
	WebElement element = driver.findElement(By.id(id));
	return element;	
	}
//finding locator by name
public WebElement findElementName (String id) {
	WebElement element = driver.findElement(By.name(id));
	return element;	
	}
/*finding locator by XPATH using 
 * relative xpath 							syntax :  //tagname[@attributename = 'attributevalue']
 * relative xpath with index 				syntax :(//tagname[@attributename = 'attributevalue'])[index]
 * relative xpath with text 				syntax :  //tagname[text()='textvalue']
 * relative xpath with partial text 		syntax ://tagname[contains(text(),'partial text')
 * relative xpath with partial attribute 	syntax ://tagname[contains(@attributename,'partial attribute value')]
 */
public WebElement findElementXpath (String id) {
	WebElement element = driver.findElement(By.xpath(id));
	return element;	
	}
//************************************************************************************************************************
//										GETTING WEBPAGE TEXT FROM PAGE AND USER(attribute)
//get text from webpage
public String webText (WebElement element) {
	String text = element.getText();
	System.out.println("the text from the webage is :"+ text);
	return text;
	}
//get attribute from user
public String attributeInput(WebElement element) {
	String text = element.getAttribute("value");
	System.out.println("the user ented value is :"+ text);
	return text;	
	}
//**************************************************************************************************************************
//														NAVIGATION METHODS (to, back, forward, refresh)
/* navigation methods syntax : driver.navigate().back(); 
 * 							   driver.navigate().forward();
 * 							   driver.navigate().refresh();
 */
//open url using navigate
public void navigateUrl (String url) {
	driver.navigate().to(url);	
	}
//*********************************************************************************************************************************
//														SENDKEYS AND CLICK
//to use sendkeys
public static void sendValue(WebElement element, String text) {
	element.sendKeys(text);	
	}
//to click a button
public void clickButton(WebElement element) {
	element.click();	
	}
//************************************************************************************************************************************
//														ACTIONS CLASS METHODS (moveToElement, dragAndDrop, doubleClick, contextClick)
//always end the actions class command with .perform()

//move to element (use relative xpath with text to find)
public void mouseOver (WebDriver driver, WebElement element) {
	//ations class object creation
	 Actions actions = new Actions(driver);
	 actions.moveToElement(element).perform();
	}
//drag and drop from source to target
public void dragDrop (WebDriver driver, WebElement source, WebElement target) {
	//ations class object creation
	Actions actions = new Actions(driver);
	actions.dragAndDrop(source, target).perform();
	}
//double click
public void clickTwice(WebDriver driver, WebElement element) {
	//ations class object creation
	 Actions actions = new Actions(driver);
	 actions.doubleClick(element).perform();	
	}
//context click
public void rightClick(WebDriver driver, WebElement element) {
	//ations class object creation
	 Actions actions = new Actions(driver);
	 actions.contextClick(element).perform();
	 }
//********************************************************************************************************************************************
//									 			ALERT METHODS (accept, dismiss, alert sendkeys, alert get text)

/*finding the locator of the alert webelement is impossible hence we use methods with alert
 * Simple alert 	- with just an OK button
 * confirm alert	- with OK & CANCEL buttons
 * prompt alert		- with text box to enter text and OK & CANCEL buttons
*/
//sendkeys for alert box
public void alertSendKeys (WebDriver driver, String text) {
	Alert alert = driver.switchTo().alert();
	alert.sendKeys(text);
	}
//get text from alert box
public String alertGetText (WebDriver driver) {
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	return text;
	}
//clik OK on alert box 
public void alertAccept (WebDriver driver) {
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
//clik CANCEL on alert box 
public void alertCancel (WebDriver driver) {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	}
//************************************************************************************************************************
// 															DATA RETRIEVAL FROM EXCEL


}