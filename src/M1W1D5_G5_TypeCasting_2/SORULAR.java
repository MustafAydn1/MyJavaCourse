package M1W1D5_G5_TypeCasting_2;

public class SORULAR {
    public static void main(String[] args) {
        int sayi = 68;
        char harf = (char) sayi; // char 65000 e kadar oldugunu bildiğim için direk yazabilirim
        System.out.println("harf=" + harf);


        char harf1;
        System.out.println("harf1 = " + sayi);// aşagıda oluyorken burada neden olmadı. ????????????

        System.out.println(); //cıktıda arada bosluk olsun dıye. yazdım .başka turlu nasıl  yapardım.\n yapamadım????????


        short sayi2 = 112;

        byte sayi4=(byte)sayi2;
        System.out.println("sayi4 = " + sayi4);

        byte sayi5;
        System.out.println("sayi5 = " + sayi2);// EN KISA YOLU: SONDAN OKUYARAK YAP. short sayi2 yi byte sayi5 e cevir.




        //hocanın örneğiydi...
        double oran = 40000.4567;
        short ornekleme ;

        ornekleme = (short) oran; //  aşagıdaki +örnekleme yerine oran yazarsan bu satıra gerek kalmaz.
        System.out.println("ornekleme = " + ornekleme);

        //*****************************************************************************

        String mac1faul="12";
        String mac2faul="27";

        byte faul1=Byte.parseByte(mac1faul);
        byte faul2=Byte.parseByte(mac2faul);

        int toplamfaul= faul1 + faul2;  // NEDEN BYTE OLARAK TOPLAYAMADIM...
        System.out.println("toplamfaul = " + toplamfaul);


        byte a= 3;
        byte b=5;
        byte byttopl=(byte)(a+b);
        System.out.println("byttopl =  " +byttopl); // bu sorun sanırım short ve byte için gecerli

//byte toplam= a+b; // byte ler kendi içinde toplanamıyorlar mı????

//**********************************************************************************************************
        short s=15;
        short h=30;

        // short x= s+h; short lar birbiri ile toplanamıyorlar mı??????????
        int c= s+h;
        System.out.println("6. Soru\n" + c);

        System.out.println("short toplam="+""+c); // çocukca oldu...

        short toplam5=(short)(s+h);
        System.out.println(toplam5);


        //       Soru :   Ekrana      "Hello ", "World  \ /"        şeklinde yazınız

        //System.out.println("   \"Hello \" , \"World \\ / \"    "); BUNU HALA YAZAMADIM....


    }

    }
