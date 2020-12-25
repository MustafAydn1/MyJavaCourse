package M1W4D1_G16_for_break_continue;

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {

  /*
        Scanner input=new Scanner(System.in);
        System.out.print("bir yazı giriniz: ");
        String Str=input.nextLine();
//arabacılar caddesideki adam

        int a_miktarı=0;

        for(int i =0; i<Str.length(); i++ ){

            if(Str.charAt(i)=='a')
            a_miktarı++;

            else if (Str.charAt(i)=='c')
                break;

            System.out.println("döngüdeki işleme giren harfler: " +Str.charAt(i));

        }

        System.out.println("a_miktarı = " + a_miktarı);

*/



        // Girilen bir stringdeki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın

        Scanner input=new Scanner(System.in);
        System.out.println("cümle gir. ");
        String cümle=input.nextLine();

        int amiktar=0;


        for(int index=0;index<=cümle.length();index++){

           if( cümle.charAt(index)=='a'){
               amiktar++;}
               else if (cümle.charAt(index)=='c')
                   break;;

           }
        System.out.println("toplam a= "+amiktar);
        }


















    }

