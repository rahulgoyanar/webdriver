package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class projectAndcustomerTest {
	@Test
	public void CreateCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
		// get location of file excel
		String fileloc = "C:\\Users\\rahul\\Documents\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(fileloc);
		// open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		// get control to sheet1
		Sheet sh = wb.getSheet("sheet1");
		// get control to 1 row
		Row row = sh.getRow(1);
		// get control to 2 cell
		String username = row.getCell(1).getStringCellValue();
		double password = row.getCell(2).getNumericCellValue();
		String customername = row.getCell(3).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		System.out.println(customername);

	}
	
}
