package M2W4D3_G38_StaticFinal.nonAccesModifiers.staticModifiers;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAdi="Yıldırım";
  //  static String okulAdi;
//Static kullanım sebebi hafızayı gereksiz tekrarladan kurtarmak
// okulAdi tüm ögrenciler için ortak oldugundan
//static olarak yazılıp sabitlenir.tekraren girilmez.

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

     //  this.okulAdi="Yıldırım";
  //Comment yapılanlarla da olur.

    }
        void print(){
            System.out.println(ad+"  "+soyad+"  "+okulAdi);
        }
    }

