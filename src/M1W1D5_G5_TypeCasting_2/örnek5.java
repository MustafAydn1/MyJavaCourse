package M1W1D5_G5_TypeCasting_2;

public class örnek5 {
    public static void main(String[] args) {
        // kişinın agırlıgı double  boyunu ınt olarak deger verip tek satırda boyunuz=  kılonuz = yazdırınız

        double boy= 1.82;
        int kilo = 84;


        String str = ("BOYUNUZ=" + boy +" " + "KİLONUZ" + kilo ); // + ile verilen degeri buraya kat/yaz... demek.
        System.out.println(str);
        String str1= ("KİLO= "+kilo+ " "+ "BOY="+ boy);// STRİNG LE İKİ SATIRDA TAZMAK İSTERSEN. ÖNCE TANIMLA SONRA CIKTI.
        System.out.println(str1);

        System.out.println("BOYUM="+boy+"\n"+"KİLOM="+kilo); // TEK SATIRDA BÖYLE DE YAZILIR.








    }
}
