package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class ODEV5 {
    public static void main(String[] args) {
        /*
       Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını ayrı ayrı bularak yazdırınız.
       dongu olusturup 10 adet sayi alacagiz
bu sayinin tek veya cift oldugunu sorgulatacagiz
tek olanlari ve cift olanlari ayri sayaclarda saydirip sonucta yazdiracagiz
         */

        Scanner input=new Scanner(System.in);
        int sayi;
        int giriş=0;

        while (giriş<10){
            sayi=input.nextInt();

            if (sayi%2==0) System.out.println(sayi+"  çift sayıdır");
            else System.out.println(sayi+"  tek sayıdır");

            giriş++;
        }





    }
}
