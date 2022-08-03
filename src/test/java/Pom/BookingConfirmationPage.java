package Pom;

import java.io.IOException;

import org.adactin.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends Baseclass1 {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="login_title")
	private WebElement SelectBooking;


	public WebElement getSelectBooking() {
		return SelectBooking;
	}
	@FindBy(id = "order_no")
	private WebElement OrderNumber;

	@FindBy(xpath = "//a[contains(@href,'BookedItinerary.php')]")
	private WebElement BookedItinerary;

	public WebElement getOrderNumber() {
		return OrderNumber;
	}

	public WebElement getBookedItinerary() {
		return BookedItinerary;
	}

	public void BookingConfirmation() throws IOException {
String attributeValue = getAttributeValue(getOrderNumber(), "value");
		writeData("Data", 1, 18, attributeValue);
		click(getBookedItinerary());
	}


}
