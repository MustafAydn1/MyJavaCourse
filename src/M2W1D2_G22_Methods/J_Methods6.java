package M2W1D2_G22_Methods;

import java.util.Scanner;

public class J_Methods6 {
    public static void main(String[] args) {
        // Kullanıcıdan 2 sayı isteyiniz, toplamını bir methodda yaptırınız, sonucu mainde yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı =");
        int sayi1=oku.nextInt();

        System.out.print("2.Sayı =");
        int sayi2=oku.nextInt();

        int sonuc = toplamYaz(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc); // kullanıcıdan da alıp yapar

        toplamYaz(12,13);// bu haliyle bir işe yaramaz.
        System.out.println(toplamYaz(12,13)); // sende verip yaparsın. metodlar bunun için var..veya başka şekildekullan

        int enb = enBuyuk(sayi1,sayi2); // int enb= Math.max(3,4);  bunun gibi
        System.out.println("enb = " + enb);
    }

    // void : geriye bir şey göndermeyen yani return olmayan demek
    public static int toplamYaz(int s1, int s2)  // fonksiyondaki değişkenler gönderilen değişkenlerle
    // aynı isimde olmak zorunda değil, sırasına göre bire bir eşleşiyor.
    {
        int toplam= s1+s2;

        return toplam;
    }

    public static int enBuyuk(int s1,int s2)
    {
        if (s1 > s2)
            return s1;
        else
            return s2;
    }
/*

return ü main in içinde işlem sonucunu yazdırabilmek için mi kullandık hocam. normalde yazamıyorduk demi
@Huseyin U.  deger olarak main icinde kullanmak istiyorsak return ile main in icine donduruyoruz sanirim

***
bu şekilde , programın kontrolu ve anlaşılması daha kolaydır. bu yuzden methodlar var.
 */

}
