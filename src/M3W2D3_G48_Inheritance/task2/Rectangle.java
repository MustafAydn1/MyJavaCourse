package M3W2D3_G48_Inheritance.task2;

public class Rectangle extends Shape {

    private double genislik;
    private double uzunluk;

  // kendi constructor ını kurduk.
    public Rectangle(double genislik, double uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }

    //metodları override ettik. ama kendine göre yaptık
    @Override
    public double getArea() {
        return this.uzunluk*this.genislik;
    }

    @Override
    public double getCevre() {
        return 2*(this.genislik+this.uzunluk);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Alan" +getArea()+
                "Cevre" +getCevre()+ '}';

    }
}
