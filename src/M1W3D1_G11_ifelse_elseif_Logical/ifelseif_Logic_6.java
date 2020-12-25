package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ifelseif_Logic_6 {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.
        Scanner input=new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        double sayi1=input.nextDouble();

        System.out.print("başka sayı giriniz: ");
        double sayi2=input.nextDouble();
        String dummy=input.nextLine();

        System.out.println("Toplam için T\nÇıkrma için Ç\nÇarpma için P\nBölme için B ye\n basınız.");

       String harf=input.nextLine();
        if(harf.equalsIgnoreCase("T")) System.out.println("toplama= "+(int)(sayi2+sayi1));
        else if(harf.equalsIgnoreCase("Ç")) System.out.println("çıkarma =" +(sayi1-sayi2));

        else if(harf.equalsIgnoreCase("B")) System.out.println("Bölme= "+(sayi1/sayi2));
        else if(harf.equalsIgnoreCase("p")) System.out.println("Çarpma= "+(sayi1*sayi2));

// equalsignorecase den yapmak daha iyi
       // to upper ve tolower  ogren

    }
}
