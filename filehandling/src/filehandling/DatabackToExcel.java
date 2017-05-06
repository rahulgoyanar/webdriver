package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DatabackToExcel {
	@Test
	public void CreateCustomerTest() throws EncryptedDocumentException, InvalidFormatException, IOException {
		// get location of file excel
		String fileloc = "C:\\Users\\rahul\\Documents\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(fileloc);
		// open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		// get control to sheet1
		Sheet sh = wb.getSheet("sheet1");
		Row row = sh.getRow(1);
		Cell col = row.createCell(4);
		col.setCellType(col.CELL_TYPE_STRING);

		// open workbook in write mode
		FileOutputStream fos = new FileOutputStream(fileloc);
		col.setCellValue("PASS");
		wb.write(fos);
		wb.close();
	}

}
