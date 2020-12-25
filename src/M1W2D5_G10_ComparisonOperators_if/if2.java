package M1W2D5_G10_ComparisonOperators_if;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.Sıfır ise sıfır yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.print("sayı gir= ");
        int sayi=input.nextInt();

        if(sayi>0){
            System.out.println("sayı pozıtıftir");  // HİÇBİR SÜSLÜ PARANTEZ KULLANMADAN DA YAPABİLİRSİN.
        }

        if(sayi<0){
            System.out.println("sayı negatiftir");
        }
        if(sayi==0){
            System.out.println("sayı sıfırdır.");
        }
    }
}
