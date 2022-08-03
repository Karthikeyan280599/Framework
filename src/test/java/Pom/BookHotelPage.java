package Pom;

import org.adactin.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Baseclass1 {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login_title")
	private WebElement SelectTitle;
	
	public WebElement getSelectTitle() {
		return SelectTitle;
	}

	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CardNumber;
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CvvNumber;
	
	@FindBy(id="book_now")
	private WebElement BookNow;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	public void BookHotel(String FirstName,String LastName,String Address,String CardNumber,String CardType,String ExpiryMonth,String ExpiryYear,String CvvNumber) throws InterruptedException{
	type(getFirstName(), FirstName);
	type(getLastName(), LastName);
	type(getAddress(), Address);
	type(getCardNumber(), CardNumber);
	SelectByVisibleText(getCardType(), CardType);
	SelectByVisibleText(getExpiryMonth(), ExpiryMonth);
	SelectByVisibleText(getExpiryYear(), ExpiryYear);
	type(getCvvNumber(), CvvNumber);
	click(getBookNow());
	Sleep(10000);
	}
	
	

}
