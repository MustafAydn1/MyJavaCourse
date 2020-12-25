package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ifelseif_2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("VİZE NOT GİRİNİZ:");
        double vize=input.nextDouble();

        System.out.print("FİNAL NOT GİRİNİZ:");
        double finall=input.nextDouble();

        double ort =(vize*0.4)+(finall*0.6);

        if(ort>=60){
            System.out.println("Geçtiniz.");
            System.out.println("Tebrikler.");
        }
        else System.out.println("Kaldınız");

//********************************************************
        System.out.print("Bir sayı giriniz: ");

        int sayi=input.nextInt();
        if(sayi==0) System.out.println("cift");
        else System.out.println("tek");




    }
}
