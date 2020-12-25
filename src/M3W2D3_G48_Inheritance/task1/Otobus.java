package M3W2D3_G48_Inheritance.task1;

public class Otobus extends Arac {
    int yolcuSayisi;

// superclassın constroctor unu yap ve yolcuSayisi ni paramaterelere ekle.
// this. ile de yeni fieldsleri ekle.
    public Otobus(String renk, int motor, String model,int yolcuSayisi) {
        super(renk, motor, model);
        this.yolcuSayisi=yolcuSayisi;

    }
    /*
// BU ŞEKİLDE ELLE YAZARSAN PRİVATE DE GELİYOR.Garip??????
public String toString(){
       return super.toString()+" yolcuSayısı: "+yolcuSayisi;
}
*/
//AMA GENERATE İLE YAZARSAN,private leri görmez.onları getlerle alacaz.
    @Override
    public String toString() {
        return "Otobus{" +"renk='" + getRenk() + '\'' +
                ", motor=" + getMotor() +
                ", yolcuSayisi=" + yolcuSayisi +
                ", model='" + model + '\'' +   //prutected  oldugu için
                '}';
    }
}
