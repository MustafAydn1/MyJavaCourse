package M1W4D3_G18_Array;

import java.util.Arrays;

public class JavaArray6 {
    public static void main(String[] args) {
        int[] dizi=new int[5];

        for(int i=0;i<dizi.length;i++)
        {
            dizi[i] = (int)(Math.random()*10)+1;
        }

        // Ekrana yazdırma 1.Yöntem
        for(int i=0;i<dizi.length;i++)
        {
            System.out.println("dizi[i] = " + dizi[i]);
        }

        // Ekrana yazdırma 2.Yöntem
        System.out.println(Arrays.toString(dizi));

        // Ekrana yazdırma 3.Yöntem : Dizi değişkeninin içindeki elemanları deger adını vererek
        // döngüye gönderiyor.
        for (int deger: dizi ) { // burada  dizi[i] yazılamayacagına dikkat et...
            System.out.println("deger = " + deger);
        }

        int toplam=0;
        for(int eleman : dizi){                          // burada  dizi[i] yazılamayacagına dikkat et...
            System.out.println("eleman = " + eleman);
            toplam+=eleman;
        }

        System.out.println("toplam: "+toplam); // foreach ile toplama yöntemi...






    }
}
