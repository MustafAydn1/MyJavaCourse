package M3W4D4_G56_Ornekler.Ornek2;

public class Cat extends  Hayvan{
    private static int CatSayac=1;


    @Override
    public void yiyecegi() {
        System.out.println("Hazır Mama");
    }

    @Override
    public void yemeMiktari() {
        System.out.println(" 50 gram");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("15 Saat");
    }

    @Override
    public void sesi() {
        System.out.println("miyav");

    }
}
