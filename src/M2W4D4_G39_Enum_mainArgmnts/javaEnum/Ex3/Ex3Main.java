package M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex3;
// 1- Bir Kitap sınıfı yazınız, fields : name ve kategori(Enum)
// 2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
// 3- 2 kitap tanımlayınız bir ArrayList e atınız.
// 4- bir kategoriye listeletiniz.
import java.util.ArrayList;

public class Ex3Main {

  //  enum KitapKategori olarak
    // enumu burada da yapabilirdik.. dene gör...

    public static void main(String[] args) {

       Kitap kit1= new Kitap();
       kit1.name="Sefiller";
       kit1.basimYili=1956;
       kit1.kategori=KitapKategori.ROMAN;
       
       Kitap kit2= new Kitap();
       kit2.name="Beyaz Lale";
       kit2.kategori=KitapKategori.ROMAN;

        Kitap BEYAZGEMI=new Kitap();
        BEYAZGEMI.kategori=KitapKategori.KLASIK;
// böyle tanımlasan bile BEYAZGEMİ.name="BEYAZ GEMİ" demeden olmuyor
//bu yüzden kit3 diye tanımlamak daha iyi.
        BEYAZGEMI.name="BEYAZ GEMİ";



        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
 //toString de fields birinin bilgileri eksikse,default degerini verir


     ArrayList<Kitap> kitaplar=new ArrayList<>();
     kitaplar.add(kit1);
     kitaplar.add(kit2);
     kitaplar.add(BEYAZGEMI);

     for(Kitap kitap:kitaplar){

         if(kitap.kategori==KitapKategori.KLASIK)
             System.out.println("kitap.name = " + kitap.name);

     }


       


    }
}
