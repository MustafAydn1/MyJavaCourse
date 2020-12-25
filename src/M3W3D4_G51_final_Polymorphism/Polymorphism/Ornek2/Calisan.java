package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek2;

public class Calisan extends Kisi {

    private String departman;

    public Calisan(String ad, String soyad, String gorev, String departman) {
        super(ad, soyad, gorev);
        this.departman = departman;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
