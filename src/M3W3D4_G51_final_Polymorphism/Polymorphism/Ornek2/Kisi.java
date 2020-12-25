package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek2;

public class Kisi {

    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }


/*
   public  void subeyiAl(){
       Ogrenci ogrenci=new Ogrenci("Betül","KEKLİK","Öğrenci","2B");
       Object obOgr=ogrenci;
       if(obOgr instanceof Ogrenci)
           Ogrenci ogrr=(Ogrenci)obOgr;

   }
*/


    public static  void  kimlikYaz(Kisi kisi){
        System.out.println("\nAd: "+kisi.ad);
        System.out.println("Soyad: "+kisi.soyad);
        System.out.println("Görev: "+kisi.gorev);

        if(kisi instanceof Calisan){
            Calisan calisan=(Calisan)kisi;
            System.out.println("Departmanı = " + calisan.getDepartman());
        }
        if(kisi instanceof Ogrenci){
            Ogrenci ogrenci=(Ogrenci)kisi;
            System.out.println("Şubesi = " + ogrenci.getSubesi());

        }

//BU ŞEKİLDE DE YAPILIR.HOCANIN CÖZUMU: AMA GENELDE GÖSTERİM BÖYLE...
        //(Ogrenci(kisi)).getSubesi    şeklinde...

        if(kisi instanceof Ogrenci){
            System.out.println("Subesi= "+ ((Ogrenci)kisi).getSubesi());
        }
        if (kisi instanceof Calisan){
            System.out.println("Departmanı= "+((Calisan)kisi).getDepartman());
        }

// ikinci yol.... instanceof kullanılmadan yapacak olursak....

        if(kisi.getClass().getSimpleName().equalsIgnoreCase("Ogrenci")){

            System.out.println("Şubesi= "+ ((Ogrenci)kisi).getSubesi());

        }

        if(kisi.getClass().getSimpleName().equalsIgnoreCase("Calisan")){
            System.out.println("Depatmanı= "+((Calisan)kisi).getDepartman());
        }



//kisi.görev.equalsIgnoreCase("Ogrenci") den cekmistim  ... bundan nasıl yapmış bir incele


    }






}
