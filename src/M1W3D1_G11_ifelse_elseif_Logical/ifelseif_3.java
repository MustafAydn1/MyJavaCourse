package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ifelseif_3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Sayı Gir:");
        int sayi=input.nextInt();

        if(sayi>0)                       System.out.println("pozitif");
        else if (sayi<0)                 System.out.println("NEGATİF");
        else                             System.out.println("sıfır");
    }
}
