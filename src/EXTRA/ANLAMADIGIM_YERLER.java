package EXTRA;

import java.util.Arrays;
import java.util.Scanner;

public class ANLAMADIGIM_YERLER {

    public static void main(String[] args) {

      /*  // replaceAll= replace ile benzer, ama kriterler göre çalışır. cok daha kullanilı...

        String Str = "Ben evdeyim, ya Siz Neredesiniz";

        System.out.println("orijinal hali = " + Str);
        System.out.println("e,i,a ler  _ olsun=" + Str.replaceAll("[eia]", "_"));
        System.out.println("BÜYÜK HARFLERİN  _ YAPILMIŞ HALİ = " + Str.replaceAll("[A-Z]", "_"));
        System.out.println("KÜÇÜK harflerin  _ YAPILMIŞ HALİ = " + Str.replaceAll("[a-z]", "_"));


        System.out.println("harflerin x yapılmış hali= " + Str.replaceAll("[A-Z]", "x").replaceAll("[a-z]", "x"));
        System.out.println("harflerin x yapılmış hali= " + Str.replaceAll("[A-Z]", "y").replaceAll("[a-z]", "x"));
        System.out.println(" harflerin x yapılmış hali=" +
                Str.replaceAll("[A-Z]","x").replaceAll("[a-z]","x"));

        System.out.println(" harflerin x yapılmış hali=" +
                Str.replaceAll("[A-Z]","x").replaceAll("[a-z]","x"));

        //büyükleri x küçükleri y yapsın

        // SON İKİSİNİ ANLAMADI.
        */
//*******************************************************************
   /*   int c=12;
        int d=5;
        System.out.println("c % d= "+ (c&d)); //BU  NE OUYOR
  */ //********************************************************************/
    /*    double c=3.14;
        double d=2.1;

        System.out.println("c/d= "+(c/d));
        System.out.println("c/d= "+((float)c/d));    neden bu fark oluştu

     */
//***************************************************************************
/*
        // Girilen bir sayının birler basamağını yazı ile yazdırınız
        // Soru : yukarıdaki soru - sayı ise çalışmadı, - olması durumunda da çalışmasını
        // nasıl sağlarsınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();

        if(sayi<0)       // bu bölüm  negatif sayılarda  da sonucu bulmak için...
            sayi=-sayi;  // veya sayi=sayi*-1;
                        //BU İFADEYİ int İN ALTINA YAZINCA NEDEN ÇALIŞMADIĞINI ANLAMADIM.

        int birler = sayi %10;


        if (birler == 0) System.out.println("sıfır");
        if (birler == 1) System.out.println("bir");
        if (birler == 2) System.out.println("iki");
        if (birler == 3) System.out.println("üç");
        if (birler == 4) System.out.println("dört");
        if (birler == 5) System.out.println("beş");
        if (birler == 6) System.out.println("altı");
        if (birler == 7) System.out.println("yedi");
        if (birler == 8) System.out.println("sekiz");
        if (birler == 9) System.out.println("dokuz");
 */
//**********************************************************************************************
// yorum satırıiçin
        //ctrl ile/ basılırsa //
        // ctrl+ shift / tusuna basılırsa  /*  */

        //  double -> float -> long -> int -> char -> short -> byte :   manuel dönüşüm
      //  float =4 byte---- long = 8 byte  idi.  yerdeğişmesi gerek mez mi...
 // if lerde parantez meselesi anlaşılmadı...**************************************************

 /*       Scanner input= new Scanner(System.in);
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
*/

/*


                // Kullanıcından alacağınız 5 adet meyve ismini bir diziye atadıktan
                // sonra, elma ismi geçen meyvelerini ekrana ayrı bir döngüde yazdırınız.

                //hocanın cözümünü incele..

                Scanner input=new Scanner(System.in);
                String [] meyve=new String[5];

                for(int i=0;i<meyve.length;i++){
                    System.out.print("meyve isimleri giriniz: ");
                    meyve[i]=input.nextLine();

                }
                System.out.println("Arrays.toString(meyve) = " + Arrays.toString(meyve); //?????? bunu da yap

                for(int i=0;i<meyve.length;i++){
                    // if(meyve[i].contains("elma"))
                    if(meyve[i].equalsIgnoreCase("elma")) // bu neden olmuyor.??????????
                        System.out.println(meyve[i]);
                    //  if(meyve[i].toLowerCase().contains("elma")) //yerelması da yazsan cıkar.
                    //    System.out.println(meyve[i]);

                }
               */




            }
        }



