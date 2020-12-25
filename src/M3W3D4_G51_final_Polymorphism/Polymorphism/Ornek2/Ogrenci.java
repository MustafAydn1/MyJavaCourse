package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek2;

public class Ogrenci extends Kisi {
   private String subesi;

    public Ogrenci(String ad, String soyad, String gorev, String subesi) {
        super(ad, soyad, gorev);
        this.subesi = subesi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }




}
