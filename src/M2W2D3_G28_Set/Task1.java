package M2W2D3_G28_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    // Create method that generates a HashSet of
    // given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
    // bu işlemi generateSet() metodunda yapınız.
    // -Sonra AddElements şeklind ebir metodlar 1 veya 1 den fazla sayı eklenebilen metodu
    // yazınız.
    // -Sonra oluşmuş olan maindeki hashSet i convertToArray isimli bir metoda göndererek
    // main de bir Array e eşitleyiniz.
    // -Sonra oluşmuş olan maindeki hashSet i convertToArrayList isimli bir metoda göndererek
    // main de bir ArrayList e eşitleyiniz.
    public static void main(String[] args) {
        // metoda gönderilen değerler primitive yani temel değişkenler değilse, yani referans değişkenler ise,
        // metodda yapılan değişiklik bu değişkenin kendisinde yapıldığından, main de de değişiklik aynen görülür.      

        //   PARÇA PARÇA YAPALIM....
      //  1. parca....
        // Create method that generates a HashSet of
        // given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
        // bu işlemi generateSet() metodunda yapınız. 

        //1. yöntem:
        Set<Integer> hs4=generates();
        System.out.println("hs4 = " + hs4);
        // 2. Yöntem:
        Set<Integer> hs5=generates();
        System.out.println("hs5 = " + hs5);
// metodları anlama adına 1. ve 2. yöntemi incele....

        //  2. parca....
        // -Sonra AddElements şeklind ebir metodlar 1 veya 1 den fazla sayı eklenebilen metodu
        // yazınız.


        AddElements(hs5,1,9,10,111);
        AddElements(hs5,3,8,9,999,-1,-5);
        System.out.println("AddElements eklememlerinden sonraki hs5: "+hs5);


    }


    public static Set<Integer> generates() {

        //1. yöntem
       // Set<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8));

        // 2. Yöntem:
        Set<Integer> hs1 = new HashSet<>(); // bu olmadan 2. yöntem calışmaz. ama aktif olursa üstte de aynı

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);
        hs1.add(8);


        
        
        return hs1;

    }


    public  static void  AddElements(Set<Integer> hst ,int...values){ // buradaki int...values dizi belirtir.!!!!

        for (int i = 0; i < values.length; i++) {
            hst.add(values[i]);
        }
    }
    // metoda gönderilen değerler primitive yani temel değişkenler değilse, yani referans değişkenler ise,
    // metodda yapılan değişiklik bu değişkenin kendisinde yapıldığından, main de de değişiklik aynen görülür.


}

   



