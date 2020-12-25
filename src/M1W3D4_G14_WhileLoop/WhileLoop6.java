package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {

        // Kullanıcıdan Sıfır girilene sayı isteyiniz.
        // bu soruyu önce while ile çözünüz.Sonra do-While

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı giriniz= ");
      int sayi = oku.nextInt();

       while(sayi != 0) {
           System.out.print("Sayı giriniz= ");
           sayi = oku.nextInt();
        }
// burada while in içine şart yazabilmek için sayı ifadesini tanimlamak lazım. yoksa işleme başlayamıyor.
// while den önce yaz. sonra while dahil et. ve döngüye girsin.tulumbaya konan ilk bardak su gibi..
        // do önce işlemi direk başlatıyor... sonda while ile oldugundan, while ile dönguye sokuyor.
        //do aksiyon insanı***önce yapıyor,sonra düşünüyor....*** while düşünce adamı...







    }
}
