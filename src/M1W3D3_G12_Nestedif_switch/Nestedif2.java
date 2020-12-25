package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class Nestedif2 {
    public static void main(String[] args) {
        // Girilen bir sayının önce 100 den küçük ise, 100 den küçük yazsın
        // devamında 50 den küçük ise 50 den küçük yazsın
        // devamında 25 den küçük ise 25 den küçük yazsın.

        Scanner input=new Scanner(System.in);
        System.out.print(" bir sayı giriniz= ");
        int sayi=input.nextInt();

        if(sayi<100) {
            System.out.println("100 den küçüktür");
            if (sayi < 50) {
                System.out.println("50 den küçüktür");
                if (sayi < 25) {
                    System.out.println("25 den küçüktür");
                }
            }

        }

// bu örnek bu konu için uygun bir örnek degil. bir öceki rating örnegi konuya uygundu...
// iç içe if yapmasaydık bilgisar tüm if lere bakacakti.
    }
}
