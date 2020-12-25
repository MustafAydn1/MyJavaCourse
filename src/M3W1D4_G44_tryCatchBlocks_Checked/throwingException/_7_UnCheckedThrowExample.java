package M3W1D4_G44_tryCatchBlocks_Checked.throwingException;

import java.util.Scanner;

public class _7_UnCheckedThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz=");
        String username=oku.nextLine();

        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, pratik kullanım sağlıyoruz.
        //YANİ TEK try ve TEK catch BOLGU İLE  iş halloluyor...
        // throw new Exception(" ") a yazılan mesajlar.
        //catch blogundaki prıntln(ex) ile hata durumları cekilip yazılır.
        //BENCE BU COK DAHA KULLANIŞLI..BİR SÜRÜ CATCH OLUŞTURMAKTANSA..
        //çünkü hangi hatayı veriyorsa onu yazdırıyor.

        try {
            if(username.length()<6)
              throw new Exception("Username 6 dan küçük olamaz");

            if(username.length()>10)
                throw new Exception("Username 10 dan buyuk olamaz");

        }
        catch (Exception ex)
        {
            System.out.println("ex = " + ex);

        }





    }
}
