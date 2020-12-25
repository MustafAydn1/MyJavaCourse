package M3W2D4_G49_Inheritance.task2_AccessModifiers.pak2;

import M3W2D4_G49_Inheritance.task2_AccessModifiers.pak1.pak1Hayvan;

// ************DİKKAT************
// pak2  paketini alıp G47 ye attım yine çalıştı.
// yani alt class aynı pojenın içinde her pakette acılıyor.

public class pak2Main {
    public static void main(String[] args) {

        pak1Hayvan hayvan2=new pak1Hayvan();
        hayvan2.ad ="köpek"; // public olduğundan her yerden ulaşılabiliyor.
        //hayvan2.yas =8 ; // default olunca sadece kendi paketinden ulaşılabilir.
        // farklı paketten ulaşılamaz.
        //hayvan2.cinsi="van"; // default gibi çalışıyor normal classlarda
        // sadece kendi paketinden ulaşılabilir.
        //hayvan2.renk ="beyaz"; // bu filed private olduğundan sadece kendi
        // clasının içinden ulaşılabilir.


        pak2Kedi kedi=new pak2Kedi("köpük", "tekir");
        kedi.BilgiYaz();
        //kedi.cinsi Sadece subclass dan ulaşılabiliyor.
    }
}
