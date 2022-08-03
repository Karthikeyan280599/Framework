package org.adactin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Client {
	private static String text;

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		WebElement dDnSkills = driver.findElement(By.id("Skills"));

		Select select = new Select(dDnSkills);

		List<WebElement> elements = select.getOptions();

	

	// 1)Mention the path of the Excel Sheet
	File file = new File("C:\\Users\\panne\\OneDrive\\Desktop\\Drivers\\Framework\\Excel Sheets\\Excel Task 2.xlsx");


	// 3)Create Workbook--->Collection of Sheets
	Workbook workbook = new XSSFWorkbook();

	// 4)Create Sheet Name
	Sheet sheet = workbook.createSheet("Data");

	// 5)Iterate
	for(int i = 0;i<elements.size();i++){
		WebElement webElement = elements.get(i);
		String text1 = webElement.getText();
	
	// 6)Create Row
	Row row = sheet.createRow(i);

	// 7)Create Cell
	Cell createCell = row.createCell(0);

	// 8)Insert Value
	createCell.setCellValue(text1);

	// 8)Convert Objects to File
	FileOutputStream out = new FileOutputStream(file);

	// 9)Write/Update in Workbook
	workbook.write(out);

}


	}}
