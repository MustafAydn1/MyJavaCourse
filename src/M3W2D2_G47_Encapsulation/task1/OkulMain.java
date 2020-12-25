package M3W2D2_G47_Encapsulation.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {


    Okul  okul1=new Okul("Fatih iöo",3);

    ArrayList<Ogrenci> okulunOgrencileri = okul1.getOgrenciler();
    // burada okul1 oluşturulurken oluşan ArrayList get metodu ile alındı.

    int ogrenciSayisi=1; // sayacımız ögrenciSayisi ve 3 ile sınırlı.
        Scanner input=new Scanner(System.in);
        Scanner intinput= new Scanner(System.in);// 2. scan... atlama olmasın diye

    do{
        System.out.print(ogrenciSayisi+". Ögrencinin adı: ");
        String ogrAd=input.nextLine();

        System.out.print(ogrenciSayisi +". Ögrencinin Soyadı: ");
        String ogrSoyad=input.nextLine();

        System.out.print(ogrenciSayisi+". Ögrencinin Yaşı: ");
        int yas=intinput.nextInt();
// input larla ögrenci bilgilerini oluştur.
// girişleri alarak,constraktıra uygun ögernci yap

// yaş konusundaki hatayı burada verecektir. bu yuzden try ı buraya kur.
        try {
            Ogrenci ogr = new Ogrenci(ogrAd, ogrSoyad, yas);
            //okul1.getOgrenciler().add(ogr); buda olabilir. alttaki de.
            //ögrenci eklemesi hata olmazsa olacagı için try ın en altına yazılır.
            okulunOgrencileri.add(ogr);
            ogrenciSayisi++;
        }
        catch (Exception ex)
        {
            System.out.println("ex.getMessage() = " + ex.getMessage());
            System.out.println("Yeni öğrenci giriniz...");
        }

    }while (ogrenciSayisi<=okul1.getMaxOgrenciSayisi());

    for(Ogrenci ogr :okul1.getOgrenciler())
    {
        System.out.println(" ogr: "+ ogr);
    }

// ögrenciye toStringi eklemezsem listelemiyor. neden???



    }

}
   /* Arraylist e ekleyip yazdırınca password hatalı da olsa id artıyor.
        bunu aşmak için: hatalı ise yeni user oluşturmadan güncelleme yap.
        yeni ise yeni oluştur. yeniuser kısmına if koyacan.

        KONSOL DE G46 TASK1 İN HATASINI VERMEDİ..... DUSUN....
    */