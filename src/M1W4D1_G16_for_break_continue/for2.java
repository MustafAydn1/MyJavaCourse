package M1W4D1_G16_for_break_continue;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz: "); // bu int giriş in üzerinde olmak zorundadır.
        int giriş=input.nextInt();
        int absolute=Math.abs(giriş); // eger negatif sayı girme durumu varsa. absulete tabii tut...
        int toplam=0;

        for(int i=0;i<=absolute;i++){

            toplam=toplam+i; //toplam+=i

        }
        System.out.println("toplam= "+toplam);




    }
}
