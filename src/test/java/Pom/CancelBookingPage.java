package Pom;

import java.io.IOException;


import org.adactin.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends Baseclass1 {
	public void CancelHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement HotelId;
	@FindBy(id="search_hotel_id")
	private WebElement btnClick;
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement Cancel;
	@FindBy(className="reg_error")
    private WebElement txtBookingCancelled;
	
	public WebElement getHotelId() {
		return HotelId;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getTxtBookingCancelled() {
		return txtBookingCancelled;
	}

	public WebElement getCancel() {
		return Cancel;
	}
	
	public void CancelBooking() throws IOException {
	String data2 = getData("Data", 1, 18);
	type(getHotelId(), data2);
	click(btnClick);
	click(Cancel);
	
	alertAccept();
		
		
	}



}
