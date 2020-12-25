package M3W1D4_G44_tryCatchBlocks_Checked.throwingException;

import java.io.IOException;
import java.util.Scanner;

public class _8_CheckedThrowExample {
    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.
//*********************************************************************************
    // Eğer bir metod içerisinde Checked Throw var ise,
    // metoda adına hata işareti eklenmeden derlenmesine izin verilmez.
    // Hata çizgisini üzerine gelindiğinde Add ... a tıklandığınd otomatik ekleyecektir
    // Bu şekidle bu metodu çağıran yerlerin try catch e  alınması garantiye alınmış olur.

    //metodun çagrıldıgı yerde(main), metoda try catch uygulanmalıdır.

    public static  void SicaklikKontrol(int Sicaklik) throws IOException {
        if(Sicaklik<10)
            throw new IOException("Hava çok soguk.Dışarı cıkma");// checked olması için bu hata türü seçildi
        if(Sicaklik>10)
            throw new IOException("Hava güzel, piknık yapabilirsin."); // YANİ IOException u biz sectik.IO kısmı önemli.

    }



    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Hava Sıcaklıgı= ");
        int sicaklik=input.nextInt();

          try {
              SicaklikKontrol(sicaklik);// input tan aldığim sicaklik degeri, yani int.
          }
          catch(Exception ex)
        {
            System.out.println("ex = " + ex.getMessage()); // böylece sadece mesajı yazar. birde sadece ex yaz ve gör
        }

    }
}
