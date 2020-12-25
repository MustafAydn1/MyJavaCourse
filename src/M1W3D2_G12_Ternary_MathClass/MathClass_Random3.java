package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class MathClass_Random3 {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri  tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra max değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max ı


        Scanner input = new Scanner(System.in);
        System.out.print("min max degerini bir boşluk bırakarak giriniz =");
       String min_max = input.nextLine(); // bir sayı yaz sonra space tuşu ile boşluk bırak 2. sayıyı yaz..!!!!

        // NEDEN STRİNG GİRMEK ZORUNDAYIM: Çünku  int girersem bir sayının bitimi ve boşluk kısmı
        // sonra diğer sayının başlangıcı ve bitimini tespit edemem. String olarak yazıp.
        //string olarak tespıt edip,bu stringi Integer e çeviririm. Matematiksel işleme devam ederim

        int ilkbosluk=min_max.indexOf(" "); // indexof zaten int verir. cevirmeye gerek yok.

        int min=Integer.parseInt(min_max.substring(0,ilkbosluk));
        int max=Integer.parseInt(min_max.substring(ilkbosluk+1));

        int randomNumberinRange=(int)(Math.random()*(max-min+1)+min);
        System.out.println("randomNumberinRange = " + randomNumberinRange);













    }
}
