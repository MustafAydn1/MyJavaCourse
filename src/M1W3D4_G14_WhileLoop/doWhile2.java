package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class doWhile2 {
    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        // bunu WHİLE YAPTIM AŞAGI DA AMA İSTENDİĞİ GİBİ OLMUYOR. ne yapsamda   dowhile3 de  do il yapınca oldu.

        //şimdi oldu.18.Agust.

        Scanner input=new Scanner(System.in);

        System.out.print("bir karakter giriniz: ");
        String  Str=input.nextLine();              //bu ikisi do ile başlanmadıgı için. başlama modu.
       System.out.println("program Çalışıyor");   //bu ikisi do ile başlanmadıgı için. başlama modu.

        while (!Str.equalsIgnoreCase("x")) {

            Str=input.nextLine();

            if(Str.equalsIgnoreCase("x")) break; // eger x girersen bunun altı calışmayacak.Program bitti ye atlar.
            System.out.println("program Çalışıyor");


        }

        System.out.println("program bitti");










      /*  String harf="";

       do {
         //  System.out.println("bir harf giriniz "); demesek de olur direk harfi alır...
         harf= input.nextLine();

        if(harf.equalsIgnoreCase("x")) break; // döngü kırıcı olarak çalışır...
           System.out.println("program çalışıyor");

       }while (!harf.equalsIgnoreCase("x"));
        System.out.println(" bitti");
*/






    }
}
