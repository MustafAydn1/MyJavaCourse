package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {


        Scanner oku= new Scanner(System.in); // klavye den veri girişi yplck.
        System.out.print("Bir sayı Giriniz= ");
        int sayi=oku.nextInt(); //bunu tanimladığımız gibi aşagıda tanımlıyoruz. bu mesela sayının alt sınırı olabılır sayı=10 da denebilir.

       // sayi= oku.nextInt(); // okuma işlemi burada kursör bekliyor.
        System.out.println("sayi = " + sayi);






    }
}
