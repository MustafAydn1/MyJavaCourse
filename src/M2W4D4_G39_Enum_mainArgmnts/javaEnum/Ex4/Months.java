package M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex4;

public enum  Months {

    OCAK(31,"sıcak"),
    SUBAT(28,"soguk"),
    MART(31,"bulutlu"),
    NISAN(30,"ılık"),
    MAYIS(31,"don"),
    HAZIRAN(30,"kavurucu"),
    TEMMUZ(31,"normal"),
    AGUSTOS(31,"ruzgarlı"),
    EYLUL(30,"karısık"),
    EKIM(31,"gunesli"),
    KASIM(30,"bulutlu"),
    ARALIK(31,"ılık");


    int days;
    String havaDurumu;
    Months(int  gunMiktari,String gunesli){
       days=gunMiktari;
       havaDurumu=gunesli;

    }
    void getGunMiktari(){

        System.out.println("days = " + days);
    }




}
