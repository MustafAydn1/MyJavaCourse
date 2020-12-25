package M1W4D3_G18_Array;

import java.util.Scanner;

public class JavaArray3 {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

         int[]dizi=new int[5];
        Scanner input=new Scanner(System.in); // for un içinde de olur. burada da olur...
        int toplam=0;

        for (int i = 0; i <dizi.length ; i++) {

      System.out.print("Deger giriniz: "); // Kullanıcı dizinin 5 elemanını doldurmaya başladı
            dizi[i]=input.nextInt(); // burayı dizi[i] olarak tanımla... !!!!!!!!!!!!!!!!!!!!!!!!!

           toplam+=dizi[i];

            }
        System.out.println("toplam= "+toplam);
        int ort=(toplam/dizi.length);

      int ortalamayıGecenMiktar=0;
        for (int i = 0; i <dizi.length ; i++) {
            if(dizi[i]>ort) {
                System.out.println("ort. gecen degerler= " + dizi[i]);
                ortalamayıGecenMiktar++;// ortlamayı gecen her eleman için 1 artacak. bu yöntemi ögren!!!!!!!!!!
            }
        }
        System.out.println(ortalamayıGecenMiktar);


// HOCANIN  ÇÖZUMU AMA BENİM ÇÖZUMDE YANLIŞ CIKIYOR. AYNI ŞEYLER...,

 /*       int[] dizi=new int[5]; // 0,1,2,3,4

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for(int i=0; i<dizi.length;i++) // i nin değeri 0,1,2,3,4
        {
            System.out.print("Sayı giriniz=");
            dizi[i]= oku.nextInt();
            toplam+=dizi[i];
        }

        int ort = toplam / dizi.length;

        int ortGecenMik=0;
        for(int i=0; i<dizi.length;i++)
        {
            if (dizi[i]> ort)
                ortGecenMik++;
        }

        System.out.println("ortGecenMik = " + ortGecenMik);

  */
    }
}
