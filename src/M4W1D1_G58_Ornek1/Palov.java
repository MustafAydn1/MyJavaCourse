package M4W1D1_G58_Ornek1;

public class Palov implements Food {
    @Override
   public   void taste() {
        System.out.println("domestesli olunca daha güzel...");

    }

    @Override
    public double ucret() {
        return 15;
    }

    public void fry(){
        System.out.println("Önce hafif bıraz kızarsın");
    }

    public void boil(){
        System.out.println(" Orta ateşte kaynıyor...");
    }

}
