package M1W2D5_G10_ComparisonOperators_if;

import java.util.Scanner;

public class if7 {
    public static void main(String[] args) {

        // Girilen bir sayının onlar basamağının tek mi çift mi olduğunu bulunuz.

        Scanner input=new  Scanner(System.in);
        System.out.print("sayı gir=");
        int sayım=input.nextInt();
        System.out.println("sayımız = " + sayım);

/*     //BİRKAÇ ŞEKİLDE ÇÖZÜLEBİLİR...

       int a=(sayım/10)%10;

        int b=a%2;

        if(b==1)
            System.out.println( "tektir");
        if(b==0)
            System.out.println("çifttir");

*/

        int c=(sayım/10)%2;

        if(c==1)
            System.out.println("tektir");
        if(c==0)
            System.out.println("çifttir");




    }
}
