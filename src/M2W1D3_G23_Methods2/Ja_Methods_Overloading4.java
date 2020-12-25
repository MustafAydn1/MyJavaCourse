package M2W1D3_G23_Methods2;

import java.util.Arrays;
import java.util.Scanner;

public class Ja_Methods_Overloading4 {

// Kullanıcı bir öğretmendir.
// Önce Öğrencinin adı girilecek, sonra aldığı farklı miktardaki notlar girilecek
// Ahmet Demir  bu okunduktan sonra
// 80 56 78 90  okutulacak ve öğrenci adı ve ortalaması yazılacak ekrana
// ortlama bulma işlemini bir fonksiyonda yapınız, fakat sonucu yazdırma işlemini
// mainde yaptırınız.Her öğrenci farklı sayıda not girilebilir.

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Öğrencinin Adı Soyadı=");
        String isim = oku.nextLine();


        System.out.print("Öğrencinin notları=");
        String strNotlar = oku.nextLine(); // 60 40 70 80
        //System.out.println(Arrays.toString(strNotlar));// bu olmaz cünkü str Notlar diziye tanımlı değil ki...
       // System.out.println(strNotlar);// bu olur. notları görmüş olursun...

        System.out.println("Öğrenci = " + isim);
        System.out.println("Ortalaması = " + ortalamaBul(strNotlar)); //??? bu dönüşüm bu kadar farklı isimle nasıl oldu
    }

    /* hocanın cözumu....

        public static double ortalamaBul(String notlar)
        {
            double toplam=0;
            String[] notDizi=notlar.split(" ");
    //notlar birleşik stringini,notDizi adında ayrılmış string diziye cevirdim.
    //çünkü; notlar sitringi üzerinde çalışabilmem için split ile ayırmam lazımdı.

            for(int i=0;i<notDizi.length;i++)
            {
                toplam += Integer.parseInt(notDizi[i]);//notlar>>notDizi{string idi}Artık integer  bir dizi oldu.toplamak için
            }

            return toplam/notDizi.length;
        }
    */
    public static double ortalamaBul(String notlar) {
        double toplam = 0;

        String[] notDizi = notlar.split(" ");

        for (int i = 0; i < notDizi.length; i++)
        {

            toplam += Integer.parseInt(notDizi[i]);

        }

        return (toplam/notlar.length()); // SONUC YANLİŞ CIKIYOR????
      // retur
        // n toplam/diziNot.length(); // ???? bunu neden kabul etmedi...

    }


}