package M1W1D4_G4_TypeCasting1;

public class WideCasting {
    public static void main(String[] args) {

        // wideningcasting
        //byte -> short -> char -> int -> long -> float -> double ; otomatik dönüşüm

        int sayi=9;
        double rakam= sayi;
        long say=sayi;

        System.out.println("rakam= " + rakam);
        System.out.println("say = " + say);
        //  rakam ve say  üzerindeki koyuluktan da anlaşılacagi uzere bunları yeniden tanımlamak REDUNDANT..
        // AŞAGIDAKİ ŞEKİLDE DE OLUR.

        System.out.println("\nrakam= "+ (double)sayi );
        System.out.println("say= "+(long)sayi);







    }
}
