package M3W2D3_G48_Inheritance.Extends3;

public class Calisan {
   private String isim;
   protected double maas;// bu sınıftan turetilenler ulaşabilir.
    int maasKatsayısı;

    public Calisan(String isim, double maas, int maasKatsayısı) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayısı = maasKatsayısı;
    }
    public double maasHesapla(){

        return  this.maas*maasKatsayısı;
    }

    //Bana prıvate olan getİsim lazım sadece ben onu oluştururum.
    //ille de hepsi oluşacak diye bişey yok.
    public String getIsim() {
        return isim;
    }



    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayısı=" + maasKatsayısı +
                '}';
    }
}
