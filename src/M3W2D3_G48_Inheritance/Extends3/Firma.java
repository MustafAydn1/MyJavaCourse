package M3W2D3_G48_Inheritance.Extends3;

public class Firma {
    public static void main(String[] args) {

        Calisan calisan1=new Calisan("Mehmet",2000,2);
        System.out.println("calisan1.toString() = " + calisan1.toString());
        System.out.println("calisan1.maasHesapla() = " + calisan1.maasHesapla());

        GenelMudur gm=new GenelMudur("Ayse",6000,2,3);
        System.out.println("gm.toString() = " + gm.toString());
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());

        System.out.println("gm.maas = " + gm.maas);
        System.out.println("calisan1.maas = " + calisan1.maas);
// protected double maas a ulaşabiliyoruz. Firma Calisan dan extends degil,
//Ama calisan1 ve gm buralardan(Supreclass ve subclass) üretildigi için,
//gm.maas a ulasabildim.



// private String isim e getir-setirleri yapınca burada da ulastık
        System.out.println("gm.getIsim() = " + gm.getIsim());
        System.out.println("calisan1 = " + calisan1.getIsim());


    }
}
