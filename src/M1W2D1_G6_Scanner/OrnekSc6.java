package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class OrnekSc6 {
    public static void main(String[] args) {

        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde adres bilgisi alarak yazdırınız.

        Scanner input= new Scanner(System.in);

        System.out.print("Cadde Adı= ");
        String cadde=input.nextLine();

        System.out.print("Sokak Adı=");
        String sokak= input.nextLine();

        System.out.print("Posta Kodu= ");
        int posta=input.nextInt();

        String a=input.nextLine();   // dummy code uygulayarak bunu aşarsın...int ten sonra Stringe gecerken bu sorun olablr.
       // Scanner input2= new Scanner(System.in);  // DEMEK Kİ AYNI TİPTE OLANLARI AYNI KULLAN. FARKLI OLUNCA FARKLILASTIR???
        System.out.print("ÜLKE ADI= ");        // HEP Mİ BÖYLEDİR ACABA???
        String ülke=input.nextLine();

        System.out.println("\nCADDENİZ= "+cadde+ "\nSokagınız="+sokak+"\nPosta Kodunuz= "+posta+"\nÜlkenız= "+ülke);








    }
}
