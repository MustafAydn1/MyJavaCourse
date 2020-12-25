package M2W3D4_G34_CLASS_createStudent_unıtTest.tasks.task1;

public class Lesson {
    String name; // bununla instance olustu...
    int hour;


// bunu class ın içinde yapacaksın...
    // static koyduk ki direk çagırmak için...
    // main de tekrar tanımlamama gerek kalmasın...
    // hep static yaparsak hafıza da cok yer kaplar.
public  static Lesson createLesson (String isim,int saat){
    Lesson ders=new Lesson(); // ders nesnesini burada olusturdum
    ders.name=isim; //yukarıda şablonu olanı metodla kullandık
    ders.hour=saat;
    return ders;
}



}
