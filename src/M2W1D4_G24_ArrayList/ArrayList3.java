package M2W1D4_G24_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Sıralı değil ="+numbers);
        // Sıralama yapar
        Collections.sort(numbers);
        System.out.println("Sıralı ="+numbers);

        //en büyük değeri bulur
        int max=Collections.max(numbers);
        System.out.println("max = " + max);
        //en küçük değeri bulur
        int min=Collections.min(numbers);
        System.out.println("min = " + min);

        // listeyi tersine çevirir
        Collections.reverse(numbers);
        System.out.println("ters = " + numbers);

        //bütün elemanlara  bir değer atama.
        Collections.fill(numbers,101);
        System.out.println("fill den sonra = " + numbers);

        //belli bir değer sahip elemanları yenisi ile değiştirir
        Collections.replaceAll(numbers, 101, 5);
        System.out.println("replaceAll dan sonra = " + numbers);
    }
}
