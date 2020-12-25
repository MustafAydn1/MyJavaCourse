package M1W2D2_G7_Stringmethods1;

public class Metod_String_Indexof {
    public static void main(String[] args) {
        // Verilen karakter(lerin) in string içerisindeki başlangıç index ini verir.//
        //contains den farkı indexini verir. contains ise true & false verir.


        String text= "Good";

        System.out.println("G harfinin indexi= "+ text.indexOf("G")); // indexler 0 dan başlar...
        System.out.println("d harfinin indexi= "+ text.indexOf("d"));
        System.out.println("d harfinin indexi= "+ text.indexOf('d')); // tek harf/karakter girersen. tek tırnakta yeter.
        System.out.println("k harfinin indexi= "+ text.indexOf("k")); // bulunamadı ise  -1   yazar.
        System.out.println("od harfinin indexi= "+ text.indexOf("od")); // var ise ilk harfini verir..


        int index= text.indexOf("o");
        System.out.println("index = " + index);


        int index1= text.indexOf('d');
        System.out.println("index1 = " +text.indexOf('d')); // burada int ile tanımladıgımı direk yazdım yine oldu.
        // int sonucunu verir. ama ille de int ile tanımlaman gerekmez..


        String Str= "Komşu Evi Boşalttı";
        System.out.println("boşluk= "+Str.indexOf(" "));// hep ilk boşlugu alır








    }


}
