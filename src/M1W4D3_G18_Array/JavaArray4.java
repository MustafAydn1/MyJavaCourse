package M1W4D3_G18_Array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray4 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı bir diziye atadıktan sonra
        // ayrı bir döngü ile kaç tanesinin tek sayı olduğunu bulunuz.

  int[] numbers=new int[7];
        Scanner input=new Scanner(System.in);

        int teksayılar=0;

        for(int i=0;i<numbers.length;i++) {
            System.out.print("Lütfen bir sayı giriniz: ");
            numbers[i] = input.nextInt();


            if (numbers[i] % 2 == 1)
                teksayılar++;

        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("teksayılar = " + teksayılar);


     // HOCANIN ÇÖZÜMÜ:
   /*
        int[] dizi=new int[7];
        Scanner oku=new Scanner(System.in);
        int tekMiktari=0;// teksayıları bulmak için if ile kullanılaca bir tür sayaç...

        for(int i=0; i< dizi.length;i++)
        {
            System.out.print("Sayı giriniz = "); // dizinin elemanları dolduruluyor..
            dizi[i]= oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi)); // [1, 2, 3, 4, 5, 6, 7]

        for(int i=0; i< dizi.length;i++)
        {
            if (dizi[i]%2==1) // tek ise
                tekMiktari++;
        }

        System.out.println("tekMiktari = " + tekMiktari);


    */

        }

}
