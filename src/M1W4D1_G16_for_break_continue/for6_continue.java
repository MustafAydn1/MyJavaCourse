package M1W4D1_G16_for_break_continue;

import java.util.Scanner;

public class for6_continue {
    public static void main(String[] args) {
// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşluk veya a harfi geldiğinde bunları yazmasın

        Scanner input=new Scanner(System.in);
        System.out.print("bir cümle yazınız: ");
        String cümle=input.nextLine();
      //  System.out.println(cümle.length()); length sayısı index saysından 1 fazladır. bu yuzden < konur.<= degil.
      // length: kullanıcının anlayacagı uzunluktur... index yazılımcının anlayacagıdır....

        for(int index=0;index<cümle.length();index++)
        {
            if(cümle.charAt(index)=='a' || cümle.charAt(index)==' ')
                continue;
            System.out.print(cümle.charAt(index));
        }




    }
}
