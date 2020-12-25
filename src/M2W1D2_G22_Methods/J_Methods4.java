package M2W1D2_G22_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class J_Methods4 {
    public static void main(String[] args) {
        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük, enküçük elemanını, bütün elemanların toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarda yapınız.
        // 3 4 12 45 67  gibi giriş yapılacak.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayıları bir boşluk bırakarak yan yana giriniz=");
        String strTumSayilar=oku.nextLine();

        String[] strDizi = strTumSayilar.split(" "); // yukarıda String ve toplu yazılanı,parçalı string yaptık.
        int[] intDizi=new int[strDizi.length]; // Okunan string dizi nin uzunluğu kadar olsun

        for(int i=0; i< strDizi.length; i++)//  for döngusunu sırf integer e cevirip int dizinin elemanlarını
        {                                           // yerleştirmek için yaptık...
           intDizi[i]=Integer.parseInt(strDizi[i]);

        }

        System.out.println(Arrays.toString(intDizi));

        enBuyukYaz(intDizi);// metodun adı aşagıdan geliyor. intDizi yukarıdan geliyor..
        enKucukYaz(intDizi);
        tumTopla(intDizi);
        ortalamTaz(intDizi);
        secondmax(intDizi);
    }

    public static void enBuyukYaz(int[] dizi)//buradaki dizi adı sadece referans almak içindir.buradaki işlemler içindir
    {

        Arrays.sort(dizi);
        System.out.println("enb="+dizi[dizi.length-1]);
    }

    public static void enKucukYaz(int[] dizi)
    {
        Arrays.sort(dizi);
        System.out.println("enk="+dizi[0]);
    }

    public static void tumTopla(int[] dizi)
    {
        int toplam=0;
        for(int i=0;i<dizi.length;i++) {
            toplam += dizi[i];
        }
        System.out.println("toplam = " + toplam);
    }

    public static void ortalamTaz(int[] dizi)
    {
        int toplam=0;
        for(int i=0;i<dizi.length;i++) {
            toplam += dizi[i];
        }
        System.out.println("ortalama = " + toplam/dizi.length );
    }


    public static void secondmax(int[] dizi){
        Arrays.sort(dizi);
      //  for(int i=0;i<dizi.length;i++)
        System.out.println(dizi[dizi.length-2]);

    }


}

