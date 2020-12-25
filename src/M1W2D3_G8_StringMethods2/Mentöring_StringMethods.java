package M1W2D3_G8_StringMethods2;

public class Mentöring_StringMethods {
    public static void main(String[] args) {

        //

        /**
         * index of;  char  ın tersidir.
         * indexOf, stringi ver. sana indexini versin
         * char; index i ver. char çıksın..
         *
         * sub= parça demek... substring=Stringin içindeki parçayı bul
         *trim= traşlamak
         * replace=tekrar yerleştir. [0-9]   [A-Z,a-z]  kullanımlarını ıncele...

        */


String çicek= "çicekliler";
        System.out.println("yaz"+çicek.indexOf("e"));
        System.out.println("yaz"+çicek.indexOf("lil"));


        String Str1= "sub= parça demek... substring=Stringin içindeki parçayı bul";

        System.out.println("11= "+Str1.replace(" ","")); // BOŞLUKLARIN TAMAMINI SIFIRLAYABİLİRSİN.

        System.out.println("22="+ Str1.replace("[a-z]","[_]"));


    }





}
