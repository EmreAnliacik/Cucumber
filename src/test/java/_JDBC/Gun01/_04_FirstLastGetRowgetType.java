package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowgetType extends JDBCParent {
    @Test
    public void Test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select city from city");

        rs.last(); //son satira gider
        System.out.println("son satirin sehir adi = " + rs.getString(1));


        rs.first(); //ilk satira gider
        System.out.println("ilk satirin sehir adi = " + rs.getString(1));


        rs.last(); // sona git
        int kacinciSatirdayim =rs.getRow();
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);







    }




}
