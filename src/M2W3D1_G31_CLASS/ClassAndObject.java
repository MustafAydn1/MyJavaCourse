package M2W3D1_G31_CLASS;


public class ClassAndObject {// ismini benim verdiğim class

    public static void main(String[] args) {

        Araba araba1=new Araba();// Araba class nın Nesnesi,araba1 uretildi.
        araba1.model="toyota camry"; // Aşagıdaki tasarımdan çağırıyoruz... adlarını veriyoruz...
        araba1.motorHacmi=1600;
        araba1.yili=2020;

        System.out.println("araba1.yili = " + araba1.yili);
        System.out.println("araba1.motorHacmi = " + araba1.motorHacmi);
        System.out.println("araba1.model = " + araba1.model);

    }
}
// 1. Yöntem

//Araba sınıfı
class Araba{ // aynı tek dosyanın içinde iken  başına public yazılmaz... public class ClassAndObject dışında yazılır.
// bu kısım calışan bişey degil... maini yok... sadece tasarımm...

 // Properties, Attributes, fields
    String model;
    int yili;
    double motorHacmi;

}