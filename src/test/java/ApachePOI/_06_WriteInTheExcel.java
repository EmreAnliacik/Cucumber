package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/WriteInExcelFile.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path); // Okuma younunde acildi
        Workbook workbook = WorkbookFactory.create(fileInputStream);  // hafizaya kopyasi olusturuldu
        Sheet sheet = workbook.getSheetAt(0);

        //Hafizadan yazma islemlerine basliyorum
        int sonSatirIndex = sheet.getPhysicalNumberOfRows(); //son satirin indexini alip
        Row yeniSatir = sheet.createRow(sonSatirIndex); // son bos yere satir aciyor
        Cell yeniHucre = yeniSatir.createCell(0);  //Ilk hucre olusturuldu
        yeniHucre.setCellValue("Merhaba Dunya");
        //Yazma islemi bitti
        //Okuma kanalini kapat
        fileInputStream.close();


        //Dosya kaydetmeye geciyorum
        //Bunun icin dosyayi yazma yonunde ac
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close(); // hafizayi bosalt
        outputStream.close(); //Yazma kanalini kapat

        System.out.println("Islem Bitti");




    }
}
