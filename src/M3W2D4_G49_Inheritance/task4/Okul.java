package M3W2D4_G49_Inheritance.task4;

import java.util.ArrayList;

public class Okul {
    public static void main(String[] args) {


    LiseOgrenci lo1=new LiseOgrenci("Ahmet","lise");

    LiseOgrenci lo2=new LiseOgrenci("Ali","lise");

    IlkOgrencisi io1=new IlkOgrencisi("Ayşe","ilk");
    IlkOgrencisi io2=new IlkOgrencisi("Mehmet","ilk");

        System.out.println("lo1= "+lo1);
        System.out.println("lo2= "+lo2);
        System.out.println("io1= "+io1);
        System.out.println("io1= "+io2);
// superclass a toString yazmadan bunları yazmaz.
//superclass a yazmak yeterli digerleri göruyor zaten.

        ArrayList<Ogrenci> ogrenciler=new ArrayList<>();
        ogrenciler.add(lo1);
        ogrenciler.add(lo2);
        ogrenciler.add(io1);
        ogrenciler.add(io2);
        System.out.println(ogrenciler);

    }
}
