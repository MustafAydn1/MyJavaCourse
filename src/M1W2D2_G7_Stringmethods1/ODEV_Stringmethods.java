package M1W2D2_G7_Stringmethods1;

import java.util.Scanner;

public class ODEV_Stringmethods {
    public static void main(String[] args) {

        // 2 kelimelik bir isimde ad ve soyadı ayırın
        // 3 kelimelik bir isimde ad ikinci ad ve soyad olarak ayırınız(Şöyle Ahmet Emin Yılmaz şeklinde girilen bir tam isimdeki bütün kelimeleri ayırınız)
        // bir stringin boş olup olmadığını kontrol ediniz
//***********************************************************
//

     /*   Scanner input=new Scanner(System.in);
        System.out.print("Birşeyler yaz=");
        String Str=input.nextLine();
        System.out.println("Yazılan = " + Str);

        System.out.println(Str.contains(" "));

*/



      Scanner input= new Scanner(System.in);
        System.out.print("Ad Soyad=");
        String adı=input.nextLine();
        System.out.println("ADI VE SOYADI="+adı);

        int ilkara=adı.indexOf(" ");
        String ilki=adı.substring(0,adı.indexOf(" "));
        String iki=adı.substring(adı.indexOf(" ")+1,adı.lastIndexOf(" "));
        String üç =adı.substring(adı.lastIndexOf(" ")+1);

        // NEDEN BURADA ÇIKTIYI DOĞRU VERMİYOR.. ayrı ayrı yapınca doğru veriyor.
        //System.out.println("Adınız= "+ilki+" "+"\nikinci ad= "+iki+"\nSoyadınız= "+üç);

       System.out.println("Adınız= "+ilki);
        System.out.println("İkinci Adınız= "+iki);
        System.out.println("SoyAdınız= "+üç);





        // 3 isimlik bir ismi kısaca yazdırın z.m.d


  /*     Scanner input=new Scanner(System.in);
        System.out.print("Adınız ve Soyadınızı giriniz= ");
        String adsoyad=input.nextLine();
        System.out.println("Adınız ve Soyadız= "+adsoyad);

        char ilkad=adsoyad.charAt(0); // adsoyad.substring(0,1); Şeklinde de bulunabilir.
        char ikinciad=adsoyad.charAt(adsoyad.indexOf(" ")+1);// adsoyad.substring(adsoyad.indexof(" ")+1,adsoyad.indexof(" ")+2)
        char üçüncüisim=adsoyad.charAt(adsoyad.lastIndexOf(" ")+1);



        System.out.println("Sayın= "+ilkad+"."+ikinciad+"."+üçüncüisim+"."+ "   İyi Günler Dileriz...");


//**************************************************************************


      /*  Scanner input=new  Scanner(System.in);
        System.out.print("Ad Soyad Giriniz= ");
        String bilgi=input.nextLine();
        System.out.println("Adınız ve Soyadınız= "+bilgi);

       int ilkadı=bilgi.indexOf(" ");
       String ilk=bilgi.substring(0,bilgi.indexOf(" "));
       String iki=bilgi.substring(bilgi.indexOf(" ")+1);

        System.out.println("ADINIZ= "+ilk+"\nSOYADINIZ= "+iki);


        //*************************************************************
        // 3 kelimelik bir isimde ad ikinci ad ve soyad olarak ayırınız

        Scanner input= new Scanner(System.in);
        System.out.print("Ad Soyad= ");
        String adı=input.nextLine();
        System.out.println("ADI VE SOYADI="+adı);

       int ilkara=adı.indexOf(" ");
       String ilki=adı.substring(0,adı.indexOf(" "));
       String iki=adı.substring(adı.indexOf(" ")+1,adı.lastIndexOf(" "));
       String üç=adı.substring(adı.lastIndexOf(" ")+1);

        System.out.println("Adınız= "+ilki+" "+iki+"\nSoyadınız= "+üç);
     */
     //*************************************************************************
       // bir stringin boş olup olmadığını kontrol ediniz

      /*  Scanner input=new Scanner(System.in);
        System.out.println("Şifrenizi Giriniz= ");
        int Şifre=input.nextInt();
        System.out.println("Girdiğiniz Şifre= "+Şifre+" 'dir");

        boolean şfr=Şifre.
        System.out.println("Şifreniz= "+);
        bu kısım hata verdi. çunku isempty ile int incelenemiyor. peki adam şifreyi yazmadıgını nasıl anlayacagım.


/*
        Scanner input=new Scanner(System.in);
        System.out.print("Şifrenizi Giriniz= ");
        String şifre=input.nextLine();
        System.out.println("Girdiğiniz Şifre= "+şifre+" 'dir");



        System.out.println("Şifreniz= "+şifre.isEmpty());

*/





    }



}
