package M3W2D3_G48_Inheritance.Extends2;
// Hayvan sınıfı superclass olmak üzere köpek,
// kedi ve kuş sınıfları üreteceğiz.
public class Hayvan {

    String renk,cinsi;
    int kilo;

    public Hayvan(String renk, String cinsi, int kilo) {
        this.renk = renk;
        this.cinsi = cinsi;
        this.kilo = kilo;
    }

    public void konustu(){
        System.out.println("Hayvan konuştu...");
    }
    public  void yemekYer(){
        System.out.println("Hayvan yemek yiyor...");
    }
    public void  hareketeGec(int hiz){
        System.out.println("Hayvan "+hiz+" ile hareket ediyor");
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", cinsi='" + cinsi + '\'' +
                ", kilo=" + kilo +
                '}';
    }
}
