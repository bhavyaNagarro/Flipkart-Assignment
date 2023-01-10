package testcases;

import java.io.*;
import java.util.*;

 

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ExcelData {
	private static Map<String, String> testCaseMap = null;

	 

    public static String isExecuteCase(String key) 
    {
        if(testCaseMap == null)
        {
            try 
            {
                main(null);
            } 
            catch (IOException e) 
            {
                return "No";
            }
        }
        String value = testCaseMap.get(key);
        if(value == null)
            return "No";
        return value;

 

    }

    public static void main(String args[]) throws IOException 
    {
        FileInputStream fis = new FileInputStream(".\\testData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rows = sheet.iterator();

        testCaseMap = new HashMap<>();
        while (rows.hasNext()) 
        {
            Row row = rows.next();
            testCaseMap.put(row.getCell(0).getStringCellValue(),row.getCell(1).getStringCellValue());
        }
        workbook.close();
    }
}
