package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {
	public static void main(String[] args) throws IOException {
		
	//step 1:Convert physical file into java readable object
	FileInputStream fis=new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
	
	//step 2:Open WorkBook
	Workbook wb =WorkbookFactory.create(fis);
	
	//STEP 3:Get control over particular sheet
	Sheet sheet=wb.getSheet("Sheet1");
	
	//step 4:Get control over particular row
	Row row=sheet.getRow(1);
	//follow index numbering
	
	//step 5:Get control over particular cell
	Cell cell=row.getCell(1);
	//follow index numbering
	
	//step 6:fetch data
	String data=cell.getStringCellValue();
	System.out.println(data);
	
	//step 7:close workbook
	wb.close();
	
	}
	}
	
	


