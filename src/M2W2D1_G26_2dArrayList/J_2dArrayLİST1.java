package M2W2D1_G26_2dArrayList;

import java.util.ArrayList;

public class J_2dArrayLİST1 {
    public static class J_2dArrayList1 {
        public static void main(String[] args) {
            /***********************/
            int sayi=5; // tek bir rakam saklayabilen değişken
            int[] dizi=new int[5]; // 5 adet rakam saklayabilen değişken.
            int[][] mat2=new int[5][5]; // 5x5 => 25 adet rakam
            ArrayList<Integer> arrList=new ArrayList<Integer>(); // istenildiği kadar değişken eklenebilir
            /***********************/


            int[][] mat=new int[5][5]; // 5x5 => 25 adet rakam
            ArrayList<  ArrayList<Integer>  >  notlarArrList = new ArrayList<>();// boş bir  2 boyutlu arraylist oluştu.
            // boşluklar gereksiz sade gözükebilsin diye yapıldı.

           // ArrayList<Integer> matNotlar=new ArrayList<>();
           ArrayList<Integer>matNotlar=new ArrayList<>();
            matNotlar.add(90);
            matNotlar.add(80);
            matNotlar.add(70);

           // ArrayList<Integer> turNotlar=new ArrayList<>();
            ArrayList<Integer>turNotlar=new ArrayList<>();
            turNotlar.add(95);
            turNotlar.add(85);
            turNotlar.add(75);

           // ArrayList<Integer> kimNotlar=new ArrayList<>();
          ArrayList<Integer>kimNotlar=new ArrayList<>();
            kimNotlar.add(45);
            kimNotlar.add(55);
            kimNotlar.add(65);
            kimNotlar.add(35);
    /*
            notlarArrList.add(matNotlar); // burada tanımalamada neyin listesi ise ona uygun değişkeni Ekledik
            notlarArrList.add(turNotlar);
            notlarArrList.add(kimNotlar);
    */

            notlarArrList.add(matNotlar);// ÖGRETMENİN NOT DEFTERİNİN SAYFALARI OLUSTU.
            notlarArrList.add(turNotlar);// HER SAYFADA BİR ArrayList var...
            notlarArrList.add(kimNotlar);// listelerin listesi tutuluyor..
            //System.out.println(notlarArrList);



            for (int i = 0; i <matNotlar.size() ; i++) {
                System.out.println("matNotlar = " + matNotlar.get(i));

            }
            System.out.println("notlarArrayList in uzunlugu: "+ notlarArrList.size());
// notlarArrList.size():defterdeki derslerin not listesinin kaç tane olduğunu, yani yaprak sayısı

            for (int i = 0; i <notlarArrList.size() ; i++) {//defterdeki derslerin not listesinin kaç tane olduğu. yaprak sayısı
                for (int j = 0; j <notlarArrList.get(i).size() ; j++) { // her 1 yaprakdaki not sayısı...

                    System.out.println(i+". yaprakdaki "+j+". not: "+notlarArrList.get(i).get(j));
                }
                //get i nin j si   =>    i bana defterdeki yaprak   j de yapraktaki not verir
            }
       int matOrt= dersOrtalamaBul(0,notlarArrList);
            System.out.println("matOrt = " + matOrt);

            int turOrt= dersOrtalamaBul(1,notlarArrList);
            System.out.println("turOrt = " + turOrt);

            int kimOrt= dersOrtalamaBul(2,notlarArrList);
            System.out.println("kimOrt = " + kimOrt);

         int ORT=  tumDerslerOrtalama(notlarArrList);
           System.out.println("ort = " + ORT);

            // 1.Ödev
            // Yukarıdaki örnek de sinavSirası olarak 3 gönderildiğinde yani (4.Sınav ) hata verecektir.
            // hatanın sebebini ve nasıl düzeltileceğini bulunuz.

            // 2.Ödev
            // Recursive (ÖzYinelemeli Metodlar) konusu google dan ve youtube dan araştırılacak ve öğrenilecek.

            int AlininOrtalamasi= AlininOrtalamasi(0,notlarArrList);
            System.out.println("AlininOrtalamasi = " + AlininOrtalamasi);

        }

        public static int    dersOrtalamaBul(int dersNo,ArrayList<ArrayList<Integer>> notlarArrList){
            int toplam=0;

            for (int i = 0; i <notlarArrList.get(dersNo).size() ; i++) {
                toplam+=notlarArrList.get(dersNo).get(i);


            }



            return toplam/notlarArrList.get(dersNo).size();

        }


 public static int tumDerslerOrtalama(  ArrayList<ArrayList<Integer>>notlarArrList){

            int countNotMiktari=0;
            int toplam=0;
     for (int i = 0; i <notlarArrList.size() ; i++) {//defterdeki derslerin not listesinin kaç tane olduğu. yaprak sayısı
         for (int j = 0; j <notlarArrList.get(i).size() ; j++) { // her 1 yaprakdaki not sayısı..

             toplam+=notlarArrList.get(i).get(j);
             //System.out.println("i. yaprakdaki j.not: "+notlarArrList.get(i).get(j));
             countNotMiktari++; // kac tane not girildi bilmem için,for her döndüğünde 1 artacak...
         }

     }

       return toplam/countNotMiktari;
 }


// defterde ilk ögrenci hep Ali olsun ali nın tum  derslerdeki not ortalamasını bulunuz
        //notlarArrList.get(0).get(0); // 1.dersin 1.notu
//        notlarArrList.get(1).get(0); // 2.dersin 1.notu
//        notlarArrList.get(2).get(0); // 3.dersin 1.notu  bu işlemi veren tek forlu yapı aşağIDADIR.

public static int AlininOrtalamasi (int AlininNotuIndexi, ArrayList<ArrayList<Integer>>notlarArrList) {

            int toplam=0;


            for (int i = 0; i<notlarArrList.size();i++) {
                toplam+=notlarArrList.get(i).get(AlininNotuIndexi);


    }

return  toplam/notlarArrList.size();
}





    }
}
