package M1W2D2_G7_Stringmethods1;

public class Metod_String_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str="Merhaba";

        // 2 stringi büyük küçük karakter ayırımı yapmadan karşılaştırır
        // sonuç boolean değişkenidir.

        System.out.println("Eşit mi= "+ str.equalsIgnoreCase("mERhaBA"));

        System.out.println("eşit mi= "+ str.equalsIgnoreCase("merba"));
        System.out.println("eşit mi="+str.equalsIgnoreCase("merHABA"));


        boolean eşitmi=str.equalsIgnoreCase("merhABA");
        boolean eşitmi1=str.equalsIgnoreCase("merhsBA");

        System.out.println("eşitmi1 = " + eşitmi1);

        System.out.println("eşitmi = " + eşitmi);

        

        //




    }

}
