package M3W4D3_G55_Abstract.Ornekler.Ornek1;

public abstract class BinekOto {

    private String  marka;
    private int uretimYili;
    private int vitesAdedi;

    public abstract String getMarka();

    public  int getUretimYili(){
        return this.uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }
}
