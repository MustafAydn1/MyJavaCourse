package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class OrnekSc2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Adınız= ");

        String Adınız= input.nextLine();


        System.out.print("Soyadınız= ");

        String Soyadınız= input.nextLine();

        System.out.println("Adınız  Ve  Soyadınız= "+Adınız+"  "+Soyadınız);

    }

}
