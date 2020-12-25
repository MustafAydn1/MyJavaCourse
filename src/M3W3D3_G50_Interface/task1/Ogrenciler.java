package M3W3D3_G50_Interface.task1;

public class Ogrenciler extends Kisi {

    private double okulucret;

    public Ogrenciler(String isim, String adres, Okul okul, UyeTipi uyeTipi, double ucret) {
        super(isim, adres, okul, uyeTipi);
        this.okulucret = ucret;
    }

    public double getOkulucret() {
        return okulucret;
    }

    public void setOkulucret(double okulucret) {
        this.okulucret = okulucret;
    }

    @Override
    public String toString() { return super.toString()+" "+getOkulucret() ;
    }
}
