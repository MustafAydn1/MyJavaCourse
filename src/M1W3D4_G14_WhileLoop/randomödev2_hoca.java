package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class randomödev2_hoca {

    public static void main(String[] args) {
        // bilgisayar 0-10 arası sayı tutsun(Random). Kullanıcıdan en fazla 3 hak
        // vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.

        Scanner oku=new Scanner(System.in);

        int tutulanSayi= (int)(Math.random()*10) +1;
        int sayac=1;

        while(sayac<=3){

            System.out.print("Sayıyı tahmin edin=");
            int tahmin = oku.nextInt();

            if (tutulanSayi == tahmin){
                System.out.println("tebrikler");
                break;
            }
            else
                System.out.print("Tekrar ");

            sayac++;
        }

        if (sayac == 4)
            System.out.println("Hakkınız bitti, bulamadınız.Tutulan sayı="+tutulanSayi);
    }
}
