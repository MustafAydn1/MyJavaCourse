package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class dowhile3 {
    // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
    // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        String Karakter;

        do{
            System.out.print("bir karakter giriniz: ");
           Karakter= input.nextLine();

           if(Karakter.equalsIgnoreCase("x")) break; // break= döngü kırıcıdır.

            System.out.println("program çalışıyor");
        } while
            (!Karakter.equalsIgnoreCase("x"));
            System.out.println("Program sonlandırıldı");
// eger do blokuna input un altına if i girmezsem x girildiğinde program çalışıyor yazacak.





    }
}
