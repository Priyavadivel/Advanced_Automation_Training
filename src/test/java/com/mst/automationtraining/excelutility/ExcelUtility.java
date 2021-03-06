package com.mst.automationtraining.excelutility;

/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: Excelutility is used to perform read and write operations.
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.mst.automationtraining.constant.Constant;

public class ExcelUtility {

	private static File file = null;
	private static FileInputStream inputStream = null;
	private static FileOutputStream outputStream = null;

	public static Workbook workbook = null;

	public static CellStyle style = null;
	public static Font font = null;
	private static Sheet sheet = null;
	private static Row row = null;
	private static Cell cell = null;

	private static int totalRows = 0;
	private static int totalCols = 0;
	private static String datafilePath = Constant.datafilePath;

	// To read the data from the concerned cell
	public static String readExcel(String sheetName, String tcID, String header) throws Exception {
		Object result = null;
		try {
			file = new File(datafilePath);
			inputStream = new FileInputStream(file);
			String fileExtensionName = datafilePath.substring(datafilePath.indexOf("."));

			if (fileExtensionName.equals(".xlsx")) {
				workbook = new XSSFWorkbook(inputStream);
			} else if (fileExtensionName.equals(".xls")) {
				workbook = new HSSFWorkbook(inputStream);
			}
			sheet = workbook.getSheet(sheetName);
			totalRows = sheet.getLastRowNum();
			row = sheet.getRow(0);
			totalCols = row.getLastCellNum();

			for (int k = 1; k <= totalRows; k++) {
				String testCaseID = sheet.getRow(k).getCell(0).getStringCellValue();

				if (testCaseID.equalsIgnoreCase(tcID)) {
					for (int l = 1; l < totalCols; l++) {

						String testData_FieldName = sheet.getRow(0).getCell(l).getStringCellValue();

						if (testData_FieldName.equalsIgnoreCase(header)) {
							cell = sheet.getRow(k).getCell(l);
							if (cell != null) {
								switch (cell.getCellType()) {
								case Cell.CELL_TYPE_NUMERIC:// numeric value in excel
									if (DateUtil.isCellDateFormatted(cell)) {
										Date myDate = cell.getDateCellValue();
										SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
										result = formatter.format(myDate);
									} else {
										result = new BigDecimal(cell.getNumericCellValue()).toPlainString();
									}
									break;

								case Cell.CELL_TYPE_STRING: // string value in excel
									result = cell.getStringCellValue();
									break;

								case Cell.CELL_TYPE_BOOLEAN: // boolean value in excel
									result = cell.getBooleanCellValue();
									break;

								case Cell.CELL_TYPE_BLANK: // blank value in excel
									result = cell.getStringCellValue();
									break;

								case Cell.CELL_TYPE_ERROR: // Error value in excel
									result = cell.getErrorCellValue() + "";
									break;
								}
							}
						}
					}
					k = totalRows + 1;
				}
			}
			inputStream.close();
		} catch (Exception ex) {
			throw ex;
		}
		return result.toString();
	}
}
