package M1W4D1_G16_for_break_continue;

import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        int toplam=0;

        for(int i=0; i<5 ;i++) {
            Scanner input=new Scanner(System.in);  // demekki bunlar döngünün içinde de tanımlanabiliyor.
            System.out.print("sayıları giriniz: "); //
            int sayi=input.nextInt();

            if (sayi > 5 && sayi < 10) {
                 System.out.println("Girdiğiniz sayı 5 ile 10 arasında oldugu için toplanmayacaktır.");
                continue;  // ile bu sayıları atladı.
            }
            toplam = toplam + sayi;

        }
        System.out.println(toplam);
    }
}
