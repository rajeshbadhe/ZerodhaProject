package package1_com.zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageZerodha 
{
	@FindBy(xpath="//span[@class='nickname']") private WebElement eleNickname;
	@FindBy(xpath="//a[@class='dropdown-label']") private WebElement eleDrop;
	@FindBy(xpath="//a[@target='_self']") private WebElement elelogout;
	
	public HomePageZerodha(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logoutHomePageZerodha(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(eleDrop).click().build().perform();
		
		act=new Actions(driver);
		act.moveToElement(elelogout).perform();
		act.click(elelogout).perform();
	}

	public WebElement checkUserNicknameHomePageZerodha() 
	{
		return eleNickname;
	}
	
	
}
