package M1W4D3_G18_Array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray5 {
    public static void main(String[] args) {
        // 5 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. ve elemanları ekrana 2 farklı şekilde yazdırınız.

        int[] numbers=new int[5];

       // Scanner input=new Scanner(System.in);
        //System.out.print("sayı: ");
        //numbers[i]=input.nextInt();

        for(int i=0;i<numbers.length;i++){
           //   int randomnumbers =(int)(Math.random()*11);
           //numbers[i]=randomnumbers;

            numbers[i]=(int)(Math.random()*10);
            System.out.println("dizi"+i+"=  "+numbers[i]);
           // System.out.println("deger"+i+"= "+numbers[i]);
            //System.out.println(i+"."+"Eleman= "+numbers[i]);
            //System.out.println("***********************************");

        }
        System.out.println(Arrays.toString(numbers));
// yukarıdaki şekilde yaparsam her indexin sonuçlarını tek tek bulup bitirip, digerine geçer düzensiz olur...
// bu yuzden ayrı ayrı for döngüsü tanımlayıp tek tek bunları yazıp herbirini toplu halde cıktıda görmeliyim
// AYRI AYRI DÖNGÜ TANIMLAMAZ İSEK OLMAZ ÇÜNKÜ indexler ilk döngünün içinde kalır...

        for(int i=0;i<numbers.length;i++){

            System.out.println("deger= "+numbers[i]);
        }

        for (int DİZİ_ELEMANLARI:numbers) { // numbers ı int DİZİ_ELEMANLARI na eşitlediğim için artık number yazma
            System.out.println("DİZİ_ELEMANLARI = " + DİZİ_ELEMANLARI);
// bu kurala for each  deniyor...
        }





        /*
        [2, 8, 8, 2, 10]
deger = 2
deger = 8
deger = 8
deger = 2
deger = 10
eleman = 2
eleman = 8
eleman = 8
eleman = 2
eleman = 10

         */

    }
}
