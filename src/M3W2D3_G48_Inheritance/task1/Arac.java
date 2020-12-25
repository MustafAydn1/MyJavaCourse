package M3W2D3_G48_Inheritance.task1;
// 1- Arac isimli bir superclass olusturunuz, fields : renk, motor, model(protected) olsun.
// 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
// 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuSayisi field ını ekleyiniz.
// 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
//    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
public class Arac {
    private String renk;
    private int motor;
    protected String model;

    public Arac(String renk, int motor, String model) {
       setRenk(renk);
       setModel(model);
       setMotor(motor);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model='" + model + '\'' +
                '}';
    }
}
