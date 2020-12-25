package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class Mentoring2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // int sayi;   // herhangi bir sayı vermeden böyle de oluyor.
        //String sayi2; // ="10"; // illa ki tırnak kullan

        int sayi=10;        //  Bu sayıların bi önemi var mı
        String sayi2="12";  //

        System.out.print( "bir sayı gir= ");
        sayi=scan.nextInt();

        scan.nextLine();

        System.out.print("baska sayı gir= ");
        sayi2=scan.nextLine();
        int sayı3=Integer.parseInt(sayi2);

       // int toplam=(sayi+sayi2);

        System.out.println("toplam= "+ sayi2+sayi);
        System.out.println("toplam="+ (sayi+sayi2));// dönüstürme yapmadan  parantez de olsa strig  yazar.
        System.out.println("toplam= "+ (sayi+sayı3)); // parantez ile

        //mentorden dinle...









    }
}
