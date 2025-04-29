package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet sonuc = sorguEkrani.executeQuery("select * from language");

        sonuc.next();//bir adim ileri
        System.out.println("1.satir = " + sonuc.getString(2));
        //1. satirin 2.sutunu aldik indexi degil


        sonuc.next();//bir adim ileri
        System.out.println("2.satir = " + sonuc.getString(2));
        //2. satirin 2.sutunu aldik indexi degil


        sonuc.previous();// bir adim geri
        System.out.println("1.satir = " + sonuc.getString(2));
        //1. satirin 2.sutunu aldik indexi degil


    }



}
