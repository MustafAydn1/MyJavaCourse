package M2W1D4_G24_ArrayList;

import java.util.*;

public class ArrayList_GOSTERİMLER {
    public static void main(String[] args) {

        // 1. initialize tarzi //Başlatma--Yenileme...

        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(2);

        ArrayList<Integer> arrList2 = new ArrayList<Integer>();

        List arrList3 = new ArrayList<Integer>();//böyle bir tanımlamada var...

        var arrList4 = new ArrayList<Integer>(List.of(1,2,3,4));// buradaki var ne anlamda...?????????????
        List arrList11 = new ArrayList<Integer>(List.of(1,2,3,4));//

        System.out.println("arrList11 = " + arrList11);
        System.out.println("arrList4 = " + arrList4);
         //var arrList5 = new ArrayList<Integer>();


        // 2. initialize tarzi

        ArrayList<Integer> arrList5 = new ArrayList<>(){


            {
                add(3);
                add(4);
            }
        };

        // 3. initialize tarzi
        List arrList6 = new ArrayList<Integer>(List.of(1,2,3,4,5,9,9));

        List arrList7 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,4)); // direk elemanları add kullanmadan ekledi...

        System.out.println("arrList7 = " + arrList7);
        System.out.println("arrList6 = " + arrList6);



        ArrayList<Integer> arrayList8 = new ArrayList<>(arrList6);

        System.out.println("arrayList8 = " + arrayList8);



         arrList7= new ArrayList<Integer>(arrList5); // sanırım bu durumda list7nin içini boşaltıp list5 i yazıyor.

        System.out.println("arrList7 = " + arrList7);


        Set set1 = new HashSet<Integer>(arrList7);
        System.out.println("set1 = " + set1);

        System.out.println(arrList7);
        System.out.println(set1);


        Set hs1 = new HashSet<Integer>();

        String str1 = "Merhaba";


        String str = new String("Merhaba");
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(new String("Merhaba").toUpperCase()); // yukarıdaki 3 satırı tek satırda yaptı....
        System.out.println(new String("Merhaba Betül").toUpperCase()); // tek satırda yapılıyor...

       // int sayi = new Scanner(System.in).nextInt();
        //System.out.print("sayi = " + sayi);

    }
}
