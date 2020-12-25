package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü buluarak yazdırınız.
        Scanner input= new Scanner(System.in);



        int enb=0;
        int sayac=1;
        while (sayac<=5) {
            System.out.print(sayac+". sayı  ");// 5 kez sayı girecegi için while in içinde tanımlamak zorundayım.
            int sayi = input.nextInt();

            enb = Math.max(enb, sayi);

            sayac++;

        }

        System.out.println("enbyk= "+enb);




   /*  int enb;
        int sayac=1;
       while(sayac<=5)


        System.out.println("sayı giriniz: ");
        int sayi=input.nextInt();



        sayac++;










           /*
           ner input = new Scanner(System.in);
        int dongu = 0;
        int max=0;

        while (dongu<5) {
            System.out.print("Bir sayı giriniz");
            int sayi = input.nextInt();
            max = Math.max(max, sayi);
            dongu++;
        }
        System.out.println("Max değer:" + max);


            */





    }
}
