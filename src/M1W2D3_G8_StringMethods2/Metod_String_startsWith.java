package M1W2D3_G8_StringMethods2;

public class Metod_String_startsWith {

    public static void main(String[] args) {
        //Bir string in  verilen String ile başlayıp başlamadığına bakar. sonuç boolean dır.
        // ...ile başlıyor mu   demek

        String Str="Evdeyim";

        System.out.println("Ev ile başlıyor mu="+Str.startsWith("Ev"));
        System.out.println("ev ile başlıyor mu="+Str.startsWith("ev"));
        System.out.println("vde ile başlıyor mu="+Str.startsWith("vde"));
        System.out.println("k ile başlıyor mu="+Str.startsWith("k"));




    }
}
