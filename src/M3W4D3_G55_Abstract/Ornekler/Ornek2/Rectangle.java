package M3W4D3_G55_Abstract.Ornekler.Ornek2;

public class Rectangle  extends Shape {

    private  int lenght;
    private  int width;

    public Rectangle(String name, int lenght, int width) {
        super(name);
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {

    }


    @Override
    public double Area() {

        return lenght*width;
    }

    @Override
    public double Perimeter() {
        return 2*(lenght+width);
    }

}
