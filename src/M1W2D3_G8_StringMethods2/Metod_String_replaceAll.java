package M1W2D3_G8_StringMethods2;

public class Metod_String_replaceAll {
    public static void main(String[] args) {
        // replaceAll= replace ile benzer, ama kriterler göre çalışır. cok daha kullanilı...

        String Str="Ben evdeyim, ya Siz Neredesiniz";

        System.out.println("orijinal hali = " + Str);
        System.out.println("e,i,a ler  _ olsun=" + Str.replaceAll("[eia]","_"));
        System.out.println("BÜYÜK HARFLERİN  _ YAPILMIŞ HALİ = " + Str.replaceAll("[A-Z]","_"));
        System.out.println("KÜÇÜK harflerin  _ YAPILMIŞ HALİ = " + Str.replaceAll("[a-z]","_"));


        System.out.println("harflerin x yapılmış hali= " +Str.replaceAll("[A-Z]","x").replaceAll("[a-z]","x") );
        System.out.println("harflerin x yapılmış hali= " +Str.replaceAll("[A-Z]","y").replaceAll("[a-z]","x") );
        System.out.println(" harflerin x yapılmış hali=" +
               Str.replaceAll("[A-Z]","x").replaceAll("[a-z]","x"));
// sonuncuyu anlamadım
        

    }
}

