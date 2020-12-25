package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ifelseif_Logic_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Saat Giriniz= ");
        int saat=input.nextInt();

        if( saat<=2 ) System.out.println(" 5£ ");
        else if(saat<=5) System.out.println("10£ ");
        else System.out.println("15£");


// yukarıda 0 girince neden 10 £  oluyor. bi bak...
/*

        if (saat <=2) {
            System.out.println("5 €");
        }
        else
        if (saat <=5) {
            System.out.println("10 €");
        }
        else {
            System.out.println("15 €");

        }
*/


    }
}
