package _JDBC.Gun02;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _01_GetAllRowColumn extends JDBCParent {
    @Test
    public void test1() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select city_id,city, country_id from city");
        
        
        rs.last(); //son satira gittim

        String id = rs.getString(1);
        System.out.println("id = " + id);

        // eger int yapisina uygunsa bu sekilde de alinabilir
        int intId = rs.getInt(1);
        System.out.println("intId = " + intId);
    }


    @Test
    public void Test2() throws SQLException {
        ResultSet rs = sorguEkrani.executeQuery("select * from city");

        //veri harici diger bilgiler(basliklar field isimleri vb.)
        ResultSetMetaData rsmd= rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount ; i++) { // columnlarin isimlerini ve tiplerini aldim
            System.out.print(rsmd.getColumnName(i)+ "\t " + rsmd.getColumnTypeName(i)+ " ");
        }

        System.out.println();

        rs.next(); // ilk satira gittim
        for (int i = 1; i <= columnCount ; i++) {
            System.out.print(rs.getString(i)+" ");
        }




    }














}
