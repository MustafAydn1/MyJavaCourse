package M3W2D2_G47_Encapsulation.task1;
/*

Hocam burada prive olup olmamasini neye gore belirlioyruz
yapilan projeye gore degismez mi?

Ali O.bugün saat 20:35
default durum private gibi düşüneceğiz.
gerektiği zaman açacagız.güvenlik acısından.

eriisimi engelliyoruz deyip, yine de ulasabiliyoruz?
@Sare programı yapan ulaşıyor. kullanıcı değil
 */
public class Ogrenci {

    private  String ad,soyad;
    private  int yas;

    public Ogrenci(String ad, String soyad, int yas) {
       setAd(ad);
       setSoyad(soyad);
       setYas(yas);
// buradaki this. lar aşagıda tek tek yapılmış ve metod yapılmış,
// kontrole girsinbu yuzden yaptık
        /*this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;*/
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

// kayıt için 15 yaş altını burada yapmalıyız.
    public void setYas(int yas) {
        if(yas>15)
        throw new RuntimeException("Kayıt için Yaş sınırı 15 dir.");
// hata oluşursa alta gecmez. hata oluşmazssa direk this. ya eşit olur.
        this.yas = yas;
    }

// bu kısmı toString i yapmazsam foreach de
// arraylist e eklennelerin cıktısını vermez.
    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
