package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class MathClass_Random0 {
    public static void main(String[] args) {
// 0 ile 5  arasında rasgele sayılar üreten bir program yazınız...

        int sayi= (int)(Math.random()*6); // EGER 1 EKLEMEZSEN 0 ile 5 arasındaki sayılar gelir..

        System.out.println("Gelen Sayı= "+sayi);
        // 1 ile hangi aralıkta gelsin istiyorsan o sayı ile çarp ve 1 ekle...


        // Soru : 0 ile 6 arasında random sayı üreten programı yazınız.

        int sayi1=(int)(Math.random()*6+1);
        System.out.println("yeni aralık = " + sayi1);




//*************************************************************************
/* BELLİ DEGERLER ARASINDA RANDOM DEGERLER İSTİYORSAN

        Math.random()*((max-min)+1)+min

        FORMÜLÜNÜ UYGULAMALISIN..

        Scanner input=new Scanner(System.in);

        int max=input.nextInt();
        int min=input.nextInt();


        int üretilensayımız=(int)(Math.random()*((max-min)+1)+min);
        System.out.println("sayınız= "+üretilensayımız);

        //negatif sayılar uretmek istersen max ile min degerin yerini değiştir. dene
        // (Math.random()*((max-min) bu kadarını yazarak dene

 */


    }
}
