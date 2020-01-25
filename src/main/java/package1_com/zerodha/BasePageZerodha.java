package package1_com.zerodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePageZerodha 
{
	/**
	 * @author Rajesh
	 */
	
	//Declaration
	public static WebDriver driver;
	public LoginPageZerodha objLogin;
	public PinLoginPageZerodha objPin;
	public HomePageZerodha objHome;
	
	
	public static void openBroweser(String url)
	{
		ChromeOptions chroOption=new ChromeOptions();
		chroOption.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		driver=new ChromeDriver(chroOption);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//return driver;
	}
	
}
