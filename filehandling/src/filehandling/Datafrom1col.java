package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Datafrom1col {
	@Test
	public void CreateCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException {

		String fileloc = "C:\\Users\\rahul\\Documents\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(fileloc);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		int Rowcount = sh.getLastRowNum();
		for (int i = 0; i < Rowcount; i++) {
			Row row = sh.getRow(i);
			String data = row.getCell(0).getStringCellValue();
			System.out.println(data);
		}

	}
}