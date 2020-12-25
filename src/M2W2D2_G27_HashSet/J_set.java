package M2W2D2_G27_HashSet;


import java.util.Arrays;
import java.util.TreeSet;

public class J_set {
    public static void main(String[] args) {
        TreeSet<Integer> rakamlar = generaset(); // 10 tane random rakamla doldursun... for ile 10 elemanlı olmadı
        System.out.println("rakamlar = " + rakamlar);
        
        TreeSet<Integer> rakamlar1= generaset1();// 10 tane random rakamla doldursun... while 10 elemanlı olana kadar,dener.
        System.out.println("rakamlar1 = " + rakamlar1);
  
        addElements(rakamlar1,10,100,100);
        addElements(rakamlar1,50,60,60,70);
        System.out.println("rakamlar1 = " + rakamlar1);
        System.out.println("rakamlar1.size() = " + rakamlar1.size()); // hepsi rakamlarla temsil ediliyor. bu yuzden?????

        int [] ints=converttoArray(rakamlar1); // convert=dönüştürmek...HashSet i, int diziye cevirmek...
        System.out.print("int [] ints = "+ Arrays.toString(ints));
    } // rakamlar meselesinin bu şekilde oluşmasını tam anlayamadım..????????

    private static int[] converttoArray(TreeSet<Integer> rakamlar) {
        int [] yeni=new int[rakamlar.size()];

        int sayac=0;
        for (int sayı:rakamlar) {

         //   yeni[sayac++]=sayı;
           yeni[sayac]=sayı;
           sayac++;

        }
        return yeni;
    }


// !!!!!!!!!!!!!!!!!!! *****  set üreten metod   *****!!!!!!!!!!!!!!!
// for ile
    private static TreeSet<Integer> generaset() {// generaset adında bir metod tanımladık...
        TreeSet<Integer> küme = new TreeSet<>(); // Randomsayıları treeSet alsın diye küme adında tanımladık...


        for (int i = 0; i < 10; i++) {
            int sayılar = (int) (Math.random() * 11); // döngü ile 10 kez Raandomsayıları aldık..
            küme.add(sayılar);                       // bu sayıları küme adlı treeSet e ekledik, oluşturduk.

        }
        //System.out.println("küme = " + küme); // ama aynı olanları almayacagından 10 elemanlı olamadı

       return küme;
    }
    /*
     generaset te for döngüsü oldugu için 10 kez yaptı bitirdi... random u 101 yapsakda aynı sayıdan gelse yine
     10 elemanlı olmuyor. 10 kez deneyip bırakıyor...

     BU YÜZDEN DE BİZ BUNU WHİLE İLE YAPMALİYİZ.  ÇÜNKÜ;
     WHİLE;  for dan farkı bu... kumenın eleman sayısı  10 oluncaya kadar dener durur.

     */

   // while ile...

    private static TreeSet<Integer> generaset1() {
        TreeSet<Integer> küme1= new TreeSet<>();

        while (küme1.size()<10){ // başlangıcı yok. bitişi için count yok akla gelebilir???
//başlangıcı ilk eleman eklenerek. bitişi eleman sayısını 10 a tamamlayarak yapmış olduk.

            int randomsayi=(int)(Math.random()*11);
            küme1.add(randomsayi);
        }
        //System.out.println("küme1 = " + küme1);
        return küme1;

    }

 // !!!!!!!!!!!!!!!!!  ************ Sete Belli olmayan sayıda sayıları Ekleyen Metod **********!!!!!!!!!!!

    public static TreeSet <Integer> addElements( TreeSet<Integer> kume3, int... values){
        
        // TreeSet<Integer> küme3=new TreeSet<>();
         
        for (int i = 0; i <values.length ; i++) {
            kume3.add(values[i]);
            
        }
      //  System.out.println("küme1 = " + küme1);
        
         
        return kume3;
        
    }
    
    /*
     // add : Set icersinde bir eleman ekler
    // clear : Set icerisndeki butun elemanlari siler.
    // contains : Bir eleman dizi icinde mi kontrl eder.
    // remove : bir eleman siler
    // size : o ana kadar kac eleman ekledigini dondurur.
    // isEmpty : bos olup olmadigini kontrol eder.
    // containsAll : bellirli bir eleman , set icerisinde var mi yok mu bakiyor
    // addAll : coklu islemler toplu ekleme baska bir kumeyi kumeye ekleme
    // retainAll : iki kumenin kesisimini bulur
    // removeAll : hepsini siler
    // toArray : seti dizi haline getiriyor, dizi formatina cevirme*****  ????
    //  int [] ints=converttoArray(rakamlar1); // convert=dönüştürmek...HashSet i, int diziye cevirmek...
     */
    
    
    
    



}

