package M3W2D3_G48_Inheritance.Extends1;

public class SirketMain {
    public static void main(String[] args) {


    Yonetici2 mudur=new Yonetici2();

    //personelin her fields ini kullanır.
    // erişim izni olunca...

    mudur.departman="Destek Birimi";
    mudur.maas=3000;

        System.out.println(mudur.getMaas());
        mudur.zamYap(20);

        System.out.println("mudur = " + mudur);
        System.out.println("mudur.toString() = " + mudur.toString());
}
}