package M1W2D5_G10_ComparisonOperators_if;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağını yazı ile yazdırınız
        // Soru : yukarıdaki soru NEGATİF  sayı ise çalışmadı, - olması durumunda da çalışmasını
        // nasıl sağlarsınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();

       if(sayi<0)       // bu bölüm  negatif sayılarda  da sonucu bulmak için...
            sayi=-sayi;  // veya sayi=sayi*-1;
                        //BU İFADEYİ int İN ALTINA YAZINCA NEDEN ÇALIŞMADIĞINI ANLAMADIM.
                       // NEDEN BUNU BELİRTMEK ZORUNDAYIM.. TÜM SAYILARI NIYE ALMADI.

        int birler = sayi %10;


        if (birler == 0) System.out.println("sıfır");
        if (birler == 1) System.out.println("bir");
        if (birler == 2) System.out.println("iki");
        if (birler == 3) System.out.println("üç");
        if (birler == 4) System.out.println("dört");
        if (birler == 5) System.out.println("beş");
        if (birler == 6) System.out.println("altı");
        if (birler == 7) System.out.println("yedi");
        if (birler == 8) System.out.println("sekiz");
        if (birler == 9) System.out.println("dokuz");


        int onlar= (sayi%100)/10;

        if(onlar==0) System.out.println("SIFIR");
        if(onlar==1) System.out.println("BİR");
        if(onlar==2) System.out.println("İKİ");
        if(onlar==3) System.out.println("ÜÇ");
        if(onlar==4) System.out.println("DÖRT");
        if(onlar==5) System.out.println("BEŞ");
        if(onlar==6) System.out.println("ALTI");
        if(onlar==7) System.out.println("YEDİ");
        if(onlar==8) System.out.println("SEKİZ");
        if(onlar==9) System.out.println("DOKUZ");





    }







    }

