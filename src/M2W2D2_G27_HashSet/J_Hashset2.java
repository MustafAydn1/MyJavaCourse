package M2W2D2_G27_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class J_Hashset2 {
    public static <Hashset> void main(String[] args) {



        HashSet<String> hs= new HashSet<>();
        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red"); // bunu yazmadı...
        hs.add("red");
        hs.add("rED");

       // 1. Yol...
        System.out.println("hs = " + hs); // sırayla yazmadı kendine  göre bir algoritmayla yazdı...

        //hs.   sıralama-sort  ve get--eleman alma yok...    çünkü....  kendine göre  sırası var. hangi indexle alacaksın kiI

       // 2. Yol...
        for(String s: hs){  // for each ile kolayca yazılır... Ammaaa kendine göre bi sırayla verir.sıralama hs den geliyr
            System.out.println("s = " + s);
        }

        //3. Yol...
        Iterator gosterge=hs.iterator(); // sonraki eleman varsa devam...
        while (gosterge.hasNext()){// döngünün başşlaması-gövdesi-bitişi Iterator ile saglanıyor.

            System.out.println("gosterge = " + gosterge.next());

         // gosterge.remove();// o anda gösterdiği elemanı silebiliyor... tamamını...
           // System.out.println("gosterge = " + hs);// elemanları döngü ile teker teker siler
        }


        hs.remove("Red");// bir eleman siler..  ?????
        System.out.println("remove sonrası = " + hs);

        hs.clear(); // set i tamamen  temizler
        System.out.println("hs = " + hs);


    }
}
