package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        //Kendimiz yeni bir excel dosyasi olusturup buna yazmak istersek
        //Oncelikle bu dosyayi hafizada olusturmmaiz gerekir.


        //Hafizada workbook olustur,icine hafizada sheet olustur.
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");


        //Gerisi normalle ayni ilerler

        //Hafizada Islemleri yap
        Row yeniSatir = sheet.createRow(0);
        Cell hucre = yeniSatir.createCell(0);
        hucre.setCellValue("Hello");

        //kaydet
        String path = "src/test/java/ApachePOI/resource/NewExcel.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();

        System.out.println("Process Done");







    }
}
