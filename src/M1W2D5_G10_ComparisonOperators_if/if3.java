package M1W2D5_G10_ComparisonOperators_if;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını ekrana yazdırınız, eşit ise eşit yazdırınız.

        Scanner input=new Scanner(System.in);
        System.out.print("birinci sayıyı gir= ");
        int sayi1=input.nextInt();

        System.out.print("ikinci sayıyı giriniz= ");
        int sayi2=input.nextInt();

        if(sayi1>sayi2){
            System.out.println("büyük olan = " + sayi1+ " dir");
            System.out.println("küçük olan= "+ sayi2 );
        }

        if(sayi1<sayi2) {
            System.out.println("küçülk olan= "+sayi1);
            System.out.println("buyuk olan= "+sayi2);

        }

        if(sayi1==sayi2){
            System.out.println("sayılar birbirine eşittir");
        }

/*
        // Girilen iki sayıdan büyük olanını ekrana yazdırınız, eşit ise eşit yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci Sayıyı giriniz=");
        int sayi1=oku.nextInt();

        System.out.print("İkinci Sayıyı giriniz=");
        int sayi2=oku.nextInt();

        if (sayi1 > sayi2)
            System.out.println("1.Sayı büyüktür : "+ sayi1);

        if (sayi2 > sayi1)
            System.out.println("2.Sayı büyüktür : "+ sayi2);

        if (sayi1 == sayi2)
            System.out.println("2 sayı da eşittir.");
    }
 */
    }
}
