package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ODEV_ifelseif1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Bir x Koordinat Giriniz: " );
        int x=input.nextInt();
       // System.out.println("( , )");
        System.out.print("Bir y Koordinatı Giriniz: ");
        int y=input.nextInt();

        if(x>0 && y>0)      System.out.println("(" +x+"," +y +")" +"  Noktası 1.Bölgededir");
        else if(x<0 && y>0) System.out.println("(" +x+"," +y +")" +"  Noktası 2.Bölgededir");
        else if(x<0 && y<0) System.out.println("(" +x+"," +y +")" +"  Noktası 3.Bölgededir");
        else                System.out.println("(" +x+"," +y +")" +"  Noktası 4.Bölgededir");



         //else(x > 0 && y < 0)  System.out.println("(" + x + "," + y + ")" + "  Noktası 4.Bölgededir");
        // else ye şartı yazma

















    }



}
