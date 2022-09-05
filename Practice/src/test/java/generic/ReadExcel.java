package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements IConstant{
	public String getDataFromExcel(String sname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Ex_Path);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sname).getRow(rowno).getCell(cellno).toString();
	}
}
