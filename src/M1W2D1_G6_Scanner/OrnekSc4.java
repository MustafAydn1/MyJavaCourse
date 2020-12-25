package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class OrnekSc4 {
    public static void main(String[] args) {
        // boy kilo tek satır da yazdır.

        Scanner input= new Scanner(System.in);

        System.out.print("Boyunuz= ");
        double Boyum= input.nextDouble();

        System.out.print("Kilonuz= ");
        double Kilom= input.nextDouble();


        System.out.println("Boy= "+ Boyum+" \n"+ "Kilo= "+Kilom); // 1.23 yazdım kabul etmedi. Nasıl cözecem.
        // double ın ismi olan boyum yazılacak veriyi tanımlamak için kullanılan isimdir.oradan çekerek işlem yapıyorum.
        //  DİKKAT= Boyunuz ifadesi kullanıcının ekranda gördugudur.Boy ise degeri yazıp enter e basınca ekrana gelecek olandır.


    }
}
