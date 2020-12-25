package M2W3D1_G31_CLASS.example.Ex1;

public class Student {// zaten calışacagım class student idi. direk adını verip başladım..
   // fields
    String name;
    int grade;


    Student ogrenci1=new Student(); // burada ne işe yarar. main dekini silersem orası calişmıyor???????????
/*
    ogrenci1.name="Betül";
    ogrenci1.grade=2;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);
        */

    School schoolInfo; // başlatılmamış bir nesne adı henuz new olmadıgı için... nesne main de tanımlanır.
                      //bunu burada tanımlamazsam main nin altında ögrenci ile ilişkilendiremem.
}
