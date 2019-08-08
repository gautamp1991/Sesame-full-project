package com.Seasame.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

/**
 * @author SRNP755
 *
 */
public class Excel_data_print {

	private static XSSFSheet mFirstSheet;
	public WebDriver driver;

	public void testdata(String description, String className, String remark, String category, String area,
			String status, String browser) throws IOException {

		XSSFWorkbook workBook = new XSSFWorkbook(
				new FileInputStream(new File(".\\Report\\Seasame _Automation_ Report.xlsx")));

		mFirstSheet = workBook.getSheetAt(0);

		XSSFCellStyle customStyle = workBook.createCellStyle();
		customStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
		customStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		int lastRowIndex = findRowNumber(description);

		int col = 0;

		col = browser.equalsIgnoreCase("chrome") ? 5 : (browser.equalsIgnoreCase("firefox") ? 6 : 7);

		System.out.println("column no. for prining result is:" + col);

		if (lastRowIndex == 0) {
			int rown = mFirstSheet.getLastRowNum() + 1;
			mFirstSheet.createRow(rown);
			mFirstSheet.getRow(rown).createCell(0).setCellValue(description);
			mFirstSheet.getRow(rown).createCell(1).setCellValue(className);
			mFirstSheet.getRow(rown).createCell(3).setCellValue(category);
			mFirstSheet.getRow(rown).createCell(4).setCellValue(area);
			
			mFirstSheet.getRow(rown).createCell(col).setCellValue(status);

		} else {
			mFirstSheet.getRow(lastRowIndex).createCell(col).setCellValue(status);
			if (status.equalsIgnoreCase("Fail")) {
				mFirstSheet.getRow(lastRowIndex).getCell(col).setCellStyle(customStyle);
				mFirstSheet.getRow(lastRowIndex).createCell(2).setCellValue(browser + ":" + remark+ "...");
			}
		}

		FileOutputStream fOutStream = new FileOutputStream(new File(".\\Report\\Seasame _Automation_ Report.xlsx"));

		workBook.write(fOutStream);
		workBook.close();
		fOutStream.close();

	}

	private static int findRowNumber(String articleNumber) {
		for (Row row : mFirstSheet) {
			try {
				if (row.getCell(Constant.ARTICLE_COLUMN_INDEX).getStringCellValue().equals(articleNumber)) {
					return row.getRowNum();
				}
			} catch (NullPointerException e) {
			}
		}
		return 0;
	}
}
