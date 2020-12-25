package M3W4D4_G56_Ornekler.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        int sayac=1;

        Cat kedi=new Cat();
        //kedi.setId();// ensonda setId yı boş const. içine yazarız
//buraya yazmamıza gerek kalmaz.her new de sayı artcak.toStringe yzck.
        kedi.setName("Kumsal");
        kedi.setVahsi(false);
        kedi.setDob(LocalDate.of(2018,1,11));
        System.out.println(kedi);
        kedi.yiyecegi();
        kedi.yemeMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();

        System.out.println("*********************");

        Kartal kartal=new Kartal();
       // kartal.setId();
        kartal.setName("Uzun Soluk");
        kartal.setVahsi(true);
        kartal.setDob(LocalDate.of(2000,1,1));
        System.out.println(kartal);
        kartal.yiyecegi();
        kartal.yemeMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();




/*
Const. ne kadar işleselmiş burada anlaşıldı.bukadar cok setler yerine,
tek satırda biterdi.
Const. ıçıne neden  setName(name) yazıldıgı anlaşıldı. cunku setten alıp
aktarıyor.setin içindeki kod blogundaki degişiklik hemen aksediyor.


 */

    }
}
