package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class doWhile22 {
    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner input= new Scanner(System.in);


       // char harf='';     // bunu charla yap bakalım. input. ???? olacak???
        String harf="";
        do{
            System.out.print("BİR HARF GİRİNİZ: "); // her seferinde sorması için içine aldık.
            harf=input.nextLine();
            if(harf.equalsIgnoreCase("x")) break;
            System.out.println("Program Çalışıyor...");


        }
        while (!harf.equalsIgnoreCase("x"));
        System.out.println("Program bitti....");







    }
}
