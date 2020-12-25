package M2W4D1_G36_Constructors.example;
// bir tür yapısı
public class Student {

    int id;
    String name;
    String surName;
    int classroom;


/*
Constructor: yapıcı metod-- ilk olusumda yapılması
istenen işlemlerin yazıldıgı metod
 */

    public  Student(int id,String name,String surName,int classroom){
// this ==> class ın (Student) kendisini gösteriyor.
// this.  sonrasında gelenşey herzaman fields dir.
// = sonrası da artık eşitlenendir.Artık bununla devam edecek.

        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=classroom;

      //  this(id,name,surName,classroom);
// bu kısmı tek satırda yapamıyoruz... Ana kısım oldugu için.BURAYI SİLEMEYİZ.

    }
    public  Student(int id,String name,String surName){
// overloading ile sınıfı belli olmayan ögrenci kaydı yapılır.
/*
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.classroom=0;
*/
        this(id,name,surName,0);
    }

    public  Student(int id,String name){
// overloading ile .... belli olmayan ögrenci kaydı yapılır.
/*
        this.id=id;
        this.name=name;
        this.surName="";
        this.classroom=0;
*/
        this(id,name,"",0);
    }
    public  Student(int id){
// overloading ile .... belli olmayan ögrenci kaydı yapılır.
/*
        this.id=id;
        this.name="";
        this.surName="";
        this.classroom=0;
*/
        this(id,"","",0);
    }

    public  Student(){
// overloading ile .... belli olmayan ögrenci kaydı yapılır.

        this.id=0;
        this.name="";
        this.surName="";
        this.classroom=0;

    }
/*
    public void yazdir(){
        System.out.println(id+" "+name+" "+surName+" "+classroom);
    }
//bu da yapılabilir ama neden ugrasayım ki...nasılsa toString yapıyor.
 */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", classroom=" + classroom +
                '}';
    }

/*
    public  static Student createStudent(int id,String name,String surName,int classroom){
        Student ogrenci1 =new Student();
        ogrenci1.id=1;
        ogrenci1.name="Ayse";
        ogrenci1.surName="Yılmaz";
        ogrenci1.classroom=10;

        return ogrenci1;
BUNU ARTIK TEK TEK YAPMAYA GEREK YOK..
    }
 */


}
