package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ODEV_ifelseif2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bir x Koordinatı Giriniz: ");
        int x=input.nextInt();

        System.out.print("Bir y Koordinatı Giriniz: ");
        int y=input.nextInt();

        if(y>1 && y<4 && x>-2 && x<8) System.out.println("("+x+","+y+")"+"  Noktası Dikdötrgenin İçindedir");

       else if(y==1 || y==4  && x==-2 || x==8) System.out.println("("+x+","+y+")"+"  Noktası Dikdötrgenin Üzerindedir");
        else                           System.out.println("("+x+","+y+")"+"  Noktası Dikdötrgenin Dışındadır.");


       /*else if(y==4 && x>=-2 && x<=8)  System.out.println("("+x+","+y+")"+"  Noktası Dikdötrgenin Üzerindedir");

       //else if(y>=1 && y<=4 && x==-2)  System.out.println("("+x+","+y+")"+"  Noktası Dikdötrgenin Üzerindedir");

     else if(y>=1 && y<=4 &&  x==8) System.out.println("("+x+","+y+")"+"  Noktası Dikdötrgenin Üzerindedir");  */











    }
}
