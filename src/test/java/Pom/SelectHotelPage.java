package Pom;

import org.adactin.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends Baseclass1 {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement SelectTxt;

	public WebElement getSelectTxt() {
		return SelectTxt;
	}

	@FindBy(id="radiobutton_0")
	private WebElement RadioButton;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	public void SelectHotel() throws InterruptedException {
    Sleep(3000);
	click(getRadioButton());
	click(getContinue());
	
	}


}
