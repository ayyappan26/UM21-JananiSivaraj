package read.data.from.excel.file.APACHE.POI.Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) {
		String get_file_path = ".\\DataFiles\\datafile.xls";

		FileInputStream inputstream = null;
		try {
			inputstream = new FileInputStream(get_file_path);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		HSSFWorkbook workbook1 = null;
		try {
			workbook1 = new HSSFWorkbook(inputstream);
		} catch (IOException e) {

			e.printStackTrace();
		}
		HSSFSheet sheet1 = workbook1.getSheetAt(0);
		// HSSFSheet sheet1=workbook1.getSheet("Sheet1");
		// using for loop- read data

		int rows = sheet1.getLastRowNum();
		int coloumns = sheet1.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) // for rows
		{

			HSSFRow row = sheet1.getRow(r);
			for (int c = 0; c <= coloumns; c++)// for coloumn
			{
				HSSFCell cell = row.getCell(c);
				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;

				}
			}

		}

	}
}
