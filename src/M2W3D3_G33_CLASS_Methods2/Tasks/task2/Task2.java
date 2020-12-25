package M2W3D3_G33_CLASS_Methods2.Tasks.task2;

import java.util.ArrayList;

public class Task2 {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit.
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit,
    // dersleri listesini tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

    public static void main(String[] args) {


        Lesson mat101=new Lesson();
        mat101.name="Matematik";
        mat101.credit=3;

        Lesson java101=new Lesson();
        java101.name="Java Programming";
        java101.credit=6;

        Lesson fiz101= new Lesson();
        fiz101.name="Fizik";
        fiz101.credit=4;

        Student student1=new Student();

        student1.name="Betül";
        student1.maxCredit=11;


        //ArrayList<Lesson> dersListesi=new ArrayList<>();
// Aşagıdakini yazmadan bunu yazınca calismıyor.
//ustteki burada olmasa da olur. Ama alttaki olmadan olmuyorr!!!
        student1.dersListesi=new ArrayList<>();


        // buraya kontrol konacak toplam aldığı krediye bakılarak
        // Eklenecek ders ile öğrencinin o ana kadarki kredisi toplamı
        // öğrencinin alabileceği max krediyi aşmıyorsa ekle

   if(student1.totalCredit()+mat101.credit<=student1.maxCredit){
       student1.dersListesi.add(mat101);
   }
        else {System.out.println("mat101 için Krediniz doldu.");}

        if(student1.totalCredit()+java101.credit<=student1.maxCredit){

            student1.dersListesi.add(java101);
        }
        else {System.out.println("java101 için  Krediniz doldu.");}



        if(student1.totalCredit()+java101.credit<=student1.maxCredit){

            student1.dersListesi.add(fiz101);
        }

        else {System.out.println("fiz101 için Krediniz doldu.");}



    }
}
