package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _05_GetASpesificData1 {
    public static void main(String[] args) throws IOException {
        returnAnswer("Address");
    }
    public static void returnAnswer(String value) throws IOException {
        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).getStringCellValue().equals(value)){
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells() ; j++) {
                    System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
                }
            }
            else continue;



        }







    }
}
