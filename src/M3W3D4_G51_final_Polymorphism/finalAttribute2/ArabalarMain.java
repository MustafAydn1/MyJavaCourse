package M3W3D4_G51_final_Polymorphism.finalAttribute2;

import M3W2D4_G49_Inheritance.task3_staticKullanım.A;

public class ArabalarMain {
    public static void main(String[] args) {

       Tasit tasit=new Tasit("otobus",3);
         // tasit.model="kamyon";
        // tasit.kapiSayisi=5;
      //Sperclass da zaten degişiklik yapamazsın


        Araba araba=new Araba("OPEL",2);
        System.out.println(araba.model);

        System.out.println(araba.kapiSayisi);


        Araba araba1= new Araba("ford",4);

       // araba1.kapiSayisi=2; // buna da izin vermez
// subclass da da yapamazsın.... şimdilik fields olarak..


    }

}
