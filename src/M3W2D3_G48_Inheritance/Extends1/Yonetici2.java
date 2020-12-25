package M3W2D3_G48_Inheritance.Extends1;

public class Yonetici2 extends Personel {



    int bagliPersonelSayisi;
    double gorevTazminati;

    public  void zamYap(int yuzde){

        System.out.println("%"+yuzde+" personele zam yapıldı.");
    }


// hem kendi fields ı hemde Personelin fields ı alıyor.
    @Override
    public String toString() {
        return "Yonetici2{" +
                "bagliPersonelSayisi=" + bagliPersonelSayisi +
                ", gorevTazminati=" + gorevTazminati +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", departman='" + departman + '\'' +
                ", yas=" + yas +
                ", sicilNo=" + sicilNo +
                ", maas=" + maas +
                '}';
    }
}
