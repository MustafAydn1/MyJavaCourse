package M2W1D3_G23_Methods2;

import java.util.Arrays;
import java.util.Scanner;

public class Ja_Methods_Overloading6_dizi {
    public static void main(String[] args) {
        // 5 elemanlı bir diziyi kullanıcı doldurduktan sonra
        // bir fonksiyonda tek elemalara 0 değeri atayınız.
        // diziyi main de yazdırınınız.
        int[] dizi=new int[5];
        Scanner oku=new Scanner(System.in);
      //  System.out.print("Sayi giriniz=");        buradaysa 1 kez yazar, 5 adet sayı girersin...

        for(int i=0;i<5;i++) {
            System.out.print("Sayi giriniz=");   // burada ise 5 kez aynı şeyi yazarak sayı alır....
            dizi[i]=oku.nextInt();
        }
        System.out.println("Önce : " + Arrays.toString(  dizi )  );
        System.out.println("Sonra : " +  Arrays.toString(  teklereSifirAta(dizi)  )  );
    }

    public static int[] teklereSifirAta(int[] DİZİ) // metodlara dizi yazımı böyle olur...
    {                                              // ÜSTTEKİNİN İSMİ İLE FARKLI OLMASI SORUN OLMAZ... niye???

 // sanırım;bu metodun adı, yani şekil, esas yukarıda olan... return ile degeri atıyor.degeri bulma adımları,
// parametreleri, atamaları, referansları... bu yuzden farklı da olsa sorun yok...
// main e al bu degeri kullan demek için yapılanlar...

        // eğer dizinin elemanı tek ise 0 atanıyor
        for(int i=0;i<DİZİ.length;i++){
            if (DİZİ[i]%2 == 1)
                DİZİ[i]=0;
        }

        return DİZİ;
    }
}
