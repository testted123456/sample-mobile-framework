package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class ExcelUtils {
    protected static final Logger log = (Logger) LogManager.getLogger(ExcelUtils.class);

    private static XSSFSheet ExcelWSheet;

    private static XSSFWorkbook ExcelWBook;

    private static XSSFCell Cell;

    private static XSSFRow Row;

    public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

        String[][] tabArray = null;

        try {

            FileInputStream ExcelFile = new FileInputStream(FilePath);

            // Access the required test data sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

            int startRow = 1;

            int startCol = 1;

            int ci,cj;

            int totalRows = ExcelWSheet.getLastRowNum();

            // you can write a function as well to get Column count

            int totalCols = 2;

            tabArray=new String[totalRows][totalCols];

            ci=0;

            for (int i=startRow;i<=totalRows;i++, ci++) {

                cj=0;

                for (int j=startCol;j<=totalCols;j++, cj++){

                    tabArray[ci][cj]=getCellData(i,j);

                    System.out.println(tabArray[ci][cj]);

                }

            }

        } catch (IOException e){
            log.warning("Could not read the Excel sheet");
        }

        return(tabArray);

    }

    public static String getCellData(int RowNum, int ColNum) throws Exception {

            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            CellType dataType = Cell.getCellType();

            if (dataType == CellType.BLANK) {

                return "";

            } else {

                String CellData = Cell.getStringCellValue();

                return CellData;

            }

    }
}
