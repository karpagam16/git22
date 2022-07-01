package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hi {
public static void main(String[] args) {
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("https://adactinhotelapp.com/");
 	driver.manage().window().maximize();
 		WebElement username = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input[@name='username']"));
 			username.sendKeys("karpagam2");
 		WebElement password = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/form/table/tbody/tr[3]/td[2]/input[@name='password']"));
 			password.sendKeys("karpagam2");
 		WebElement login = driver.findElement(By.xpath("//table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input[@name='login']"));
 			login.click();
	}
}
