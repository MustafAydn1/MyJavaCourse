package M3W1D4_G44_tryCatchBlocks_Checked.multiCatch;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
// Kullanıcıdan 5 kez 2 adet sayı alınız ve bölüm sonucunu ekranda gösteriniz.
public class _2_multipleCatch {
    public static void main(String[] args) {



        for (int i = 0; i <5 ; i++) {// for döngüsü neden try ın dışında kaldı.incele...
// try da catch de for döngüsünün içinde

        try {
            System.out.print("1.Sayıyı giriniz=");// incele... genelde ustte Scanner olurdu???
            Scanner oku=new Scanner(System.in);
            int a = oku.nextInt();

            System.out.print("2.Sayıyı giriniz=");
            Scanner oku2=new Scanner(System.in);// iki ayrı Scanner tanımlayarak,
            int b = oku2.nextInt();            //hata 1. veya 2. sayıda verdiği anda uyarı mesaj gönderildi.
                                              // yoksa iki sayının da girişi tamamlanınca hata mesajı gıdıyordu.
            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (ArithmeticException hata)// oluşan hataya ilişkin bir catch var ise önce oraya düşer...
        {

            System.out.print("hata oldu: ");

            System.out.println("2.Sayıyı 0 vermeyiniz.");
            i--;// hatalı girildiğinde for un hatalı adımını tekrar etmesi için sayacı 1 azalttık.
            // yani döngü 5 de bitsede kullanıcı dogru şekilde girinceye kadar tekraralar.ÖNEMLİ BİR CODE YAZIMI!!!!!!!!
        }
        catch(InputMismatchException hata){ // buraya üstteki hataya düşmezse
            System.out.println("hata oldu: ");
            System.out.println("Lütfen sayı giriniz.");
            i--;// hatalı girildiğinde for un hatalı adımını tekrar etmesi için sayacı 1 azalttık.
        }
        }



    }
}
