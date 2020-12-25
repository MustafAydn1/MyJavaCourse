package M4W1D1_G58_Ornek1;

public class Borsh implements Food{
    @Override
    public void taste() {
        System.out.println("Yeşil mercimek, kucuk tane tavuklu guzel oluyor");
    }

    @Override
    public double ucret() {
        return 11;
    }

    public void boil(){
        System.out.println("Güzel Kokular gelmeye başladı");
    }
}







