package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {


        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        //2.yol

        //Calima sayfasindaki fiziksel kullanilan toplam satir sayisini veriyor
        int rowCount = sheet.getPhysicalNumberOfRows();


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            //Simdi burada her bir satirin kac hucresi var onu bulana kadar
            //hucreleri alacagim
//            Row row = sheet.getRow(i);
//            int cellCount = row.getPhysicalNumberOfCells(); //sutun sayisi
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
//                Cell cell = sheet.getRow(i).getCell(j);
                System.out.print(sheet.getRow(i).getCell(j)+"\t");
            }

            System.out.println();
        }



    }
}
