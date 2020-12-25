package M3W2D4_G49_Inheritance.task4;

import java.util.ArrayList;
// 1- Ogrenci isimli id,isim ve tipi(ilk, lise)  olan bir class oluşturunuz.
// 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,
// 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,
// 4- Okul isimli mainde 3 adet öğrenci oluşturunuz,
// 5- Oluşturuken her öğrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.
public class Ogrenci {

    // BU SORUDAN AMAÇ:
//super ve subclass larda static nasıl calışıyor.

    int id;
    String isim;
    String tipi;

    public  static int sayacID=1;


    public Ogrenci(int id, String isim, String tipi) {
        this.id = id;
        this.isim = isim;
        this.tipi = tipi;
        sayacID++;
    }





    // en son yazabilmek için ille de toString
    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
