package M3W3D4_G51_final_Polymorphism.finalAttribute;

public class Arabalar {

    public static void main(String[] args) {
        Araba araba=new Araba("Opel");
        // araba.model = "opel";
        // final değişken olduğundan değiştirelemz.

        Araba araba2=new Araba("Ford");
       // araba2.model="Mercdes"; // buna izin vermez

        Araba araba3=new Araba("Woswagen");

        // costruc uzerinden ikinci bir araba tanımladıgın için oldu.
    }
}
