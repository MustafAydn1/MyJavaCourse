package M3W2D3_G48_Inheritance.Extends2;

public class HayvanatBahcesi {
    public static void main(String[] args) {


    Hayvan hayvan=new Hayvan("sarı","Geyik",75);
    hayvan.konustu();

        System.out.println("***************************************");
    Kopek Kangal=new Kopek("Gri","Sivaslı",60);
    Kangal.konustu();
    Kangal.yemekYer();
   // Kangal.hareketeGec(30);
    Kangal.kos(40);


        System.out.println("****************************************");
    Kus Papagan=new Kus("Yeşil","Samata",2);
    Papagan.konustu();
    Papagan.yemekYer();
        System.out.println(Papagan);// Hayvan classınınkini kullandı.
}
}