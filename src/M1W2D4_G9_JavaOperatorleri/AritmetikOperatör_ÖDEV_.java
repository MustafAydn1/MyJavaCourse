package M1W2D4_G9_JavaOperatorleri;

import java.util.Scanner;

public class AritmetikOperatör_ÖDEV_ {
    public static void main(String[] args) {


        Scanner input4 =new Scanner(System.in);
        System.out.print("sayım= ");
        int sayım=input4.nextInt();
       // System.out.println("benim sayım = " + sayım);


        System.out.println("sayımın  tersten yazılışı = " +  (sayım%10)+(sayım%100)/10+(sayım%1000)/100);
// ikincinin sonucuna dikkat et ille de parantez.. yoksa concatination yapıyor..
// hocanın çözümü de güzel..
        ////   ASIL ÇÖZÜM HOCANINKİ BENİM STRİNG OLMUŞ OLDU... HOCANIN Kİ DOĞRU BENİM Kİ OLMAZ


        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.

        Scanner oku=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz = ");
        int sayi=oku.nextInt();

//        435 -> 534
//                4 x1 ,  3x10,  5x100
        int birler = sayi % 10 ; // ilk basamağını verir 5
        int onlar = (sayi / 10 ) % 10 ; //(sayi / 10 ) -> 43  ,  %10 -> 3
        int yuzler = sayi / 100; // yüzler basamağını verir 4

        System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);


        int tersi = birler *100 + onlar*10 + yuzler;
        System.out.println("tersi = " + tersi);















        // Günün Soruları
        //  1- Girilen bir sayının birler basamağını ekrana yazdırınız.
        //  2- Girilen bir sayının onlar basamağını ekrana yazdırınız.
        // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.
        // 4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
        // -> 435 -> 4,3,5  => 4+3+5 => 12
        // 5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.
        // 6- 2020 yılına kadar geçen gün sayısını bulunuz.
        // 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.

        // soru 1--

     /*   Scanner input=new Scanner(System.in);
        System.out.print("Bir  sayı giriniz= ");
        int sayı=input.nextInt();
        System.out.println("sayınız = " + sayı);


        System.out.println("sayının birler basamağı = " + sayı%10); // MODÜL ALINARAK YAPILIR.

        // SORU 2-- Girilen bir sayının onlar basamağını ekrana yazdırınız.


        Scanner input1=new Scanner(System.in);
        System.out.print("girdiğiniz sayı= ");
        int sayi1=input1.nextInt();
        System.out.println("SAYINIZ = " + sayi1);

        System.out.println("Sayınızın Onlar Basamağı= "+(sayi1%100)/10);
     //*****************************************************************

       // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.

        Scanner input3= new Scanner(System.in);
        System.out.print(" SAYI GİRİN= ");
        int sayi3=input3.nextInt();
        System.out.println(" SAYI= ");

        System.out.println("sayı3= " + (sayi3%1000)/100);
        //*************************************************************


        //4- Girilen 3 basamaklı bir sayınızn basamaklarının toplamını ekrana yazdırınız.
        // -> 435 -> 4,3,5  => 4+3+5 => 12

        // farkında olmadan 5. soruyu da  birlikte cözmüş oldum...

   Scanner input4 =new Scanner(System.in);
        System.out.print("sayım= ");
        int sayım=input4.nextInt();
        System.out.println("benim sayım = " + sayım);


        System.out.println("sayımın rakam değerleri toplamı = " +(  (sayım%10)+(sayım%100)/10+(sayım%1000)/100));


      //  5- Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak
        // ekrana yazdırınız.Örneğin 435 -> 534 sayı olarak bulunacak.

        System.out.println("sayımın son 3 basamağının tersten yazılışı = " +  (sayım%10)+(sayım%100)/10+(sayım%1000)/100);
// ikincinin sonucuna dikkat et ille de parantez.. yoksa concatination yapıyor.. BU çözüm YANLIŞ VE İŞLEVSİZ.

// ************************************************************************************************************


        // 6- 2020 yılına kadar geçen gün sayısını bulunuz.

        int normalyıllargünleri=2020*365;
        int artıkyıllargünleri= (2020/4);

        System.out.println("TÜM yıllarIN günleri = " + (normalyıllargünleri +artıkyıllargünleri));


// ******************************************************************************************************
        // 7- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.

        Scanner input6=new Scanner(System.in);

        System.out.print("vizeniz= ");
        int vize=input6.nextInt();



        System.out.print("finaliniz= ");
         int finall=input6.nextInt();

        System.out.println("vizeniz= "+vize+"\nfinaliniz= "+finall);

        System.out.println("ortalamanız= "+((vize*0.4)+(finall*0.6))); // ille de paranteeeez.

  */

/*
        Scanner input4 =new Scanner(System.in);
        System.out.print("sayım= ");
        int sayım=input4.nextInt();
        System.out.println("benim sayım = " + sayım);


        System.out.println("sayımın rakam değerleri toplamı = " +(  (sayım%10)+(sayım%100)/10+(sayım%1000)/100));





*/


    }
}
