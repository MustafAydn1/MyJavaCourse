package M4W1D1_G58_Ornek1;

public class AdanaKebap implements Food {
    @Override
    public void taste() {
        System.out.println("Koyun etinden olusa enfes olurdu.");
    }

    @Override
    public double ucret() {
        return 21.0 ;
    }

    public void marinade(){
        System.out.println("Etler naneli-kekikli sodaya yatırıldı");

    }
    public void grill(){
        System.out.println("cızırtılar geliyor...");

    }
}
