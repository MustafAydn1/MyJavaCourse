package M1W2D3_G8_StringMethods2;

public class Metod_String_replaceFirst {
    public static void main(String[] args) {

        //replacefirst-> replace ile aynı ama ilk   bulunanı değiştirir..

        String Str="Ben evdeyim ya siz neredesiniz";

        System.out.println("orjinal hali = " + Str);
        System.out.println("e ler a olsun = " + Str.replace("e","a"));
        System.out.println("e ler a olsun = " + Str.replaceFirst("e","a"));


    }


}



