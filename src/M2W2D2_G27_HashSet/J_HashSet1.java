package M2W2D2_G27_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class J_HashSet1 {
    public static void main(String[] args) {
        // Array->ArrayList->Set ?
        // Collections : Koleksiyonlar
        // HashSet : Kendine göre bir algoritma ile sıralayarak saklıyor.Gezinme hızlı.
        // LinkedHashSet : Kullanıcını ekleme sırasına göre saklıyor.Dolmuş sırası kuyrugu...
        // TreeSet : her veri girildiğinde tüm verileri küçükten büyüğe(ALFABETİK/SAYISAL) olacak şekilde sıralayarak saklıyor.

      //OLAY BU................!!!!!!!!!!!!
        // Avantajı :Tüm setlerde , aynı elemanı 2 kez eklemiyor.!!!!!

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);

        System.out.println("list = " + list);


        Set<Integer> hs1= new HashSet<>();// bu şekildede tanımlanabilir....
        
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);                          // eleman ekleme arraList gibi
        boolean eklediMİ1 =hs.add(2);
        System.out.println("eklediMİ1 = " + eklediMİ1); // ekleyip eklemediğini görmek için sorduk...
        hs.add(3);
        hs.add(1);
        boolean eklediMi =hs.add(2);
        System.out.println("2 yi birkez daha eklediMi = " + eklediMi); // ekleyip eklemediğini sorduk...

        System.out.println("hs = " + hs); // arrayList ler gibi yazılıyor.
    }
}
