package M1W1D5_G5_TypeCasting_2;

public class Casting_double_short {
    public static void main(String[] args) {
        // 2 double  ve short tanımla...doubledeger ata... doubleyi short a cevir.

        double a= 312345.1234567;
        double b= 123456.1234;
        double c= 12345.1234;
        short cevira= (short)a;// yukarıdaki a ifadesini short a cevirip, ceviria olarak tanımla... DEMEKTİR.
        short cevirb= (short)b;


        // shortun kapasıtenın uzerinde bir deger verdik anlamsız cıktı

// short kucugekolaycevirir= short(c);  BU YANLIŞ CUNKU short u paranteze alacaksın. c yı degil.
        short kucugezorcevirir =(short) c;
        System.out.println(c);                                            // sadece deger yazar. cevirme filan da olmadı.
        System.out.println("kucugezorcevirir = " + kucugezorcevirir); // neye eşitlediysen onunla yazar.
        System.out.println("birdeböyleyaz=" + kucugezorcevirir);   // ayni degeri farklı kelimelerle eşitleyebilirsin.
        System.out.println("cevirb = " + cevirb);
        System.out.println("cevira = " + cevira);// DOUBLE a OLARAK VERİLEN, sonrada short a cevira olarak dönüştürülen ifadeyi yaz.


        short örnekleme;
        System.out.println("örnekleme = " + c);
        short tekhamledecevir;
        System.out.println("tekhamledecevir = " + b);

// örnekleme ve tekhamlede cevir hocanınkınden de kısa, cok daha kısa.
// SONDAN OKUMA YAPALIM: c İFADESİNİ, TANIMLANAN örnekleme short a cevir. EEEEEEEEEEEEEEENNNNNN KISA


        // HOCANINKİ COK KISA CUNKU BUYUK DEGER DEN kucuk deger e GEÇİŞ YAPTI..


       /* double oran = 40000.4567;
        short ornekleme ;

        ornekleme = (short) oran;
        System.out.println("ornekleme = " + ornekleme);
*/

    }
}
