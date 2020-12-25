package M3W2D4_G49_Inheritance.task3_staticKullanım;

public class ABMain {
    public static void main(String[] args) {
 /*
 BURAYI ANLAMAK İSTİYORSAN      B b=new B(); KISMINI  EN ÜSTE KOPYALA GÖR.
  */
        A a=new A();
        System.out.println("a oluşturuldugunda: "+A.mesaj);

        B b=new B();
        System.out.println("b oluşturuldugunda= "+B.mesaj);

        System.out.println("b oluştuktan sonra a nın durumu= "+A.mesaj);

        A aa=new A();
        System.out.println("aa olustu; son durum= "+A.mesaj);




    }
}
