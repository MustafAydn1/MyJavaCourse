package M2W2D2_G27_HashSet;

import java.util.HashSet;

public class j_Hashset3 {

    public static void main(String[] args) {
        HashSet<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("birleşik hali = " + birlestir(setA, setB));
        System.out.println("A/B : Farkı  = " + farkiBul(setA, setB));
        System.out.println("B/a : Farkı  = " + farkiBul(setB, setA));
        System.out.println("Kesişimi  = " + kesisimBul(setA, setB));

    }

    public static HashSet<Integer> birlestir (HashSet<Integer> a, HashSet<Integer> b){

        HashSet<Integer>birlesik =new HashSet<>(); // yeni bir HashSet tanımladım. a ve b yi bunda birleştirecegim.

        birlesik.addAll(a); // addAll olduguna dikkat et... a nın tamamını ekler...
        birlesik.addAll(b);// a ve b sırayla eklendi... Aynı olan elemanlar yazılmadı.

        return birlesik;

    }
    public static HashSet<Integer> farkiBul (HashSet<Integer> a, HashSet<Integer> b){
// bu kısmı tekrar izle... farklı yöntem de vardı.ikinci video olabilir...

       HashSet<Integer> fark =new HashSet<>(a); // fark, a ya eşit olmuş oldu.bu şekil de a bozulmamış oldu.
        fark.removeAll(b);
       // HashSet<Integer> fark= a.removeAll(b); bu şekilde olabilirdi neden olmuyor...
        //return fark;
       return fark;

    }
    // retainAll : sadece iki HashSet in kesişimini alır.
    public static HashSet<Integer>kesisimBul(HashSet<Integer> a, HashSet<Integer> b){

        HashSet<Integer>kesisim =new HashSet<>(a);// kesişim, a ya eşit olmuş oldu.bu şekil de a bozulmamış oldu.

       kesisim.retainAll(b);
       return kesisim;
    }

}
