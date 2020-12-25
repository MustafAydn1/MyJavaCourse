package M1W4D4_G19_Array;

import java.util.Arrays;

public class JavaArray_Methods {
    public static void main(String[] args) {
        // Arrays.toString(Array) -> dizinini bütün elamanlarını yazdırır.
        String[] names={"ahmet","ayşe","kaya","deniz"};


        System.out.println(".toString:"+ Arrays.toString(names));



        //Arrays.sort(array) diziyi sıralar...sayı iseler sayıları,***kelime ise kelimeleri alfabetik sıralar...
        Arrays.sort(names);
        System.out.println(".sort :"+ Arrays.toString(names));


        //Arrays.equals(array1,array2) -> Dizilerin Bütün ELEMANLARININ sırası ile aynı olup(içini kontrol)
        // olmadığını kontrol eder. (a==b dizi olarak demek değildir. yanlış olur)
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {2, 1, 3};

        System.out.println("a==b " + Arrays.equals(a,b)); // true
        System.out.println("a==c " + Arrays.equals(a,c)); // false

        //Arrays.fill(array, value); bütün elemanlara value değerini atar.hepsini aynı yapar..
        // dizi dolu da olsa boşta olsa verilen degeri atar...
        int[] numbers=new int[5];
        System.out.println("atamadan önce değerler:"+ Arrays.toString(numbers));
        Arrays.fill(numbers,7);
        System.out.println("atamadan sonra değerler:"+ Arrays.toString(numbers));

        // Arrays.binarySearch(array, value) SIRALI bir dizide aranan değer var ise  index ini veriri,
        // sıralı degilse ise veya dizi de yoksa;  - değer döndürür.(sıralı degilse işe yaramaz)
        int[] rakamlar={2,7,4,13,8,12,6,3};
        System.out.println("önce : 8 in ind= "+ Arrays.binarySearch(rakamlar,8));
        System.out.println("önce : 12 in ind= "+ Arrays.binarySearch(rakamlar,12));
        System.out.println("önce : 123 in ind= "+ Arrays.binarySearch(rakamlar,123));

        Arrays.sort(rakamlar);
        System.out.println("sonra : 8 in ind= "+ Arrays.binarySearch(rakamlar,8));
        System.out.println("önce : 12 in ind= "+ Arrays.binarySearch(rakamlar,12));


    }
}
