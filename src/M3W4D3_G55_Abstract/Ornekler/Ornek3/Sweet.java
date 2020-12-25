package M3W4D3_G55_Abstract.Ornekler.Ornek3;

public abstract class Sweet extends Food {

 //Kendisi de abstract... extends oldugu da
//Food abstract, Sweet de abstract oldugu için,
//abstract metodu zorunlu olarak yaptırmıyor.

    @Override
    public String taste() {
        return "Çok Şekerli olmuş,kesti...";
    }
}
