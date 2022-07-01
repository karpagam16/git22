package org.hotel;

public class HotelPom extends BaseClass {
	public static void main(String[] args) {
		HotelPomOne a = new HotelPomOne();
	    browserChrome("https://adactinhotelapp.com/");
		a.getUsername().sendKeys("karpagam2");
		a.getPassword().sendKeys("karpagam2");
		a.getLogin().click();
		
	}

}
