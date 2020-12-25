package M3W4D3_G55_Abstract.Ornekler.Ornek2;

public class Circle extends Shape {
    private int yaricap;

    public Circle(String name, int yaricap) {
        super(name);
        this.yaricap = yaricap;
    }

    @Override
    public double Area() {
        return (Math.PI*yaricap*yaricap);
    }

    @Override
    public double Perimeter() {
        return (Math.PI*yaricap*2);
    }
}
