package M4W1D1_G58_Ornek1;

public class TechnoKitchen {

    public static   void pisir(Food yemek){
 /*BURAYA Food koyduktan sonra gelen yemegin hangi class a ait oldugunu
 nereden bilecek. bunu instanceof ile aşarız.

  */


        System.out.println("===="+yemek.getClass().getSimpleName()+" hazırlanıyor..");


        if(yemek instanceof AdanaKebap){
            AdanaKebap adanaKebap=(AdanaKebap)yemek;// polimorfizm ve tip dönusum.
            adanaKebap.marinade();
            adanaKebap.grill();
        }
        if(yemek instanceof Borsh){
            Borsh borsh=(Borsh) yemek; // bu sekilde tip dönudsumu de yaparsın
            borsh.boil();
        }
        if(yemek instanceof Palov){
            Palov palov=new Palov(); // BU ŞEK,LDE DEOLUR AMA YENİ BİR NEW e gerek yok.
            palov.fry();
            palov.boil();
        }
        if(yemek instanceof Lahmacun){
            Lahmacun lahmacun=new Lahmacun();
            lahmacun.bake();
            lahmacun.dough();
            lahmacun.topping();
        }


        yemek.taste();

    }

}
