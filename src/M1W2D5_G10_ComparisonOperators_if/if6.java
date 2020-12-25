package M1W2D5_G10_ComparisonOperators_if;

import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {

        // Girilen 3 sayıdan en büyük olanını bulunuz.
        Scanner input=new  Scanner(System.in);

        System.out.print("sayı1= ");
        int sayı1=input.nextInt();

        System.out.print("sayi2= ");
        int sayi2=input.nextInt();

        System.out.print("sayi3= ");
        int sayi3=input.nextInt();


        int enBüyük=sayı1;

        if(sayi2>enBüyük)
            enBüyük=sayi2;

        if(sayi3>enBüyük)
            enBüyük=sayi3;

        System.out.println("enBüyük = " + enBüyük);


       /* if (enBüyük>sayi2)
            enBüyük=sayı1;
        if(enBüyük>sayi3)
            enBüyük=sayı1;
        System.out.println("EENN BÜYÜK= "+enBüyük);
        System.out.println("EENN BÜYÜK= "+sayı1);

        BU ŞEKİLDE YAPARSAN YANLIŞ ÇIKIYOR. ÇÜNKÜ  ATAMA YAPTIGIN(assignment statement ) enBüyük degeri
        ifadesi ile yola devam etmen gerek. tekrar sayı1 e dönemezsin....

*/



       int enküçük=sayı1;
        if(sayi2<enküçük)
            enküçük=sayi2;
        if(sayi3<enküçük)
          enküçük=sayi3;
        System.out.println("enküçük = " +enküçük);



       // int ortancasayı=sayı1; //çalış
       //if(((sayı1+sayi3)/2)>sayi2)
          // System.out.println("ORTANCA SAYI= "+sayi2);









    }
}
