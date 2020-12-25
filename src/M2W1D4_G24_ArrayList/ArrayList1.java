package M2W1D4_G24_ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
// Array : boyut sayısının belli olduğu ve değerlerin çok sık değişitirlmediği durumlarda

        int [] dizi =new int[5]; // RAM de o kadar yer ayırdıgı için. Daha sonradan boyutu değiştirlemiyor.

// ArrayList : Boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumunda daha hızlı
        ArrayList<Integer> liste  =new ArrayList<>();
        ArrayList<Boolean> liste2 =new ArrayList<>();
        ArrayList<String> liste3 =new ArrayList<>();         // son kısma tipini yazmasan da olur...

        ArrayList<Integer> liste4= new ArrayList<>();


      // String ArrayList tanımlama
        ArrayList<String> isimler=new ArrayList<>();

       // eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");

        System.out.println("1-isimler = " + isimler);

        // belli bir index e eleman ekleme,eklendiği indexten sonrakiler bir index kayarlar
        isimler.add(1,"Zeynep");

        System.out.println("2-isimler = " + isimler);


       //3 nolu indexteki elemanı verir. (charAt ile aynı... indexof un tersi...)
        String elemanAtIndex3=isimler.get(3);
        System.out.println("elemanAtIndex3 = " + elemanAtIndex3
        );


       // 2 nolu indexteki elemanı siler, yerine belirtileni yazarak değiştırır,düzenler..
        isimler.set(2,"Mustafa");
        System.out.println("3-isimler = " + isimler);


     // Eleman sayısını verir.. Array deki  lenght  gibi..
        int elemansayisi=isimler.size();

        System.out.println("elemansayisi = " + elemansayisi);

        boolean listeboşmu=isimler.isEmpty();

        System.out.println("listeboşmu = " + listeboşmu);

        //DİREK elemanın kendisini sildirirsin... birden çok eleman da silinir...
        isimler.remove("Mustafa");
        System.out.println("4-isimler = " + isimler);

        //Elemanın indexini verip, o şekilde de sildiririz. belli bir aralık da silinirdi...
        isimler.remove(1);
        System.out.println("5-isimler = " + isimler);
        //Bir elemanın indexini bulma
        int indexOfKaya = isimler.indexOf("Kaya");
        System.out.println("indexOfKaya = " + indexOfKaya);

        //ArrayList in içini boşaltır..
        isimler.clear();
        System.out.println("6-isimler = " + isimler);


/*
 // Array : boyut sayısının belli olduğu ve değerlerin çok sık değişitirlmediği durumlarda
        int[] dizi=new int[5]; // Array : Daha sonradan boyutu değiştirlemiyor.

        // ArrayList : Boyutu dinamik yani değişken ve değerlerin hızlı değişmesi durumunda daha hızlı
        ArrayList<Integer> integerliste=new ArrayList<Integer>(); //tanımlama
        ArrayList<Boolean> booleanliste=new ArrayList<Boolean>();
        ArrayList<String> stringliste=new ArrayList<>(); // <> arası boş bırakılabilir

        // String ArrayList tanımlanması
        ArrayList<String> isimler=new ArrayList<>();

        // Elemen ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("1-isimler = " + isimler);

        // belli bir indexe eleman ekleme, eklendiği indexten sonrakiler bir aşağı kayar
        isimler.add(1, "Zeynep");
        System.out.println("2-isimler = " + isimler);

        // 2 nolu indexteki elemanı verir.
        String elemanAtIndex2= isimler.get(2);

        // 0 indexteki elemanın değerini değiştir.
        isimler.set(0,"Deniz");
        System.out.println("3-isimler = " + isimler);

        // Eleman sayısını verir , Array deki length
        int elemanSayisi = isimler.size();

        // Listenin tamamen boş olup olmadığınız verir.
        boolean listeBosMu=isimler.isEmpty();

        //Eleman silme
        isimler.remove("Ayşe");
        System.out.println("4-isimler = " + isimler);
        isimler.remove(1);
        System.out.println("5-isimler = " + isimler);

        //Bir elemanın indexini bulma
        int indexOfKaya = isimler.indexOf("Kaya");

        //Tüm elemanları boşaltma
        isimler.clear();
        System.out.println("6-isimler = " + isimler);
 */
    }
}
