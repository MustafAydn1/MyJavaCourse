package M3W3D3_G50_Interface.task2;
// Girilen bir sayının basamaklarına göre tersiniz yazdırınız.
import java.util.Scanner;

// ÇOK GUZEL BİR CÖZUM...

public class Soru1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Tersini istediğiniz bir sayı Giriniz: ");
        int sayi=input.nextInt();

        int tersiSayi=0;

        while (sayi>0){

            int basamak=sayi%10;
            sayi=sayi/10;
            tersiSayi= tersiSayi * 10 + basamak;

        }

        //    basamak  sayı     tersiSayı
        // 1-     2     2345       2
        // 2-     5     234        25
        // 3-     4     23         254
        // 4-     3     2          2543
        // 5-     2     0          25432
        System.out.println("tersiSayi = " + tersiSayi);
    }
}
