package M1W3D4_G14_WhileLoop;

import java.awt.*;
import java.util.Scanner;

public class doWhile1 {
    public static void main(String[] args) {
// Kullanıcıdan Sıfır girilene sayı isteyiniz.

        Scanner input=new Scanner(System.in);


        int sayi; // bunu do nun içinde yaparsan while göremez. burada yapmalısın...

        do{
            System.out.print("sayı giriniz: ");
             sayi=input.nextInt();
        }
        while (sayi!=0);

        // do önce işlemi direk başlatıyor... sonda while ile oldugundan, while ile dönguye sokuyor.
        //do aksiyon insanı***önce yapıyor,sonra düşünüyor....*** while düşünce adamı...

    }
}
