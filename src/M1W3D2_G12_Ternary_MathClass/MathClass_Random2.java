package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class MathClass_Random2 {

    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri isteyerek random sayı üretiniz
        // ve üretilen sayıyı ekrana yazdırınız.

        Scanner input= new Scanner(System.in);
        System.out.print("Üst Deger Giriniz;");
        int max=input.nextInt();
        System.out.print(" Deger Giriniz;");
        int min=input.nextInt();

        int beklenensayi=(int)(Math.random()*((max-min)+1)+min);
        System.out.println("Sayı = "+beklenensayi);








    }
}