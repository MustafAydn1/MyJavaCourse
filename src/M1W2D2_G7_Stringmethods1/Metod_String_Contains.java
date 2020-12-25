package M1W2D2_G7_Stringmethods1;

public class Metod_String_Contains {

    public static void main(String[] args) {
        // bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
        // sonucu boolean değişkeni olarak döndürür


        String str="Hello";

        boolean varmi= str.contains("el"); // bu şekilde de olur...
        System.out.println("varmi = " + varmi);
        System.out.println("el varmi= "+varmi);


        System.out.println("llo var mı= "+str.contains("llo"));// boolen e girmeden direk de olur.
        System.out.println("e var mı= "+str.contains("e"));
        System.out.println("a var mı= "+str.contains("a"));
        System.out.println("O var mı= "+str.contains("O"));

        String str2="Esra Betül";
        System.out.println("a B  var mi= "+str2.contains("a B")); // boşlukların başı sonu da bakılır.







    }
}
