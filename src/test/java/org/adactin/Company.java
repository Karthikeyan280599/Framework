package org.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Company {
	public static void main(String[] args) throws IOException {
		// 1)Mention the path of Excel Sheet
		File file = new File("C:\\Users\\panne\\OneDrive\\Desktop\\Drivers\\Framework\\Excel Sheets\\Excel Sheet.xlsx");

		// 2)Get the objects/bytes from file
		FileInputStream stream = new FileInputStream(file);

		// 3)Create Workbook--->Collection of Sheets
		Workbook workbook = new XSSFWorkbook(stream);

		// 4)Get the Sheet Name
		Sheet sheet = workbook.getSheet("Excel");

		// 5)Iterate all the Rows
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			// 6)Iterate all the Cells
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				
				switch (type) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break;
					
				case NUMERIC:
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String num = b.toString();
					
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMy");
						String format = dateFormat.format(date);
						System.out.println(format);
					}else {
						double db = cell.getNumericCellValue();
						BigDecimal db1 = BigDecimal.valueOf(db);
						String s = db1.toString();
						System.out.println(s);
					}
					break;

				default:
					break;
				}
							
					}
					
				}
				
			}
			

		

}
