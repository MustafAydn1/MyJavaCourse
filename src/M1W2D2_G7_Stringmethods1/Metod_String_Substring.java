package M1W2D2_G7_Stringmethods1;

public class Metod_String_Substring {
    public static void main(String[] args) {

        // Substring= Stringin belli bir bölümünü  alma işlemi...

        String text="Merhaba arkadaşlar";

        System.out.println("1. Bölüm= "+text.substring(1,5)); // 1 nolu dan index ten 5 e kadar alır. 5 dahil değil
        System.out.println("2. Bölüm= "+text.substring(0,3)); //  böylece baştan buraya kadar.aldın. alttada sonuna kadar
        System.out.println("3. Bölüm= "+text.substring(3)); // tek index yazarsan verilen index ten itibaren sonuna kadar...

        String strAlinan = text.substring(3,13);// bu alınan parca atanabilir. dene kullan gör.
        System.out.println("4. Bölüm= "+strAlinan);

        System.out.println("5.bölüm= "+text.substring(0,4));

        System.out.println("birleştir= "+text.substring(0,3).concat(text.substring(3)));// bu super oldu.
        // iki metni indexlerinden birleştirmek için...



    }
}
