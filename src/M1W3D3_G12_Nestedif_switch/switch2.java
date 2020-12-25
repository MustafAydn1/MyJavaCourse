package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {

//  // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir= ");
        int sayı=input.nextInt();

        int sonuc=(sayı/10)%10;

        sonuc=Math.abs(sonuc); // kullanıcının negatif sayı girme ihtimaline karşın. mutlak degerini al.

        switch (sonuc) {    // switch in üzerine tıklayınca böyle yaptı...-> leri koydu...
            case 0 -> System.out.println(" sıfır");
            case 1 -> System.out.println(" bir");
            case 2 -> System.out.println(" iki");
            case 3 -> System.out.println(" üç");
            case 4 -> System.out.println(" dort");
            case 5 -> System.out.println(" beş");
            case 6 -> System.out.println(" altı");
            case 7 -> System.out.println(" yedi");
            case 8 -> System.out.println(" sekiz");
            case 9 -> System.out.println(" dokuz");
        }










    }

}

