package M1W2D2_G7_Stringmethods1;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        // kullanıcıdan alacagınız bir kelimenın son harfinı yazdırınız..

        Scanner input=new Scanner(System.in);
        System.out.print("Adınızı giriniz= ");
        String adı =input.nextLine();
        System.out.println("Adınız= "+adı);


        System.out.println("uzunluk= "+adı.length());
        System.out.println("Son harf="+adı.charAt(adı.length()-1));
        // lenght 0123456 der ama  uzunlugu 7 olarak veririr.
        // fakat char bu 7. indexi mustafa da bulamaz. en son 0123456 vardır. bu yuzden (adı.length()-1) dedik.


        System.out.println("sonharf= "+adı.charAt(adı.length()-1));// en son isteneni ilk yaz ve içiçe devam et. TEK satır



        /* Scanner input=new Scanner(System.in);

        System.out.print("bir kelime gir=");

        String kelime =input.nextLine();
        System.out.println("kelime = " + kelime);

      int uzunluk= kelime.length();
        System.out.println("uzunluk = " + uzunluk);

        char harf=kelime.charAt(7);
        System.out.println("harf = " + harf);


       // uzunluk adedi veriyordu. son index i ise lenght-1 i verecektir.

        int uzunluk=kelime.length();
        char sonkrakter=kelime.charAt(uzunluk-1);

        System.out.println("sonkrakter = " + sonkrakter);

    */


    }

}
