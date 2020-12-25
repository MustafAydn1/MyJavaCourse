package M1W3D4_G14_WhileLoop;

import java.util.Scanner;

public class randomODEV_break {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int randomsayi=(int) (Math.random()*(11));
        // System.out.println("random= " +randomsayi);
        int hak=0;
        System.out.println(randomsayi);

        while (hak<3){
            System.out.print("bir sayı giriniz: ");
            int giriş=input.nextInt();

           if(giriş!=randomsayi)
               System.out.println("tekrar giriniz");

           else if(giriş==randomsayi) {
               System.out.println("giriş başarılı"); break; // break i kendi bloğuna hapset ki çalışssın...
           }
            hak++;

        }
        if(hak==4)
        System.out.println("hakkınız bitti");

    }
}
