package M1W2D2_G7_Stringmethods1;

public class Metod_String_Equals {

    public static void main(String[] args) {
        // 2 string birebir eşit  olup olmadıgını kontrol edr. sonuc. boolean değişkenidir.
        
        String str= "Merhaba";
        boolean birebirEsitMi= str.equals("Merhaba");

        System.out.println("birebirEsitMi = " + birebirEsitMi);
        System.out.println("birebirEsitMi = " + str.equals("merhaba"));// boolean  tanımına gerek kalmadan böyle de yapılabilir

        System.out.println("\ntam olarak eşit mi="+str.equals("merHABa"));
        
        
        
        
    }
}
