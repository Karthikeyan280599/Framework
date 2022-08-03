package org.hotelapp;

import java.io.IOException;

import org.adactin.Baseclass1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pom.BookHotelPage;
import Pom.BookingConfirmationPage;
import Pom.CancelBookingPage;
import Pom.LoginPage;
import Pom.SearchHotelPage;
import Pom.SelectHotelPage;

public class Adactin1 extends Baseclass1 {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}
	@Before
	public void beforemethod() {
		long time = System.currentTimeMillis();
		System.out.println(time);
	}
	@Test
	//1)Login Page
	public void Login() throws IOException, InterruptedException {
	LoginPage lp = new LoginPage();
	lp.login(getData("Data", 1, 0),getData("Data", 1, 1));
    
    //2)SearchHotelPage
    SearchHotelPage searchHotelPage=new SearchHotelPage();
    Assert.assertEquals("verify welcome message", "Hello KarthiKathiresan1999!",getAttribute(searchHotelPage.getTxtWelcomemsg(), "value"));
    searchHotelPage.SearchHotel(getData("Data", 1, 2),getData("Data", 1, 3),getData("Data", 1, 4),getData("Data", 1, 5),getData("Data", 1, 6),getData("Data", 1, 7),getData("Data", 1, 8),getData("Data", 1, 9));
    
	//3)SelectHotelPage
    SelectHotelPage selectHotelPage=new SelectHotelPage();
    Assert.assertEquals("verify Select Hotel", "Select Hotel", getText(selectHotelPage.getSelectTxt()));
    selectHotelPage.SelectHotel();
    
    //4)BookHotelPage
    BookHotelPage bookHotelPage=new BookHotelPage();
    Assert.assertEquals("verify Book a Hotel", "Back", getText(bookHotelPage.getSelectTitle()));

    bookHotelPage.BookHotel(getData("Data", 1, 10), getData("Data", 1, 11),  getData("Data", 1, 12), getData("Data", 1, 13), getData("Data", 1, 14), getData("Data", 1, 15), getData("Data", 1, 16), getData("Data", 1, 17));
     
	//5)BookingConfirmationPage
    BookingConfirmationPage bookingConfirmationPage=new BookingConfirmationPage();
    Assert.assertEquals("verify Booking Confirmation", "Booking Confirmation"
    		, getText(bookingConfirmationPage.getSelectBooking()));

    bookingConfirmationPage.BookingConfirmation();
    //6)CancelBookingPage
    
    CancelBookingPage cancelBookingPage=new CancelBookingPage();
    cancelBookingPage.CancelBooking();
    
	}  
    @After
    public void afterMethod() {
    	long currentTimeMillis = System.currentTimeMillis();
    	System.out.println(currentTimeMillis);
    }
    
      

}
