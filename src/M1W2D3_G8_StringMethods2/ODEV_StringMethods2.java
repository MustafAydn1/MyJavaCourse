package M1W2D3_G8_StringMethods2;

import java.util.Scanner;

public class ODEV_StringMethods2 {
    public static void main(String[] args) {

      /*

        2- Girilen bir string içinde bir kelime arayınız, büyük HARF veya küçük harf de olsa aranan kelimede bulsun.

        3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.

        4- Kullanıcdan alacağını şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını , büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız
*/


        //1- küçük harflerle girilen ad ve soyadın. ilk harflerini büyük yap...
        // bunun 3 isimli olanı içinde çalış. bakalım.

        Scanner input=new Scanner(System.in);
        System.out.print("ad soyad giriniz= ");
        String tamAd=input.nextLine();
        System.out.println("Adınız ve Soyadınız = " + tamAd);
   // mehmet akif ersoy

       String ad1=tamAd.substring(0,1).toUpperCase();  //M
       String ad2=tamAd.substring(tamAd.indexOf(" "),tamAd.indexOf(" ")+2).toUpperCase(); // A
       String ad3=tamAd.substring((tamAd.lastIndexOf(" ")),tamAd.lastIndexOf(" ")+2).toUpperCase();


       String Birleştir=("Adınız= "+ad1+tamAd.substring(1,tamAd.indexOf(" ")+1))  //Mehmet
                                    +ad2+tamAd.substring(tamAd.indexOf(" ")+2,tamAd.lastIndexOf(" ")+1)
                                    +ad3+tamAd.substring(tamAd.lastIndexOf(" ")+2);

        System.out.println("Birleştir = " + Birleştir);













        // String =tamAd.substring(0,1).toLowerCase();










      /*
        SORU -4
        Scanner input=new Scanner(System.in);
        System.out.print("Şifrenizi girin= ");
        String incele=input.nextLine();
        System.out.println("Şifreniz= "+incele);

        System.out.println("inceledim= "+incele.equalsIgnoreCase("1qaz.xsw2"));
        System.out.println("inceledim2= "+incele.equals("1QAZ.XSW2"));



/*
soru 2
        Scanner input=new Scanner(System.in);
        System.out.print("Birşeyler yazınız= ");
        String yaz=input.nextLine();
        System.out.println("Yazdınız= "+yaz);

        System.out.println("bul harf= "+yaz.contains("harf"));
        System.out.println("bul HARF= "+yaz.contains("HARF"));

       */


        //3. soru...

      /*  Scanner input= new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz= ");
        String cümle=input.nextLine();
        System.out.println("Girilen = " + cümle);

        System.out.println("Boşluklar yerine _ yazılsın = " + cümle.replace(" ","_"));
*/





    }

}
