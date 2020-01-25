package package1_com.zerodha;


import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityCode 
{
	
	public static String readDataFromExcelSheet(String strSheet,int intRow, int intCell) throws Exception
	{
		FileInputStream file=new FileInputStream(".//testData//ZeroDhaTestData.xls");
		String strURL= WorkbookFactory.create(file).getSheet(strSheet).getRow(intRow).getCell(intCell).getStringCellValue();
		return strURL;
	}
	
	public static void takeScreenshot(WebDriver driver, int TestID) throws Exception
	{
		File fileSrc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(fileSrc, new File("./failedTestScreenshot/ScreenshotTest"+TestID+".png"));
				
	}
}
