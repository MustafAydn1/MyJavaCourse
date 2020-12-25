package M2W3D1_G31_CLASS.example.Ex1;

public class Ex1 {
    // Ayrı bir dosya da bir studen class ı tanımlayınız. fields: name grade
    //Ayrı bir dosya da bir School class ı tanımlayınız. fields: name, adress, principal, tuitionFees
    public static void main(String[] args) {

       Student ogrenci1=new Student(); // Student classından, öğrenci1 nesnesi olusturdum.


        ogrenci1.name="Betül";
        ogrenci1.grade=2;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);


        School schoolInfo= new School();


        // 1. yöntem: müstakil nesne olan okulu bilgileri yazılır sonra, okuldaki nesne olan cocukla ilişkilendirir.
        School okulu= new School(); // new olan hersey class tır.. School classından okulu nesnesi olusturdum.
     //Artık belli bir okul nesnesi var. Adı-Adresi-Müdürü_fiyatı olan bir okulmuz var. Bunları da aşagıda yazalım.
        okulu.adress="Göztepe";
        okulu.name="MARMARA UNV.";
        okulu.principalName="Rektor";
        okulu.tuitionFees=0;

 // Bir öğrenciyi ait oldugu  okul bilgileri ile ifade etmek için
       ogrenci1.schoolInfo=okulu; // eger Student classının içinde  School u  ilişkilendirmezsem,
                                   // burada ögrenci bilgilerini okul ile olusturamam.illa ki oraya yAZMAM lazım.

        System.out.println("Ögrencinin okul adresi: "+ogrenci1.schoolInfo.adress);


        // 2. yöntem: ögrenci direk okul uzerinden ilişkilendirilir...
        ogrenci1.schoolInfo=new School(); // içiiçe nesne oldu. ögrencinin okulu...
        ogrenci1.schoolInfo.adress="Göztepe";
        ogrenci1.schoolInfo.name="MARMARA UNV.";
        ogrenci1.schoolInfo.principalName="Rektor";
        ogrenci1.schoolInfo.tuitionFees=0;




        System.out.println("ogrenci1 in okulu = " + ogrenci1.schoolInfo.name);


        Student ogrenci2=new Student(); // dıye yenileri de olusturulur..
    }
}
