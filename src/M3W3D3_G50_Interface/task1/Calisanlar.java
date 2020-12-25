package M3W3D3_G50_Interface.task1;

public class Calisanlar extends Kisi {

    private double maas;

    public Calisanlar(String isim, String adres, Okul okul, UyeTipi uyeTipi, double maas) {
        super(isim, adres, okul, uyeTipi);
        setMaas(maas);
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return super.toString()+" "+getMaas();
    }
}
