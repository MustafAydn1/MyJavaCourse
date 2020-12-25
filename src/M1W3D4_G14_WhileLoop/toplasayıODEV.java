package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class toplasayıODEV {
    public static void main(String[] args) {
 /*       Scanner input=new Scanner(System.in);
        System.out.println("sayıları giriniz: ");
        int sayi=input.nextInt();
        int giris =0;
        int toplam=0;
        while (giris<4){

            sayi=input.nextInt();
            toplam=toplam+sayi;
            giris++;

        }

        System.out.println("toplam = " + toplam);

*/

     //   In the loop, when the value is "4", jump directly to the next value.
        // 4 atla döngüue devam et.

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }


    }
}
