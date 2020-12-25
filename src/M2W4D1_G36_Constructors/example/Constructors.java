package M2W4D1_G36_Constructors.example;

public class Constructors {
    public static void main(String[] args) {
/*
        Student ogrenci1 =new Student();
        ogrenci1.id=1;
        ogrenci1.name="Ayse";
        ogrenci1.surName="Yılmaz";
        ogrenci1.classroom=10;

     // 2. Yöntem:
       Student ogrenci2=Student.createStudent(2,"Ahmet","Demir",11);

*/
      Student ogrenci3=new Student(3,"Ali","Dogan",9);
        System.out.println("ogrenci3: "+ogrenci3.name+"  "+ogrenci3.surName);

        Student ogrenci4=new Student(4,"Zeynep","Toprak");
        Student ogrenci5=new Student(5,"Zeynep");
        Student ogrenci6=new Student(6);
        Student ogrenci7= new Student();
        ogrenci7.id=7;
        ogrenci7.name="Veli";
        ogrenci7.surName="Kara";
        ogrenci7.classroom=7;

      System.out.println("ogrenci4 = " + ogrenci4);
      System.out.println("ogrenci3 = " + ogrenci3);
      System.out.println("ogrenci5 = " + ogrenci5);
      System.out.println("ogrenci6 = " + ogrenci6);
      System.out.println("ogrenci7 = " + ogrenci7);
/*
overloading ile constructorlarda olanları yazdırdık.
parametre olmayanlara this(id,...)ile degerlerini sabit biz atadık.
ogrenci7 boş cons. iken yeni degerlerini elle verdiğimizden böyle cıktı verdi

 */






     // ogrenci5.yazdir();

    }
}
