package M1W1D5_G5_TypeCasting_2;

public class Casting_short_byte {
    // short ve byte cinsinden iki deger tanimla ve ata shortu byte cevir.

    public static void main(String[] args) {

        short sayi1= 155;
        short sayi2 = 112;

       

        byte sayi3 = (byte) sayi1;  // bunu da ezberle mutlaka...
        byte sayi4 = (byte) sayi2;

        byte sayi5;
        System.out.println("sayi5 = " + sayi2);// EN KISA YOLU: SONDAN OKUYARAK YAP. short sayi2 yi byte sayi5 e cevir.

        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi4 = " + sayi4);

        System.out.println("sayı1= " +sayi1); // oldugu gibi alır...

        //  cunku byte 127 sayısından fazlasını tutamaz. o yuzden sacmaladı.. short=32000
        // int= 2 milyar.. ve long=

        int a=10;
        int b= 20;
        int toplam= a+b;
        toplam = toplam +2;
        toplam= toplam+4;
        toplam=toplam+100;

        System.out.println("toplam = " + toplam);// ENSON HANGİ TOPLAMI YAZDI İSEN öncekileride toplayrak SONUNCUYU CIKTI VERİR.

        System.out.print("Pazartesi ");
        System.out.print("Salı ");
        System.out.print("Çarşamba");

        System.out.println("\n*********\n");  // ln  VE \n   in fonksiyonları için bunu incele...

        System.out.println("Pazartesi");
        System.out.println("Salı");
        System.out.println("Çarşamba");






    }
}
