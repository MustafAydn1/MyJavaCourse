package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ifelseif_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Notu giriniz: ");
        int ogrNot=input.nextInt();

        if(ogrNot>=50) {
            System.out.println("Gectiniz");
            System.out.println("Tebrikler"); // burada Q parantez olmazsa kalsa da tebrikler cıkıyor...
        }
        if(ogrNot<50)
            System.out.println("kaldınız");

        // yukarıdaki 3 adet if in yerine aşağıdaki aynı görevi daha hızlı sağlar çünkü tek şart
        // kontrol eder aşağıdaki yapı, yukarıdaki her iki if in şartınız da kontrol eder.

        if (ogrNot >= 50) {
            System.out.println("Geçtiniz.");
            System.out.println("Tebrikler");

        }
        else {
            System.out.println("Kaldınız.");
        }

    }
}


