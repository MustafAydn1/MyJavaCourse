package M1W4D4_G19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {
        // Kullanıcından alacağınız 5 adet meyve ismini bir diziye atadıktan
        // sonra, elma ismi geçen meyvelerini ekrana ayrı bir döngüde yazdırınız.

        //hocanın cözümünü incele..

        Scanner input=new Scanner(System.in);
        String [] meyve=new String[5];

        for(int i=0;i<meyve.length;i++){
            System.out.print("meyve isimleri giriniz: ");
            meyve[i]=input.nextLine();

        }
       System.out.println("Arrays.toString(meyve) = " + Arrays.toString(meyve)); //???? bunu da yap


        for(int i=0;i<meyve.length;i++){
           if(meyve[i].contains("elma"))
        //if(meyve[i].equalsIgnoreCase("elma")) // bu neden olmuyor.???????// sadece elma olanlar
                System.out.println(meyve[i]);
       //  if(meyve[i].toLowerCase().contains("elma")) //yerelması da yazsan cıkar.
         //    System.out.println(meyve[i]);
        }

    }
}
