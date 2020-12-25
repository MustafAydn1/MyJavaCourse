package M2W3D1_G31_CLASS.tasks.task1;

import java.util.ArrayList;

public class Task1 {
    // 1) create class student with fields: string name, int not
    // 2) Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir ArrayList e ekleyin.
    // 3) Daha öğrenci bilgilerin yazdıran bir metod yazarak , Arraylist teki öğrenci bilgilerini döngü yazdırınız.
    // 4) Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.
    public static void main(String[] args) {

        student ogrenci1=new student();
        ogrenci1.name="Mehmet";
        ogrenci1.not=95;

        student ogrenci2= new student();
        ogrenci2.name="Ali";
        ogrenci2.not=98;

        student ogrenci3= new student();
        ogrenci3.name="Yılmaz";
        ogrenci3.not=100;

        ArrayList<student> ogrenciler1= new ArrayList<>();// Integer-String gibi bir class olan student yazılır.
        ogrenciler1.add(ogrenci1);                       // çalışacagım class ın adı Arraylıstin değişkenidir.
        ogrenciler1.add(ogrenci2);
        ogrenciler1.add(ogrenci3);

       // System.out.println(ogrenciler1); // bu şekilde burrada yazdıramıyorum.
     /**************************************************/


   BilgiYazdır(ogrenciler1);

        System.out.println("***************************");

   ort(ogrenciler1);

        System.out.println("ortalama = " + OrtalamaBul(ogrenciler1));
        System.out.printf("ortalama = %6.2f" , OrtalamaBul(ogrenciler1));
// printf..... 6 haneli olsun.((100.00) virgül dahil oluyor.en buyuk olana göre hesapla)) 2 si virgulden sonra olsun.
    }
/*
  public static void BilgiYazdır(ArrayList<student> ogrenciler){// parametresi Arraylist olan bir metod.


        for (student ogr:ogrenciler)// student class ından/tipinden alınan ogr lerin,
        {
            System.out.println("ogr name: "+ ogr.name+ "  notu: "+ogr.not);// ogrenciler, artık ogr ye eşit..
        }
    }
*/
    public static void BilgiYazdır(ArrayList<student> ogrenciler){
        for(student ogr: ogrenciler)
            System.out.println(ogr.name+"  ve  "+ogr.not);

       // System.out.println(ogrenciler); // toplam liste şeklinde burada da yazdıramadım.
    }






//BURADA void ve return ile ayrı ayrı metod yapılmış da oldu.
    public  static void ort(ArrayList<student> ogrenciler){//Parametresi Arraylist olan bir metod.
        int toplam=0;
        for(student ogr: ogrenciler){// bunu for ile yapıp ögrenciler.not dedim olmadı.. Neden?????
            toplam+=ogr.not;         // çünkü ogrenciler yeni boş Arraylist in adı.ogr ise herbir student in adı....
        }
        int ort=toplam/ogrenciler.size();
        System.out.println("ort = " + ort);
    }

    public static double OrtalamaBul(ArrayList<student> ogrenciler)
    {
        double ort=0;
        double toplam=0;
        for(student ogr: ogrenciler)
        {
           toplam += ogr.not;
        }

        ort=toplam / ogrenciler.size();

        return ort;
    }







    /* neden normal for ile olmuyorda for each ile oluyor..

        public static void ort1 (ArrayList<student> ogrenciler1){

                 int toplam=0;
            for (int i = 0; i < ogrenciler1.size(); i++) {
                toplam+=ogrenciler1.

            }

       */

        }


