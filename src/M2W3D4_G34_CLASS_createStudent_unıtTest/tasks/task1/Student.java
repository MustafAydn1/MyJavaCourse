package M2W3D4_G34_CLASS_createStudent_unıtTest.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxAlabilecegiDersSaatMiktari;
    ArrayList<Lesson> studentLessons=new ArrayList<>();// buraya String yazma
//çünkü derslerin listesini tutacak.Lesson classndan,Lesson tipinden bilgi tutacak.çünkü dersler oradan gelecek

public static Student createStudent(String isim,int maxhour){

    Student ogrenci=new Student();
    ogrenci.name=isim;
    ogrenci.maxAlabilecegiDersSaatMiktari=maxhour;
    return ogrenci;
}

    public void  lessonadd(Lesson dersler){// bunu  tam anla!!! NİRVANA... static yazınca neden kırmızılar çıktı????????
/*
Eklenecek derslerin bilgisi Lesson classında/tipinde...
Bu yüzden ders eklenin parametre tipi Lesson olmalı!!!
 */
        int toplamderssaati=0;
        for(Lesson aldigiders: studentLessons ){
 /*
 aldigiders Lesson classından/tipinden olmalidir.
 aldigiders listelenmelidir.ArrayList studentLessons ile listelenecektir.
 bunu Student clasında studentLesson ArrayList nesnesi olarak oluşturmustuk
 Bu yüzden foreach te studentLessons list i kullanılmalıdır.
  */
            toplamderssaati+=aldigiders.hour;
        }
        if(toplamderssaati+dersler.hour<maxAlabilecegiDersSaatMiktari) {
            studentLessons.add(dersler);

        }
        else System.out.println(name+" "+ dersler.name+ " için Max saati aştınız. Ders Eklenemez");

    }

/*main sade olsun diye metodu burada olusup orada cagıracagız.
 class zaten tipi demektir... bunu düşün.
Student classında ogrenci nesnesini olusturdum.
parametreler nesnenın özellikleri(fields) olacak..
return ile gönderip,
böylece yüzlerce ögrenciyi direk olustururum.
 */


   public  void printLesson (){// static eklediğimdeki kırmızılıkların sebebi nedir?????????????????????????????????

       System.out.println(name + " isimli öğrencinin alabileceği dersler: ");

       int toplamDersSaatiniz=0;
       for(Lesson ders:studentLessons){


           System.out.println(ders.name+" "+ders.hour);
           toplamDersSaatiniz+=ders.hour;

       }

       System.out.println("Aldığınız Toplam ders Saati: "+toplamDersSaatiniz);




    }






}
