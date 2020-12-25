package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String name,surname,gender;
        int age;
        double height;


        System.out.print("Adınızı Girin= ");
        name=scan.nextLine();

        System.out.print("Soyadınız= ");
        surname=scan.nextLine();

        System.out.print("Yasınız= ");
        age=scan.nextInt();
        scan.nextLine();

        System.out.print("Boyunuz= ");
        height=scan.nextDouble();
        scan.nextLine();

        System.out.print("cinsiyetiniz= ");
        gender=scan.nextLine();

        System.out.println("Benim Adım= "+name+" "+"Soyadım= "+surname+"Yaşınız=  "+age+"Boyunuz=  "+height+"cinsiyetiniz= "+gender);







    }

}
