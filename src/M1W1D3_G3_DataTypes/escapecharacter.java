package M1W1D3_G3_DataTypes;

public class escapecharacter {
    public static void main(String[] args) {
       System.out.println("pazartesi");
       System.out.println("salı");
       System.out.println("carsamba");

// yorum satırıiçin
        //ctrl ile/ basılırsa //
        // ctrl+ shift / tusuna basılırsa  /*  */



        // \n  yeni satır acar
        System.out.println(" pazartesi\n salı\n carsamba"); // 3 üde aynı hizada olsun diye ilkini space ledim.

        // /t  tap tusuna basma etkisi yapar
        System.out.println("pazartesi \t salı");
        System.out.println("\t pazartesi  salı");
        System.out.println("\t carsamba preşembe\tcuma \t certesi \n\t   pazar"); // \n ve \t aynı anda kullanılabilir.
        System.out.println("\npazartresi \t\nsalı");  // AMA önce \t sonra \n kullanırsan kıymeti yok. alt satıra tap yapmaz
        System.out.println("\tsalı");

        // cift tırnak  koymak için BAŞINA Ve SONUNA   \"  konur
        System.out.println("java"); //  "java"
        System.out.println("\"java\"");
        System.out.println("\"MUSTAFA\"");
        System.out.println("\"A\"");


        System.out.println("java");   //  "\java"   yazmak için
        System.out.println("\\java");  // AMA BİZ BUNUNLA "\java"  yazdırmıs olmadık kı???????
        System.out.println("'java'");  // 'java' içinse
        // System.out.println("\java");   \\   bunu neden böyle direk yazamadım... yazamamamın mantıgı ne


    }
}
