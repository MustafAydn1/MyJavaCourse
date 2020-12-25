package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class OrnekSc3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı1 Giriniz = ");
        int sayi1 = input.nextInt();

        System.out.print("Sayı2 Giriniz = ");
        int sayi2 = input.nextInt();

        int toplam= sayi1+sayi2;
        System.out.println("toplam = " + toplam);
        System.out.println("TOPLAM= "+ sayi1+sayi2);  // böyle yazarsam stringmiş gibi sadece ifadeleri concatenation(+) yapar.
        System.out.println("Toplam= " +(sayi1+sayi2) ); // parantezle yaptıgımda matematiksel bi ifade oldugunu anlar.







    }
}
