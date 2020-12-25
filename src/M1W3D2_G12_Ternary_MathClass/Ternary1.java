package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class  Ternary1 {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.


        Scanner input=new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayi=input.nextInt();

        String text="";

        if(sayi%2==0)  text="çift";
        else           text="tek";

        System.out.println(text);
 // bu şekilde yazmayı da ögren.... text ile.. önemli

 //ternary ile

    text=(sayi%2==0) ? "çift":"tek"; // string oldugu için "" koyduk. char olsaydı '' olurdu. int e zırnık yok.

        System.out.println(text);









    }

}
