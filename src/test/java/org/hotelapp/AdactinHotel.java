package org.hotelapp;

import java.io.IOException;

import org.adactin.Baseclass1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinHotel extends Baseclass1{
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
	public void test() throws IOException, InterruptedException {
		WebElement txtUserName = findElementById("username");
		String data = getData("Data", 1, 0);
		type(txtUserName, data);

		WebElement txtPassword = findElementById("password");
		String pass = getData("Data", 1, 1);
		type(txtPassword, pass);

		WebElement login = findElementById("login");
		click(login);
		WebElement txtmsg = findElementById("username_show");
		String txtmsg1 = getText(txtmsg);
		Assert.assertEquals("Verify the Username", "Hello KarthiKathiresan1999!", txtmsg1);

		WebElement location = findElementById("location");
		selectByIndex(location, 2);

		WebElement hotels = findElementById("hotels");
		selectByIndex(hotels, 2);

		WebElement roomtype = findElementById("room_type");
		selectByIndex(roomtype, 1);

		WebElement rooms = findElementById("room_nos");
		selectByIndex(rooms, 3);

		WebElement Checkin = findElementById("datepick_in");
		String data2 = getData("Data", 1, 6);
		type(Checkin, data2);

		WebElement CheckOut = findElementById("datepick_out");
		String data3 = getData("Data", 1, 7);
		type(CheckOut, data3);

		WebElement adult = findElementById("adult_room");
		selectByIndex(adult, 3);

		WebElement child = findElementById("child_room");
		selectByIndex(child, 1);

		WebElement search = findElementById("Submit");
		click(search);

		WebElement txt = findElementByXpath("//td[text()='Select Hotel ']");
		String txt7 = getText(txt);
		Assert.assertEquals("Verify Select Hotel", "Select Hotel", txt7);

		WebElement radiobutton = findElementById("radiobutton_0");
		click(radiobutton);

		WebElement element = findElementById("continue");
		click(element);

		WebElement txt5 = findElementByXpath("//td[text()='Book A Hotel ']");
		String txt2 = getText(txt5);
		Assert.assertEquals("Verify Book a  Hotel ", "Book A Hotel", txt2);

		WebElement FirstName = findElementById("first_name");
		String data1 = getData("Data", 1, 10);
		type(FirstName, data1);

		WebElement LastName = findElementById("last_name");
		String dataa = getData("Data", 1, 11);
		type(LastName, dataa);

		WebElement Address = findElementById("address");
		String add = getData("Data", 1, 12);
		type(Address, add);

		WebElement Card = findElementById("cc_num");
		String Cno = getData("Data", 1, 13);
		type(Card, Cno);

		WebElement CardType = findElementById("cc_type");
		selectByIndex(CardType, 2);

		WebElement Month = findElementById("cc_exp_month");
		selectByIndex(Month, 5);

		WebElement Year = findElementById("cc_exp_year");
		selectByIndex(Year, 12);

		WebElement CVV = findElementById("cc_cvv");
		String Cvv = getData("Data", 1, 16);
		type(CVV, Cvv);

		WebElement element1 = findElementById("book_now");
		click(element1);
		
		Sleep(5000);

		WebElement txt6 = findElementByXpath("//td[text()='Booking Confirmation ']");
		String txt3 = getText(txt6);
		Assert.assertEquals("Verify Booking Confirmation", "Booking Confirmation", txt3);

		Sleep(15000);

		WebElement OrderNo = findElementById("order_no");
		String attribute = getText(OrderNo);
		System.out.println(attribute);

		writeData("Data", 1, 17, attribute);
         Sleep(10000);
		WebElement txt12 = findElementByXpath("//a[text()='Booked Itinerary']");
		String txt8 = getText(txt12);
		Assert.assertEquals("Verify Booking Itinerary", "Booked Itinerary", txt8);
		click(txt12);
		
		WebElement txtbox = findElementById("order_id_text");
		String data4 = getData("Data", 1, 17);
		type(txtbox, data4);
		
		Sleep(2000);
		
		WebElement hotel = findElementById("search_hotel_id");
		click(hotel);
		
		Sleep(3000);
		
		WebElement cancel = findElementByXpath("(//input[@type='button'])[1]");
		click(cancel);
		
        Sleep(2000);
        
        
        alertAccept();
	}


}
