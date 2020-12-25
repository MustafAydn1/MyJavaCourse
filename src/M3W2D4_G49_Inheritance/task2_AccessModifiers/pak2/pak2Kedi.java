package M3W2D4_G49_Inheritance.task2_AccessModifiers.pak2;
import M3W2D4_G49_Inheritance.task2_AccessModifiers.pak1.pak1Hayvan;

//   ........ DİKKAT.....
// bunu kendi dosyasından alıp buraya yazacaksın
//M3W2D4_G49_Inheritance.task2.pak1 bu kısımdan sonra .pak1Hayvan eklemelisin. yoksa kabul etmiyor.
//subclass için bağ kuramıyor

//protected String cinsi; ulaşacak.ÇÜNKÜ FARKLI PAKETTE AMA SUBCLASS I.
public class pak2Kedi extends  pak1Hayvan{
    public pak2Kedi(String ad, String cinsi) {
/*
burada ulaşıyor cunku alt classndan uretildi. miras kaldı.protected.
        pak2Kedi kedi=new pak2Kedi("Kumsal","Tekir");
        kedi.ad=ad;
        kedi.cinsi=cinsi;
*/
         //pak1Hayvan Kedi=new pak1Hayvan(); Bu kısmı sonradan yaptım.
        //Kedi.ad=ad; // ulaşıyor.
       //Kedi.cinsine // asla ulasamıyorum. super.cinsi ile olmalı.Kediyi o classtan urettik.


        super.ad = ad;      // bunlar superclass tan geldiği için super.ad
        super.cinsi =cinsi;// pak1Hayvan nın fieldslerini kullanıyoruz.
    }

    public void BilgiYaz()
    {
        System.out.println("super.ad = " + super.ad);
        System.out.println("super.cinsi = " + super.cinsi);

    }
}
