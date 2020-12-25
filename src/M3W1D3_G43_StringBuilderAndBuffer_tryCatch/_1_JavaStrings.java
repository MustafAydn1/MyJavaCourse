package M3W1D3_G43_StringBuilderAndBuffer_tryCatch;

import java.util.Arrays;

/*     String = daha yavas ,Immutable==> degisemez,

            StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
            StringBuffer synchronized,thread safe.

           StringBuilders = mutable==>degisebilir ,
           not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )
 // String değişkeni çok fazla ekleme veya işlemlere göre perfomansı oldukça düşük.

 // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olanStringBuilder kullanılır.
 // yapısı gereği hızlı çalışır.
 Fakat paralel çalışan uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

  builder: geleni ekler,... dolmuş gibi calişir
  buffer:geleni sırası ile ekler.TAKSİ gibi çalışır. yolcu inmeden yenisini almaz. kontrol eder...

*/
public class _1_JavaStrings {

    public static void main(String[] args) {
     StringBuilder s= new StringBuilder("Bu");

    // s.append("Bu"); // bu kısmı nesne olusurken de koyabilirsin...hatta tamamını nesne oluşurkende yazılır.
     s.append("gün"); // burada tren mantıgı gıbı atama yapmaya gerek kalmadan, yapıyor.ilk atama (lokomotif) yeterli.
     s.append(" hava"); // add mantıgıyla calışıyor.
     s.append(" çok sıcak");

        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());// uzunlugunu=toplam kaç karakter old. verir

        s.append(4);// tum degişken tiplerini alır. ama stringe cevirerek. alır...artık string olurlar.

        System.out.println("s = " + s); // en sona ekleyerek devam eder.


        s.reverse();// ters cevirir.
        System.out.println("reverse ile ters cevrilmişi: " + s);

        s=new StringBuilder("Bugün hava çok sıcak");

        s.delete(0,5);//0 dahil 5 hariç 5 e kadar, olan bölümü sildi.

        System.out.println("0-5 delete haliyle(5 dahil değil): " + s);


        s.deleteCharAt(3);// sadece verilen indexi siler..
        System.out.println("sadece tek index sil(s.deleteCharAt(3)) = " + s);

        System.out.println("s.length() = " + s.length());// değişkenin içindeki karakter sayısı
        System.out.println("s.capacity() = " + s.capacity());// yeni işlem gelince kullansın dıye ayrılmış alan.
// hafızada genişleyebilmesi için verilmiş ön alan,
// ancak eklendikçe artan bir alan, tampon genişleyebilme alanı
// bu da builder in hızlı olmasına sebeb oluyor.

        s.insert(5,6666); // insert : ARAYA GİRMEK DEMEK. 5 nolu indexe insert yaptı.
        System.out.println("s.insert ile verilen noktada araya kaynak yaptı = " + s);

        s.insert(11,3.45);// doble isert de yapılır.
        System.out.println("s.insert ile verilen noktaya double ekledik = " + s);


       // konsola yazdırlan hersey Strıng oluyor dımı hocam. evet...
        //maksat ayni, hiz farkli

        int [] dizi={1,4,7,908}; // array de insert edilebilir. önce array belirle.
        s.insert(7, Arrays.toString(dizi));//sonra Arrays.toString ile insert eyle

        System.out.println(" dizi yi ekledikten sonraki hali = " +s);


 //s.replace yi net görmek için yeniden tanımlayalım...

  s=new StringBuilder("Bugünhavaçoksıcak");
        System.out.println("s = " + s);

        s.replace(3,8,"bu");
        System.out.println("s.replace sonrası hali = " + s);
// başlangıç ve son verilen bölüme verilen stringi atar, eğer verilen aralık büyük ve konması istenen String küçükse
// verilen aralıgı tamamen siler. kucuk de olsa strıngi koyar. Ama boşluk bırakmadanda birleştirip devam eder.
// silinmiş kısım zaten gider.





    }

}
