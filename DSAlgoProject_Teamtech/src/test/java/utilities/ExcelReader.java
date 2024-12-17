package utilities;




import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.locks.ReentrantLock;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;


public class ExcelReader {
	public static int totalRow;

	//to ensure that only one thread can access the workbook at a time
	private static final ReentrantLock lock = new ReentrantLock();

	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException, OpenXML4JException {

		lock.lock();
		try (OPCPackage pkg = OPCPackage.open(new File(excelFilePath))) {
			Workbook workbook = new XSSFWorkbook(pkg);
			Sheet sheet = workbook.getSheet(sheetName);
			return readSheet(sheet);
		} finally {
			lock.unlock();
		}
	}

	private List<Map<String, String>> readSheet(Sheet sheet) {

		Row row;
		Cell cell;

		totalRow = sheet.getLastRowNum();

		List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) {

			row = sheet.getRow(currentRow);
			int totalColumn = row.getLastCellNum();

			LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<String, String>();

			String data = null;

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {

				cell = row.getCell(currentColumn);

				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				if (cell.getCellType() == CellType.STRING)
					data = cell.getStringCellValue();
				else if (cell.getCellType() == CellType.NUMERIC)
					data = String.valueOf(cell.getNumericCellValue());
				else if (cell.getCellType() == CellType.BLANK)
					data = String.valueOf(cell.getDateCellValue());
				columnMapdata.put(columnHeaderName, data);
			}

			excelRows.add(columnMapdata);
		}

		return excelRows;
	}

	public int countRow() {

		return totalRow;
	}
	
	}
	
	
	
	
	
	
	

	
	
	

                                                                                                                                                                              