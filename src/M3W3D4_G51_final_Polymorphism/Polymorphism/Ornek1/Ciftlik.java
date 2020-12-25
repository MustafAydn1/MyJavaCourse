package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek1;

public class Ciftlik {

    public static void KopekSesi(Kopek kopek){
        kopek.ses();
    }
    public static void KediSesi(Kedi kedi){
        kedi.ses();
    }


    // Polymorphism imkanı ile
    // 2 farklı subclas dan üretilmiş nesne
    // super class gibi biçimimnde (Çok biçimlilik) aynı metoda tek bir tipmiş
    // gibi gönderilebildi buna Polymorphism (Çok biçimlilik) denir.

    //HayvanSesi()  metodu
    // üstteki metdolarla aynı yerde olması için, burada yazıldı, en doğruu
    // Hayvan class ında olması bu metodun.

    public static void HayvanSesi(Hayvan hayvan){

        hayvan.ses();
    }
//BEN DE EN SON Hayvan classının içine aldım..
//AMA SORUN VERDİ. BUNU BUL CÖZ.

    public static void main(String[] args) {

      Kopek kopek1=new Kopek("Kumaş");
      Kedi   kedi1=new Kedi("KUMSAL");

      kopek1.ses();
      kedi1.ses();

      kopek1.kokladi();

// referans tipi nesne tipi ile aynı
// olduğunda bütüm özellik ve metodlar kullanılabiliyor.

        Hayvan kopek2=new Kopek("Karabaş"); // polimorfizm burası...
        Hayvan   kedi2=new Kedi("Pamuk");

        kopek2.ses();
        kedi2.ses();

      //  kopek2.kokladi(); //!!!!!!!
        // sadece sub clasa ait olan field ve metodlar
        // bu tanımlama tipinde(Ustclass a) ulaşılamaz.

        /*
        sadece sub class a ait olan fields ve metodlar
        bu tanımlama tipinde (ustClass) ulasılamaz.
         */

        System.out.println("*************** Inheritance Kısmı **************");

        KopekSesi(kopek1);
        KediSesi(kedi1);

        System.out.println("****************  Polimorfizm Kısmı(hayvan sesleri)  ***************");

        HayvanSesi(kopek1); // polimorfizm burası...
        HayvanSesi(kedi1);

    }
}
/*
burada tip dönuşumu yapılabilir.. Kopek/ kedi Hayvan a  dönuşturulebilir
aynen typeCaasating  gibi yapılır. bunu ogren. M.M.C DA  vardı.

double b=3.22;
int a=(int) b;
 */

/*  ÖNEMLİ!!!!1

//    Kopek kopek1                 =    new Kopek("karabaş");
//    referans tipi Kopek               nesnenin tipi (instance) Kopek
//
//    Hayvan kopek2                =    new Kopek("çomar");
//    referans tipi Hayvan              nesnenin tipi Kopek





Bir nesnenin davranış şekillerinin duruma göre
değişebilmesidir.
• Eğer birdençok sınıfın ortak kullanacağı bir metod
varsa, bu herbirinin temel alacağı bir anasınıf
içerisinde tanımlanabilir.
– Davranış şekillerindeki farklılıklar her sınıfın kendi
yapısı içinde ifade edilir.
– Örneğin bir selam() metodu ekrana, Turkler icin
“selam” İngilizler için “hello” Almanlar için “hallo”
yazdıracak biçimde çeşitlendirilebilir.
-----------------------------------------------

boyle bisey var mi hocam?
Kopek kopek3= (Kopek) new Hayvan("Toprak");
        kopek3.kokladi();
        kopek3.ses();
 BÖYLE OLMAZ. CÜNKÜ, new dersen herseyin içini boşaltır.
 normal tip dönusumu ile yapılır...

 Wrapper class gibi

 */