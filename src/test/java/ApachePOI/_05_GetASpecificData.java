package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {
        returnAnswer("Zipcode");

    }

    public static void returnAnswer(String value) throws IOException {

        String path = "src/test/java/ApachePOI/resource/LoginData.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).getStringCellValue().equals(value)){
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++)
                    System.out.print(sheet.getRow(i).getCell(j)+" ");
            }
            else continue;

        }



    }


}
