package M3W3D3_G50_Interface.task1;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul= new Okul("Fatih iöo",100);

        Ogrenciler ogr1=new Ogrenciler("Mustafa","KONAK",okul,UyeTipi.OGRENCI,5000);
        Ogrenciler ogr2=new Ogrenciler("Betül","Alsancak",okul,UyeTipi.OGRENCI,6000);

        Calisanlar cal1=new Calisanlar("Esra","Bozyaka",okul,UyeTipi.CALISAN,3000);
        Calisanlar cal2=new Calisanlar("Hamza","Yeşilyurt",okul,UyeTipi.CALISAN,4000);

        okul.OgrenciKayit(ogr1); // bu kısımlar neden calışmadı bi bak...
        okul.OgrenciKayit(ogr2); //derste acıklanmadı ve sorulmadı. sanırım bişey cıkması gerekmyr

        okul.CalisanKayit(cal1);// cunku cıktı olmamıs. metodda
        okul.CalisanKayit(cal2);

        System.out.println("*********************************");

        okul.OgrenciListele();
        okul.CalisanListele();

        System.out.println("*********************************");

        System.out.println(okul);

    }
}
