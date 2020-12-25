package M2W1D3_G23_Methods2;

public class Ja_Methods1 {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya 1");
        System.out.println("Merhaba Dünya 2");

        merhabaYaz();

        int enb = Math.max(3,4); // 2 sayıdan en büyüğünü bulup

        int enbTurkce= enBuyukBul(3,4);
        System.out.println(enbTurkce);


        String adsoyad= AdSoyadBirlestir("Ali", "Demir");
      //  System.out.println("adsoyad = " + adsoyad);
        // burda birleşmiş haline ulaşabiliyormuyum şu anda, return yaptığımda geri alabildim
    }

    public static String AdSoyadBirlestir(String ad, String soyad)
    {
        System.out.println(ad+" "+soyad);//???bunu mainin içide tanımlı return uzantıısndan önce yazıyor.işleyiş nasıl
        return ad+" "+soyad;
        //System.out.println(ad+" "+soyad); returnun  altında işlem olmaz. break gibi...
    }

    public static int enBuyukBul(int a, int b)
    {
        if (a>b)
            return a; // returnun görevi bu fonksiyonu çağıran yere değeri göndermek
        else
            return b;

        // return Math.max(a,b);
    }

    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");
    }

}
