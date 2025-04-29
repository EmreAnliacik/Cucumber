package _JDBC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    public Connection baglanti;

    public Statement sorguEkrani;


    @BeforeClass
    public void DBConnectionOpen() throws SQLException {
        //        bir sorgunun çalışması için yapılanlar
        String HostUrl ="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila?useSSL=false";
        String userName = "root";
        String password = "'\"-LhCB'.%k[4S]z";

//
//        1- bağlantı bilgilerini girdik: connection bilgileri set edildi.
        baglanti = DriverManager.getConnection(HostUrl,userName,password);

//       2- db seçtik. : HostUrl ye bu bilgi eklendi.Ek kod yazilmadi


//        3- Sorgu ekranını açtık
        sorguEkrani = baglanti.createStatement();
    }

    @AfterClass
    public void DBConnectionClose() throws SQLException {
        baglanti.close();

    }

}
