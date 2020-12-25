package M1W4D1_G16_for_break_continue;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
// Girilen bir sayının faktöryelini hesaplayınız.
        Scanner input =new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi=input.nextInt();

       int faktöriyel=1;

       for(int i=1;i<=sayi;i++) {

           faktöriyel = faktöriyel * i;
           System.out.println("faktöriyel = " + faktöriyel);// parantez olmazsa tek sonuç bulur.parantez içinde
       }                                                    // tüm aşamaları ile yazar... parantez varsa dışına yazcan


    }
}
