package M4W1D1_G58_Ornek1;

public class Lahmacun implements Food {
    @Override
    public void taste() {
        System.out.println("Unutulmaz lezzet...");

    }

    @Override
    public double ucret() {
        return 16;
    }

    public void dough() {
        System.out.println("MAYALANIYOR....");
    }

    public void topping() {
        System.out.println("Hamur açıldı,içi dolduruluyor... Bol soğanlı ve kıymalı");

    }

    public void bake() {
        System.out.println("Fırından çıkmak üzere...");
    }


}