package M4W1D4_G61_OCA;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {
        Integer sayi=null; // nul  her seye atanır...  farketmez.
        S155 obje=null;    // class olan herşerde oluyor......
      // double aa=null;   // kucuk  harfle olmaz...
        Double aaa=null;  // WrapperClass larda oluyor...



        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);

        points.add(245);
        points.remove((Object)245); // points.remove((Object)2)  2 indexi degil 2 yi siler.YANİ OBJECT e cevirdik.

        points.add(null);
        System.out.println(points); // integer  arraylist e null eklenir. boşluk demek.


        points.remove(1);  // !!! ÖNEMLİ....... önce index te varsa siler yoksa kendisi varsa siler.

        System.out.println(points);

        points.remove((Integer)1); // bu sefer de index degerini degil. integer 1 i siler.

        points.remove(null); // remove nin ustunde sağ tık--> Go to --> Declaration ::: remove nin nasıl calıştıgını gör

        System.out.println(points);
    }
}
