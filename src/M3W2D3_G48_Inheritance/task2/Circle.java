package M3W2D3_G48_Inheritance.task2;

public class Circle extends Shape {

    private double yaricap;

    public Circle(double yaricap){
        this.yaricap=yaricap;

// fields olarak pi ye gerek yok. Mathclassında var.

    }
//superclass daki getcevre nin üstüne subclassın kendi metodunu yaptık.
//Neden override yapıyoruz da sıfırdan kendimiz kurmuyoruz.(kendimiz de kurabiliriz.)
//Çünkü aksi bir durumda üst class metodunu kullansın diye...
// Mesela burada getArea yok. dolayısıyla çagırıldıgında direk superinkini kullnır

    @Override
    public double getCevre() {
        return 2*Math.PI*this.yaricap;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "yaricap=" + yaricap +
                " cevre= "+getCevre()+
                '}';
    }
// to stringe koymadıgın şey cıktı vermeyecek.
//fieldsi kendi koyar. metodları ben eklemeliyim.
}
