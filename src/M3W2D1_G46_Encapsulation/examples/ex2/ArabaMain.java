package M3W2D1_G46_Encapsulation.examples.ex2;

public class ArabaMain {
    public static void main(String[] args) {

        Araba bentley=new Araba();

        bentley.setRenk("kırmızı");
        bentley.setModel("bentleyga");
        bentley.setMotor(4500);
        bentley.setKapiSayisi(2);


  Araba porsche=new Araba("mavi","911Turbo",3600,-2);

        System.out.println("porsche.getKapiSayisi() = " + porsche.getKapiSayisi());
//kapı bilgisi gecersiz oldugu iiçin default olarak 0 atıyor.
    }
}
