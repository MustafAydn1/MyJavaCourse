package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class Whileloop3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Toplanmasını istediginiz sayılarun max degerini giriniz ");
        int sayi=input.nextInt();


        int toplam=0;

        while (sayi>0){
            toplam=toplam+sayi;  // toplam+=sayac;
            sayi--;
        }

        System.out.println("toplam= "+toplam);









    }
}
