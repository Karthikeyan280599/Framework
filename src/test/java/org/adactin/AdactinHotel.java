package org.adactin;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotel extends Baseclass1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Baseclass1 baseclass = new Baseclass1();

		baseclass.getDriver();

		baseclass.loadUrl("https://adactinhotelapp.com/");

		baseclass.maximize();

		WebElement txtUserName = baseclass.findElementById("username");
		String data = baseclass.getData(
				"Data", 1,
				0);
		baseclass.type(txtUserName, data);
		
		WebElement txtPassword = baseclass.findElementById("password");
		String pass = baseclass.getData(
				"Data", 1,
				1);
		baseclass.type(txtPassword, pass);
		
		WebElement login = baseclass.findElementById("login");
		baseclass.click(login);
		
		WebElement location = baseclass.findElementById("location");
		baseclass.selectByIndex(location, 2);
		
		WebElement hotels = baseclass.findElementById("hotels");
		baseclass.selectByIndex(hotels, 2);
		
		WebElement roomtype = baseclass.findElementById("room_type");
		baseclass.selectByIndex(roomtype, 1);
		
		WebElement rooms = baseclass.findElementById("room_nos");
		baseclass.selectByIndex(rooms, 3);
		
		WebElement Checkin = baseclass.findElementById("datepick_in");
		String data2 = baseclass.getData("Data", 1, 6);
		baseclass.type(Checkin, data2);
		
		WebElement CheckOut = baseclass.findElementById("datepick_out");
		String data3 = baseclass.getData("Data", 1, 7);
		baseclass.type(CheckOut, data3);
		
		WebElement adult = baseclass.findElementById("adult_room");
		baseclass.selectByIndex(adult, 3);
		
		WebElement child = baseclass.findElementById("child_room");
		baseclass.selectByIndex(child, 1);
		
		WebElement search = baseclass.findElementById("Submit");
		baseclass.click(search);
		
		WebElement radiobutton = baseclass.findElementById("radiobutton_0");
		baseclass.click(radiobutton);
		
		WebElement element = baseclass.findElementById("continue");
		baseclass.click(element);
		
		WebElement FirstName = baseclass.findElementById("first_name");
		String data1 = baseclass.getData(
				"Data", 1,
				10);
		baseclass.type(FirstName, data1);
		
		WebElement LastName = baseclass.findElementById("last_name");
		String dataa = baseclass.getData(
				"Data", 1,
				11);
		baseclass.type(LastName, dataa);
		
		WebElement Address = baseclass.findElementById("address");
		String add = baseclass.getData(
				"Data", 1,
				12);
		baseclass.type(Address, add);
		
		WebElement Card = baseclass.findElementById("cc_num");
		String Cno = baseclass.getData(
				"Data", 1,
				13);
		baseclass.type(Card, Cno);
		
		WebElement CardType = baseclass.findElementById("cc_type");
		baseclass.selectByIndex(CardType, 2);
		
		WebElement Month = baseclass.findElementById("cc_exp_month");
		baseclass.selectByIndex(Month, 5);
		
		WebElement Year = baseclass.findElementById("cc_exp_year");
		baseclass.selectByIndex(Year, 12);
		
		WebElement CVV = baseclass.findElementById("cc_cvv");
		String Cvv = baseclass.getData(
				"Data", 1,
				16);
		baseclass.type(CVV, Cvv);
		
		WebElement element1 = baseclass.findElementById("book_now");
		baseclass.click(element1);
		
		baseclass.Sleep(15000);
		
         WebElement OrderNo = baseclass.findElementById("order_no");
		 String attribute = baseclass.getText(OrderNo);
		 
		 System.out.println(attribute);
		 
baseclass.writeData("Data", 1,17, attribute);	   
		  
		


		
		
	}


}
