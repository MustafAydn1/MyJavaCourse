package M2W4D2_G37_AccessModifiers.intanceModifiers.privateModifiers.same;

public class Company {

    public static void main(String[] args) {


    Person personel= new Person();
    personel.id=1;
    personel.name="Ahmet";
    personel.userName="ahmet";
//  personel.password="1234";
//private old. için direk erişilemez.
//Burası Company class ı. password Person classında...
//private başka class dan cagrılamaz.
//PEKİ ÇÖZUMU NEDİR??? METOD BELİRLEYİP öylece cagırmak

      personel.SifreBelirle("1234adjfjdfkj");

      //System.out.println(personel.pass);
      // kırmızı  çünkü passworda ulaşımı prıvate ile
      //engelledik.bu yuzden personel. ile ulasılmaz.

       // personel.SifreGoster();
        System.out.println("personel = " + personel);
// metod filan tanımadı herşeyı verdi...

    }
}
