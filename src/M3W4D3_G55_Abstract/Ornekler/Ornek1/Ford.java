package M3W4D3_G55_Abstract.Ornekler.Ornek1;

public class Ford extends BinekOto{


//abstract metod oldugu için zorunlu olarak
//yazılmak zorundadır.implement edildi.
    @Override
    public String getMarka() {

        return "Ford Focus";
    }
/*
abstract class da yazılmış somut metodları
ister oldugu gibi kullanabiliriz.Budurumda yazmana gerek yok.
istenirse override edilrir.
 */

    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili()); // bu kısmı MERYEM-->>Polimorfizm de görulmuş. ona bi bak. yemeklerde.

        return super.getUretimYili();
// demek ki return nun içine println yazılabiliyormuş.
// mainde +return da olunca iki kez cıktı verir..
    }

}
