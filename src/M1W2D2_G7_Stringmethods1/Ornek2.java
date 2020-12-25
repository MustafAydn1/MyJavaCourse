package M1W2D2_G7_Stringmethods1;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        // Soru 2 : Kullanıcıdan tek bir komutla okunan 2 kelimelik ad ve soyadı ,
        // (tek okuma da ad ve soyadı alınız -> "Adınızı ve Soyadınızı giriniz")
        // ekrana ilk harfleri ve nokta şekilde
        // yazdırınız.Örnek Ahmet Yılmaz -> A.Y.


        Scanner input= new Scanner(System.in);
        System.out.print(" Ad Soyad giriniz= ");
        String adsoyad=input.nextLine();
        System.out.println("Merhaba Sayın "+adsoyad+"  Bankamıza Hoş Geldiniz.");

       // System.out.println("Adınızın Baş Harfi= "+adsoyad.charAt(0));
        //System.out.println("Soyadınızın Baş Harfi= "+adsoyad.indexOf(" ")); bu şekilde 7 yazıyor.cunku indexi bulur.
        //indexteki harf için de önce char ile içine de indexof+1 ile olmalı.

        System.out.println("Ad ve Soyadınızın Baş Harfleri= "+adsoyad.charAt(0)+"."+adsoyad.charAt(adsoyad.indexOf(" ")+1)+".  dır" );
        // ama tek satırda güzel oldu....

/*hocanın çözümü
  char adIlkHarf=adSoyad.charAt(0);
        int boslukNerde = adSoyad.indexOf(" "); // bu indexin 1 fazlası herzaman soyadın ilk harfidir.
        char soyadIlkHarf = adSoyad.charAt(boslukNerde+1);

        System.out.println(adIlkHarf+"."+soyadIlkHarf+".");
 */


    }
}
