package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        //1.yol

        //Dosyanin oldugu yerle programin arasinda bir dosya yolu baglantisi olusturmaliyim.
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        //Java dosya okuma nesnesine bu yolu vererek baglanti kuruyorum
        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(path);


        //Dosya okuma islemcisi uzernden Calisma Kitabini aliyorum
        // hafizada workbooku alip olusturdu.
        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaBaglantisi);

        //Istedigim isimdeki calisma sayfasini aliyorum
        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1");


        //istenen satiri aliyorum
        Row satir = calismaSayfasi.getRow(0);


        //istenilen hucreyi aliyorum
        Cell hucre = satir.getCell(0);

        System.out.println("Hucre: "+hucre);















    }
}
