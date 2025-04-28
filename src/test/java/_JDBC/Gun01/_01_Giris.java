package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Giris {

    @Test
    public void test1() throws SQLException {
//        bir sorgunun çalışması için yapılanlar
        String HostUrl ="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila?useSSL=false";
        String userName = "root";
        String password = "'\"-LhCB'.%k[4S]z";

//
//        1- bağlantı bilgilerini girdik: connection bilgileri set edildi.
        Connection baglanti = DriverManager.getConnection(HostUrl,userName,password);

//       2- db seçtik. : HostUrl ye bu bilgi eklendi.Ek kod yazilmadi


//        3- Sorgu ekranını açtık
        Statement sorguEkrani = baglanti.createStatement();

//        4-Sorgu ekranina sorguyu yazdım, çalıştırdım
        ResultSet sonucTablosu = sorguEkrani.executeQuery("select * from customer");



//        5- altta sonuçlar gözüktü
        sonucTablosu.next(); //su anda ilk satira geldim

        String ad = sonucTablosu.getString("first_name");
        String soyad = sonucTablosu.getString("last_name");
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        sonucTablosu.next(); //2. satira gittim

         ad = sonucTablosu.getString("first_name");
         soyad = sonucTablosu.getString("last_name");
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        baglanti.close();
    }



}
