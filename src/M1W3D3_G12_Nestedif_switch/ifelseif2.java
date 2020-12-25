package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class ifelseif2 {
    public static void main(String[] args) {
        // katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
        // ax^2 + bx + c;

        // Çözüm adımları
        // kullanıcıdan a,b,c yi okutun.
        // Delta = b*b - 4*a*c
        // Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2*a)  , x2= (-b - kök(d)) / (2*a)
        // Delta = 0 => 1 tane kök vardır x = -b/2a
        // Delta < 0 ise kök yoktur

        Scanner input=new Scanner(System.in);
        System.out.print("a= ");
        int a=input.nextInt();

        System.out.print("b= ");
        int b=input.nextInt();

        System.out.print("c= ");
        int c=input.nextInt();


        int delta=(b*b)-4*a*c;
        // Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2*a)  , x2= (-b - kök(d)) / (2*a)
        // Delta = 0 => 1 tane kök vardır x = -b/2a
        // Delta < 0 ise kök yoktur

        if(delta>0) { System.out.println("x1= "+((-b+Math.sqrt(delta))/(2*a)));
                     System.out.println("x1= "+((b+Math.sqrt(delta))/(2*a)));}

        else if(delta==0) System.out.println("1 tane kök vardır x = "+ (-b/2*a));
        else System.out.println("kök yoktur");



    }
}
