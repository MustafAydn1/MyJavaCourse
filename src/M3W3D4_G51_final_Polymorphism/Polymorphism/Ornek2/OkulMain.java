package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek2;

import java.util.concurrent.Callable;

public class OkulMain {
    public static void main(String[] args) {

       Ogrenci ogr2=new Ogrenci("Betül","KEKLİK","Öğrenci","2B");
       Calisan cal2= new Calisan("Mustafa","Keklik","Öğretmen","Eğitim");
       //OLARAK YAZMAM NORMALDİ.. BU INHERİTANCE OLURDU...


       Kisi ogr1 =new Ogrenci("Betül","KEKLİK","Öğrenci","2B");
        Kisi cal1= new Calisan("Mustafa","Keklik","Öğretmen","Eğitim");

// BU KISIM İSE INHERİTANCE KULLANILARAK POLİMORFİZM YAPILDI.
//İKİ FARKLI Class nesneleri aynı SuprClass refeansı ile tanımlandı.
//
        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);




     //ogr1 nesnesinin ait oldugu classı verdi. class ın basit adı
        System.out.println(ogr1.getClass().getSimpleName());

     //ogr1 in nesnesinin
        System.out.println(ogr1.getClass().getSuperclass().getSimpleName());



    }

}
// Burada öğrenci için sube , Çalışan için departmanı nasıl yazdırırdınız.
//Bunu ögren ve yap.