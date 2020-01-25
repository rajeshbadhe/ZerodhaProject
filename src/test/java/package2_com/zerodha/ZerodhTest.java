package package2_com.zerodha;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import package1_com.zerodha.BasePageZerodha;
import package1_com.zerodha.HomePageZerodha;
import package1_com.zerodha.LoginPageZerodha;
import package1_com.zerodha.PinLoginPageZerodha;
import package1_com.zerodha.UtilityCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class ZerodhTest extends BasePageZerodha
{
	int TestID;
	
	@Test(priority=1)
	public void openBrowserAndApplication() throws Exception 
	{
		TestID=101;
		openBroweser(UtilityCode.readDataFromExcelSheet("URL", 1, 0));
		Thread.sleep(2000);		
	}

	@Test(priority=2)
	public void isApplicationOpen()
	{
		TestID=102;
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isDisplayed());
	}
	
	@Test(priority=3)
	public void setUNMethod() throws Exception
	{
		TestID=103;
		objLogin=new LoginPageZerodha(driver);
		WebElement ele=objLogin.setUNLginPageZerodha(UtilityCode.readDataFromExcelSheet("Credential", 2, 1));
		Thread.sleep(2000);
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertNotNull(ele);
	
	}
	
	@Test(priority=4)
	public void setPwdMethod() throws Exception
	{
		Thread.sleep(2000);
		TestID=104;
		WebElement ele=objLogin.setPWDLoginPageZerodha(UtilityCode.readDataFromExcelSheet("Credential", 2, 2));
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertNotNull(ele);
	}
	
	@Test(priority=5)
	public void clickLoginMethod() throws Exception
	{
		TestID=105;
		objLogin.clickLoginButtonLoginPageZerodha();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//input[@label='PIN']")).isDisplayed(), true);
	}
	
	@Test(priority=6)
	public void setPinMethod() throws Exception
	{
		TestID=106;
		objPin=new PinLoginPageZerodha(driver);
		WebElement ele=objPin.setPinPinPageZerodha(UtilityCode.readDataFromExcelSheet("Credential", 2, 3));
		Thread.sleep(2000);
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertNotNull(ele);			
	}
	
	@Test(priority=7)
	public void clickContinueButton() throws Exception
	{
		TestID=107;
		objPin.clickContinueButton();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='nickname']")).isDisplayed());
	}
	
	@Test(priority=8)
	public void checkUserNickname() throws Exception
	{
		TestID=108;
		objHome=new HomePageZerodha(driver);
		Thread.sleep(2000);
		WebElement ele=objHome.checkUserNicknameHomePageZerodha();
		Assert.assertEquals(ele.getText(), UtilityCode.readDataFromExcelSheet("Credential", 2, 0));
	}
	
	@Test(priority=9)
	public void clickLogout() throws Exception
	{
		TestID=109;
		objHome.logoutHomePageZerodha(driver);
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed());
	}
	
	@AfterMethod
	public void checkTestResultforScreenshot(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityCode.takeScreenshot(driver, TestID);
		}
	}
	
	@AfterClass
	public void afterClass() throws Exception 
	{
		Thread.sleep(6000);
		driver.quit();
		//sAssert=null;
	}

}
