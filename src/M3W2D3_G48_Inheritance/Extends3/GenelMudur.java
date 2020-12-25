package M3W2D3_G48_Inheritance.Extends3;

public class GenelMudur extends Calisan{
    double tazminat;

    public GenelMudur(String isim, double maas, int maasKatsayısı,double tazminat) {
        super(isim, maas, maasKatsayısı);
        this.tazminat=tazminat;//bu kısmı yazmayı unutnuşum.gm nın maaşı hep sıfır cıktı.
//demek ki fields i Constroctur a eklemezsen default degerini verir,gecer.

//superclass dan aldıgın Constructor a, burada eklenen fieldsları this. ile ekle!!!!!
    }



    @Override
    public double maasHesapla() {
       // return super.maas*super.maasKatsayısı*this.tazminat;
 return super.maasHesapla()*this.tazminat;

    }


    //GenelMudur classı extends olarak geldiği için tostringi de override edeceksin.
    //elle yazacaksın.otomatik hepsini seçip toString yazdırınca da
    // isim gelmiyor.Çünkü private olmuş halde.
    //yoksa sadecetazminatı yazan toString yazdırır.

/* BU OTOMATİK ALIRSAM. İSİM YOK. CIKMIYOR.
    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                ", maas=" + maas +
                ", maasKatsayısı=" + maasKatsayısı +
                '}';
    }

 */
    // superclasdan toStringi el ile yazarsam private ismi alabiliyorum.??????????
    public String toString(){
        return super.toString()+" tazminatı: "+this.tazminat;
    }
}

