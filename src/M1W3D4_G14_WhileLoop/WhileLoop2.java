package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız. sayac lı
        // girilen sayı dahil, ayrı bir sayac değişkeni kullanmayınız sayacsız

        Scanner input= new Scanner(System.in);
        System.out.print(" Toplanmasını istediginiz sayılarun max degerini giriniz ");
        int sayi=input.nextInt();

  /*   int sayac=1;
     int toplam=0;

     while (sayac<=sayi){
         toplam=toplam+sayac;  // toplam+=sayac;
         sayac++;
     }

        System.out.println("toplam= "+toplam);
*/

        int toplam=0;

        while (sayi!=0) {
            toplam = toplam + sayi;

            sayi--;

        }

        System.out.println("toplam= "+toplam);








        /*int sayı=1;

        while (sayı<=5){
            System.out.println(sayı);
            sayı++;
        }
*/





    }
}
