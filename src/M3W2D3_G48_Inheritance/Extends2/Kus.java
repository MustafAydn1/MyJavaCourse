package M3W2D3_G48_Inheritance.Extends2;

public class Kus extends Hayvan {
    public Kus(String renk, String cinsi, int kilo) {
        super(renk, cinsi, kilo);
        //super.yemekYer();
    }
    @Override
    public void konustu(){
      //  super.konustu();
        System.out.println("Kuş ötüyor...");
        // hem konuştu hemde ötüyor yazacak
    }

    @Override
    public void yemekYer() {
        System.out.println("Kuş yemek yiyor");
        super.yemekYer();
    }

}
