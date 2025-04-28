package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_CarpimTablosuOtherSolution {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/CarpimTablosu.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int yeniAcilacakSatir = 0; // sheet.getPhysicalNumberOfRows();

        for (int k = 1; k <= 10 ; k++) {

            for (int i = 1; i <= 10 ; i++) {

                Row satir = sheet.createRow(yeniAcilacakSatir++); // ++ her bir islemi yeni satira yaz demekkkkkkhhhhhhhhhhhhhhhh

                Cell hucre1 = satir.createCell(0); hucre1.setCellValue(k);
                Cell hucre2 = satir.createCell(1); hucre2.setCellValue("x");
                Cell hucre3 = satir.createCell(2); hucre3.setCellValue(i);
                Cell hucre4 = satir.createCell(3); hucre4.setCellValue("=");
                Cell hucre5 = satir.createCell(4); hucre5.setCellValue(i*k);

            }
            Row bosSatir = sheet.createRow(yeniAcilacakSatir++);

        }








        fileInputStream.close();


        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();


        System.out.println("Islem Tamam");







    }
}
