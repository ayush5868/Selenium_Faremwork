package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author AYUSH KUMAR
 */

public class ExcelUtility {
	
	/**
	 * This method will read data from property file and return value to the caller
	 * @parameter sheetname
	 * @parameter rowIndex
	 * @parameter colIndex
	 * @return value
	 * @throws IOException
	 * @throws EncryptedDocumentException
	*/
	
	public String getStringDataFromExcel(String sheetname , int rowIndex , int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();	
	}
	
	/**
	 * This method will read data from property file and return value to the caller
	 * @parameter sheetname
	 * @parameter rowIndex
	 * @parameter colIndex
	 * @return boolean
	 * @throws IOException
	 * @throws EncryptedDocumentException
	*/
	
	public boolean getStringDataFromBoolean(String sheetname , int rowIndex , int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();	
			
	}
	
	/**
	 * This method will read data from property file and return value to the caller
	 * @parameter sheetname
	 * @parameter rowIndex
	 * @parameter colIndex
	 * @return 
	 * @throws IOException
	 * @throws EncryptedDocumentException
	*/
	
	public LocalDateTime getStringDataFromDateAndTimes(String sheetname , int rowIndex , int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();	
			
	}
	
	/**
	 * This method will read data from property file and return value to the caller
	 * @parameter sheetname
	 * @parameter rowIndex
	 * @parameter colIndex
	 * @return  
	 * @throws IOException
	 * @throws EncryptedDocumentException
	*/
	
	public double getStringDataFromNumber(String sheetname , int rowIndex , int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis  = new FileInputStream("./src/test/resources/ExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();	
			
	}
	
	
}
