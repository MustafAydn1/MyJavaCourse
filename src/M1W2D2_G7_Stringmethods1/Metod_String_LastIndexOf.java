package M1W2D2_G7_Stringmethods1;

public class Metod_String_LastIndexOf {
    public static void main(String[] args) {
        // String içinde  aranan karakter(ler)in  sondan itibaren ılk indexini verir..
        //indexof un sondan olan hali, fakat index numaralaması hep baştan 01234... dıye baslar. buna göre yapılır.

        String text="Good";
        System.out.println("En sondaki  o  nun indexi= "+text.lastIndexOf("o"));
        System.out.println("ilk baştan o  nun indexi= "+text.indexOf("o"));


        String text2= "ankara";

        System.out.println("En baştaki a nın indexi= "+text2.indexOf('a'));
        System.out.println("En sondaki  a nın indexi= "+text2.lastIndexOf('a'));

        String Str="Evin önundeki asmaya beni götürseler asmaya ben yarimden...";
        System.out.println("en sondaki asma = "+Str.lastIndexOf("asma")); // kelimenın ilk harfin indexi verir
        System.out.println("en baştakidaki asma = "+Str.indexOf("asma"));

        System.out.println("ilk boşluk= "+Str.indexOf(" "));
        System.out.println("Son boşluk= "+Str.lastIndexOf(" "));


        // lastindexof deyince birkac alternatif cıkıyor. sana ne lazım sa onu kullan.. str--char-int-  vb.







    }
}
