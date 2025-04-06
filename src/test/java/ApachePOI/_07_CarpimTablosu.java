package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_CarpimTablosu {

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/CarpimTablosu.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        int ilksayi = 1;
        for (int k = 0; k < 10; k++) {


            int ikinciSayi = 1;

            for (int i = 0; i < 10; i++) {

                int sonSatirIndex = sheet.getPhysicalNumberOfRows();
                Row yeniSatir = sheet.createRow(sonSatirIndex);
                for (int j = 0; j < 5; j++) {
                    Cell yeniHucre = yeniSatir.createCell(j);
                    switch (j) {
                        case 0:
                            yeniHucre.setCellValue(ilksayi);
                            break;
                        case 1:
                            yeniHucre.setCellValue("x");
                            break;
                        case 2:
                            yeniHucre.setCellValue(ikinciSayi);
                            break;
                        case 3:
                            yeniHucre.setCellValue("=");
                            break;
                        case 4:
                            yeniHucre.setCellValue(ilksayi * ikinciSayi);
                            break;
                    }
                }
                ikinciSayi = ikinciSayi + 1;

            }
            ilksayi +=1;

        }


        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();


    }


}
