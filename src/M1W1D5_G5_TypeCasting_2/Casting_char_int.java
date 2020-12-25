package M1W1D5_G5_TypeCasting_2;

public class Casting_char_int {

    public static void main(String[] args) {

       // char sayi=68;

      //  int sayi=int(sayi);

        int sayi=68;
        char harf=(char)sayi; // char 65000 e kadar oldugunu bildiğim için direk yazabilirim
        System.out.println("harf=" + harf);
        int baska= 1029;
        char karakter=(char)baska;
        System.out.println("\nkarakter = " + karakter);




        System.out.println(); //cıktıda arada bosluk olsun dıye. yazdım .başka turlu nasıl  yapardım.\n yapamadım????????

// DDİİKKKKAAATTT

        char harf1;
        System.out.println("harf1 = " +sayi );// aşagıda oluyorken burada neden olmadı.


        short sayi2 = 112;
        byte sayi5=(byte)sayi2;
        System.out.println("sayi5 = " + sayi5);// EN KISA YOLU: SONDAN OKUYARAK YAP. short sayi2 yi byte sayi5 e cevir.



    }
}
