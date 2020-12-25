package EXTRA;

import java.util.Scanner;

public class ÖNEMLİ_GÖRDÜKLERİM {
    public static void main(String[] args) {

        //1- küçük harflerle girilen 3 kelimelik ad ve soyadın. ilk harflerini büyük yap...
     /*
        Scanner input=new Scanner(System.in);
        System.out.print("ad soyad giriniz= ");
        String tamAd=input.nextLine();
        System.out.println("Adınız ve Soyadınız = " + tamAd);
        // mehmet akif ersoy

        String ad1=tamAd.substring(0,1).toUpperCase();  //M
        String ad2=tamAd.substring(tamAd.indexOf(" "),tamAd.indexOf(" ")+2).toUpperCase(); // A
        String ad3=tamAd.substring((tamAd.lastIndexOf(" ")),tamAd.lastIndexOf(" ")+2).toUpperCase();


        String Birleştir=("Adınız= "+ad1+tamAd.substring(1,tamAd.indexOf(" ")+1))  //Mehmet
                +ad2+tamAd.substring(tamAd.indexOf(" ")+2,tamAd.lastIndexOf(" ")+1)
                +ad3+tamAd.substring(tamAd.lastIndexOf(" ")+2);

        System.out.println("Birleştir = " + Birleştir);
        */
//**************************************************************************************************
/*
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
        */
//**********************************************************************************
     /*   // Girilen 3 sayıdan en büyük olanını bulunuz.
        Scanner input=new  Scanner(System.in);
        System.out.print("sayı1= ");
        int sayı1=input.nextInt();

        System.out.print("sayi2= ");
        int sayi2=input.nextInt();

        System.out.print("sayi3= ");
        int sayi3=input.nextInt();


        int enBüyük=sayı1; // bunu bu şekilde atamak zorundasın. yoksa olmaz.olmuyor.

        if(sayi2>enBüyük)
            enBüyük=sayi2;

        if(sayi3>enBüyük)
            enBüyük=sayi3;

        System.out.println("enBüyük = " + enBüyük);
      */
        //**************************************************************************************************

        //int sayi6=10, sayi7=9;  // 4. yöntem >>>> BÖYLECE BİRSÜRÜ ALT ALTA int TANIMLAMAMIŞ OLURSUN.
          /* Scanner sc=new Scanner(System.in);

        int num1 = sc.nextInt();
        byte num2 = sc.nextByte();
        byte num3 = sc.nextByte();     //max byte: 127  min byte:-128
       long a=sc.nextLong();
       short b=sc.nextShort();
       double c=sc.nextDouble();
      //float d= sc.nextFloat();

        System.out.println((num1 - num2 - num3-a-b));
        System.out.println((num1 - num2 - num3-a-b-c-d));
      System.out.println((num1 + num2 + num3+a+b+c+d));
        System.out.println((num1/c));
        System.out.println((num2/c));
        System.out.println((num1*c));


        // demekki HEPSİ BİRBİRİ İLE HERTURLU İŞLEM GİRİYORlar...
        // virgülden sonraki sonuçlar biraz grip niye??

*/

  /*      // Kullanıcıdan alt ve üst değeri  tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı


        Scanner input = new Scanner(System.in);
        System.out.print("min max degerini bir boşluk bırakarak giriniz =");
        String min_max = input.nextLine(); // bir sayı yaz sonra space tuşu ile boşluk bırak 2. sayıyı yaz..!!!!

        // NEDEN STRİNG GİRMEK ZORUNDAYIM: Çünku  int girersem bir sayının bitimi ve boşluk kısmı
        // sonra diğer sayının başlangıcı ve bitimini tespit edemem. String olarak yazıp.
        //string olarak tespıt edip,bu stringi Integer e çeviririm. Matematiksel işleme devam ederim

        int ilkbosluk=min_max.indexOf(" "); // indexof zaten int verir. cevirmeye gerek yok.

        int min=Integer.parseInt(min_max.substring(0,ilkbosluk));
        int max=Integer.parseInt(min_max.substring(ilkbosluk+1));

        int randomNumberinRange=(int)(Math.random()*(max-min+1)+min);
        System.out.println("randomNumberinRange = " + randomNumberinRange);
        */


// ENGİN DEMİROV UDEMY  DEN BAK.... JAVA....
// EMRE ALTUNBİLEK  UDEMY...

    }


}
