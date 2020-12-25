package M2W3D3_G33_CLASS_Methods2.StaticAndNonStatic;

public class StaticAndNonStatic {
    public static void main(String[] args) {

  // BU SORUNUN  StaticAndNonStatic İLE İLİŞKİSİNİ ANLAYAMADIM. DERSİ TEKRAR DİNLE...

        // Benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım
        // var.
        // mesala int to string , string to int, vs. vs.. bunları yapan bir sinif yazınız.
        // ve bunları main de kullanarak gösteriniz.

        // 1.Yöntem tip dönüşümü için javanın direk komutları
      int sayi=345;
        String strRakam=String.valueOf(sayi);     //sayıyı stringe cevirdi.
        int intRakam=Integer.parseInt(strRakam);  // stringi sayıya cevirdi.

        // 2.Yöntem tip dönüşümü için kendi sınıfımı yazdım onu kullanacağım
//        Utility util=new Utility();
//        strRakam = util.getString(sayi);
//        intRakam = util.getInt(strRakam);


 // 3. yöntem: yeniden oluşturmadıgımız sınıfı direk adı ile kullanıyoruz.
//Utility=yararlı---faydalıı...

        strRakam= Utility.getString(sayi);
        intRakam=Utility.getInt(strRakam);

        //Aynı Math sınıfı gibi...
        Math.random();


        int sayi1=345;
        String strSayi=Integer.toString(sayi1);
        int intSayi=Integer.parseInt(strSayi);

        intSayi= Utility.getInt(strSayi);
        strSayi= Utility.getString(intSayi);

        Utility.getBool(strSayi);
        Utility.getDouble(strSayi);
        Utility.getString(intSayi);

      System.out.println("intSayi = " + Utility.getInt(strSayi));
      System.out.println("strSayi = " + Utility.getString(intSayi));




    }
}
