package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 2 değerini ekrana yazdırınız.

        Scanner input =new Scanner(System.in);
        System.out.print("sayı gir: ");
        int sayi=input.nextInt();

       int sonuc; // bunu yazmaya gerek yok

        //int sonuc=(sayi>50) ? 1 : 2; //  "" almaya gerek yok. çünkü string degil. int...Dikkat

        System.out.println( sonuc=(sayi>50) ? 1 : 2); // böyle de olur. 3 durumu da incele. oluyor.





    }
}
