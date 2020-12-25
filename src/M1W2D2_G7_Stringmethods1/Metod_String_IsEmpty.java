package M1W2D2_G7_Stringmethods1;

public class Metod_String_IsEmpty {
    public static void main(String[] args) {

        // String tamamen boşmu değil mi onu kontrol ediyor, sonuç true false

        String str1="hello";
        System.out.println(" str1 içi boş mu= "+str1.isEmpty());

        String str2="";
        System.out.println(" str2 içi boş mu= "+str2.isEmpty());// Dikkat= "" içi boş demektir. karakter yok.

        String str3=" ";
        System.out.println(" str3 içi boş mu= "+str3.isEmpty());// dikkat= " " içi dolu. karakter var.boşluk da krkterdir.


        boolean içiboşmu=str3.isEmpty();
        System.out.println("içiboşmu = " + içiboşmu);


        boolean içiboşmuu=str2.isEmpty();
        System.out.println("içiboşmu = " + içiboşmuu);

        boolean içiboşmuuu=str1.isEmpty();
        System.out.println("içiboşmu = " + içiboşmuuu);

      String Str4="Boşluk";
        System.out.println("boş mu= "+Str4.isEmpty());

    }

}
