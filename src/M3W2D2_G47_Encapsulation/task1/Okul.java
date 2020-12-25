package M3W2D2_G47_Encapsulation.task1;

import java.util.ArrayList;
//  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
//  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
//  3- Bütün fieldlar için encapsulation uygulayınız.
//  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
//     ArrayList cinsinden Öğrencileri olsun.
//  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
//  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
//     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
//     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
//7. Bu soruya ek :  kullanıcı yaş yerine harf veya kelime girerse
// bu hatayı da kontorl ettirerek yeniden öğrenci isteyiniz.

public class Okul {

   private String okulAd;
   private  int maxOgrenciSayisi;

   private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

   // Arrylisti buraya yazmaya gerek görulmedi.
   // kendisi tanımlandı. set-get oluşturuldu.

   public Okul(String okulAd, int maxOgrenciSayisi) {
    setOkulAd(okulAd);
    setMaxOgrenciSayisi(maxOgrenciSayisi);

     /* this.okulAd = okulAd;
      this.maxOgrenciSayisi = maxOgrenciSayisi;
      this.ogrenciler = ogrenciler;*/
   }

   public String getOkulAd() {
      return okulAd;
   }

   public void setOkulAd(String okulAd) {
      this.okulAd = okulAd;
   }

   public int getMaxOgrenciSayisi() {
      return maxOgrenciSayisi;
   }

   public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
      this.maxOgrenciSayisi = maxOgrenciSayisi;
   }

   public ArrayList<Ogrenci> getOgrenciler() {
      return ogrenciler;
   }

   public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
      this.ogrenciler = ogrenciler;
   }
}
