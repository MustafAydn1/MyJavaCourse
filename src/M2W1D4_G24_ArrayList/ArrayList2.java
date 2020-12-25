package M2W1D4_G24_ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        int []dizi=new int[]{1,3,4,56,}; //şeklinde baştan elemanları yazabiliyorduk...

        // dizilerde baştan deger atayabiliyorduk, burada da ArrayList e  baştan eleman atadık.
        ArrayList<String> list1=new ArrayList<>(){
            {
                add("Almanca");
                add("İngilizce");
                add("Türkçe");
                add("Rusça");
            }
        };

        System.out.println("list1 = " + list1);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Rusça");
        list2.add("Türkçe");
        list2.add("Arapça");
        System.out.println("list2 = " + list2);


        //list2 yı, list1 e ekledik... Aynı elemanlar
        list1.addAll(list2);
        System.out.println("list1 = " + list1);


       // eklenecek olan list2 yi belirtilen index ten itibaren  ekler...
        list1.addAll(2,list2);
        System.out.println("list1 = " + list1);


       //contains ile elemanın varlıgı aranır...
        if(list1.contains("Türkçe")){

            System.out.println("Türkçe  dili var");
        }


        list1.removeAll(list2); // list1 dekilerden list2 de olanları sildik. Arapça olmayınca kaldı
        System.out.println("list1 = " + list1);


// indexof  ve   last indexof da mevcuttur...


    }
}
