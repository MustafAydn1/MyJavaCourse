package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class MathClass_Random1 {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner input= new Scanner(System.in);
        System.out.print("BİR SAYI GİRİNİZ= ");
        int sayi=input.nextInt();

 /*       int üretilenSayi=(int)((Math.random()*sayi)+1);

        System.out.print("Sayı Tahmininiz= ");
        int Tahmin=input.nextInt();

        if(üretilenSayi==Tahmin)
            System.out.println("tebrikler");
        else
            System.out.println("maalesef tekrar dene");

        System.out.println("üretilenSayi = " + üretilenSayi);
*/
// sıfır dahil kulanıcının girdiği sayıya kadar uretiniz derse; (sayı+1) yap. en sondaki +1 i yazma ki,0 ı da alsın.
        int üretilensayı1=(int)((Math.random()*(sayi+1)));
        System.out.println("üretilensayı1 = " + üretilensayı1);







    }
}
