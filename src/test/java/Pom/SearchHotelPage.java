package Pom;

import org.adactin.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Baseclass1 {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username_show")
	private WebElement txtWelcome;
	public WebElement getTxtWelcomemsg() {
		return txtWelcome;
	}

	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id ="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRooomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnNoofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnNoofAdultsRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnNoofChildrensRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRooomType() {
		return dDnRooomType;
	}

	public WebElement getdDnNoofRooms() {
		return dDnNoofRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnNoofAdultsRoom() {
		return dDnNoofAdultsRoom;
	}

	public WebElement getdDnNoofChildrensRoom() {
		return dDnNoofChildrensRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public void SearchHotel(String Location,String Hotels,String RoomType,String  NoofRooms,String CheckInDate,String CheckOutDate,String AdultsPerRoom,String ChildrensPerRoom ) {
	 selectOptionByText(getdDnLocation(), Location);
     SelectByVisibleText(getdDnHotels(), Hotels);
	 SelectByVisibleText(getdDnRooomType(), RoomType);
	 SelectByVisibleText(getdDnNoofRooms(), NoofRooms);
	 type(getTxtCheckInDate(), CheckInDate);
	 type(getTxtCheckOutDate(), CheckOutDate);
	 SelectByVisibleText(getdDnNoofAdultsRoom(), AdultsPerRoom);
	 SelectByVisibleText(getdDnNoofChildrensRoom(), ChildrensPerRoom);
	 click(getBtnSubmit());
	 
	}
	

}
