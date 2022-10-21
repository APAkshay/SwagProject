package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
public static String getExcelData(int row,int cell,String SheetName ) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Apex\\eclipse-workspace\\SwagLabProject\\src\\main\\resources\\SwagLab.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		
	}

}
