package M3W2D3_G48_Inheritance.Extends2;

public class Kopek extends Hayvan{

    public Kopek(String renk, String cinsi, int kilo) {
        super(renk, cinsi, kilo);      // super superclass ı işaret eder.
      //  super.yemekYer();
    }

// extends Hayvan ile metodların üzerine metod yazılabilyor.
//Genarate--> OverrideMethods ile superclass daki metodlar alınır

    @Override
    public void konustu(){
       // super.konustu();
        System.out.println("Köpek havlıyor...");
    }

    @Override
    public void yemekYer() {
        //super.yemekYer();
        System.out.println("Köpek yemek yiyor");
    }

    @Override
    public void hareketeGec(int hiz) {
        System.out.println("Köpek "+hiz+" ile koşuyor");
    }

    public  void kos(int hiz){

       // System.out.println("Köpek koşuyor...");

       hareketeGec(30);

// buraya super.hareketeGec dersem Hayvanın metodu calışır.
//super i silersem. yukarıda yazılı kendi metodum calışır
    }
}
