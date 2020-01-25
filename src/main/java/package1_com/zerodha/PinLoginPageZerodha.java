package package1_com.zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinLoginPageZerodha 
{
	@FindBy(xpath="//input[@label='PIN']") private WebElement elePin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement eleButton;
	
	public PinLoginPageZerodha(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement setPinPinPageZerodha(String strPin)
	{
		elePin.sendKeys(strPin);
		return elePin;
	}
	
	public void clickContinueButton()
	{
		eleButton.click();
	}
}
