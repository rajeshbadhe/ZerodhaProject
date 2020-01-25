package package1_com.zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageZerodha 
{
	 @FindBy(xpath="//input[@type='text']") private WebElement eleUN;
	 @FindBy(xpath="//input[@type='password']") private WebElement elePWD;
	 @FindBy(xpath="//button[text()='Login ']") private WebElement eleButton;
	 
	 public LoginPageZerodha(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public WebElement setUNLginPageZerodha(String strUN)
	 {
		 
		 eleUN.sendKeys(strUN);
		return eleUN;
	 }
	 
	 
	 public WebElement setPWDLoginPageZerodha(String strPWD)
	 {
		 elePWD.sendKeys(strPWD);
		return elePWD;
	 }
	 
	 
	 public void clickLoginButtonLoginPageZerodha()
	 {
		 eleButton.click();
	 }
	 
}
