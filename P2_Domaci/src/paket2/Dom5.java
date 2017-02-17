package paket2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Dom5 {

	public static void main(String[] args) throws IOException {

		
		ArrayList<String> allStrings = new ArrayList<String>();
		ArrayList<Double> allNumbers = new ArrayList<Double>();

		String excelFilePath = "rasporedKolizije.xls";
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		Workbook workbook = new HSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();

		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue() );
					//allStrings.add(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue());
					//allNumbers.add(cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print(" ");
					//allNumbers.add(cell.getNumericCellValue());
					break;
				}
				System.out.print("-");
			}
			
			System.out.println();
		}
  
		//System.out.println(allStrings);
		//System.out.println(allNumbers);
		workbook.close();
		inputStream.close();

	}
}
