package M1W2D3_G8_StringMethods2;

public class Metod_String_toUppercase {

    public static void main(String[] args) {

        // Stringi buyuk harfe cevirir.

        String Str= "ben evdeyim";
        System.out.println("Orjinal hali= " +Str);
        System.out.println("BÜYÜK HALİ= "+Str.toUpperCase());
        System.out.println("BÜYÜK HALİ= "+Str.substring(0,1).toUpperCase());

    }
}
