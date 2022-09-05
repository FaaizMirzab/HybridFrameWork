package driverForGeneric;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.ReadExcel;
import pom.Login;

public class Launch extends BaseTest {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		Login lg=new Login(driver);
		ReadExcel re=new ReadExcel();
		lg.setUserName().sendKeys(re.getDataFromExcel("Sheet1",0,0));
		lg.setPassword().sendKeys(re.getDataFromExcel("Sheet1", 0,1));
		lg.LoginBtn().click();
	}
}
