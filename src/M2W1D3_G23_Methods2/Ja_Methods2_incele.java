package M2W1D3_G23_Methods2;

public class Ja_Methods2_incele {

    public static void main(String[] args) {
        //int sayi1=5;
       // int sayi2=7;

        //int sonuc=toplamBul(sayi1,sayi2);
        // bana önceki toplamın değeri lazım, şu anda sonuca toplamın sonucu geldi

        toplamBul(3,4); // bu sonuç vermez... birinci yöntem ile....
        int sonuc=toplamBul(3,4);
        System.out.println(sonuc);

/*
        toplamBul1(5,6);  // bu sonuç verir... ikinci yöntem ile...

        int sonuc1=toplamBul1(5,6); // böyle bile yazdırır... ikinci yöntem ile...
       System.out.println(sonuc1); // böylede yazdırısın iki aşamada
*/
        System.out.print(toplamBul1(5,6)); // böylede yazdırırsın tek aşamada...ama ikinci yöntem old.için 2 kez yazar...


        Math.max(3,4); // bu şekilde yazmamızın hiç bir faydası yok,
        // çünkü işlemin sonucu herhangi bir değişkene atanmadı



    }

    public static int toplamBul(int a, int b)
    {


        return a+b;                             // birinci yazdırma şekli...
    }

public static int toplamBul1(int aa,int bb) {

    int toplam=aa+bb;
    System.out.println("toplam = " + toplam);

return toplam;                                 // ikinci yazdırma şekli
}



}
