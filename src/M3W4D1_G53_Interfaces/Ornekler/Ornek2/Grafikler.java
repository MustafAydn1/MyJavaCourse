package M3W4D1_G53_Interfaces.Ornekler.Ornek2;

public class Grafikler {
    public static void main(String[] args) {
//Bir interface den bircok class implement edilebilir..

        Cember cember=new Cember();
        Dikdortgen dikdortgen=new Dikdortgen();

        cember.ciz();
        dikdortgen.ciz();

 /*
 interfacelerden nesne uretilemez fakat referans tipi oluşturulabilir .
 bu bize polimorfizm sagladı...
  */
 //    REFERANS TİPİ- nesne= nesnenin Class ı
        ICizilebilir cember2=new Cember();
        cember2.ciz();







    }



}
