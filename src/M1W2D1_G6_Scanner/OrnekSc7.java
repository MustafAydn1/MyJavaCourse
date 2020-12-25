package M1W2D1_G6_Scanner;

import java.util.Scanner;

public class OrnekSc7 {
    public static void main(String[] args) {
        // Kullanıcıdan username(string), password(int) ve gizli soruyu(cümle) alıp ekrana yazdırınıZ.
        // cözumun altında cccookk uzun  bişeyler var incele...

        Scanner input=new Scanner(System.in);

        System.out.print("Username Giriniz= ");
        String name=input.nextLine();

        System.out.print("Password Giriniz= ");
        int secret=input.nextInt();

        String dummyCode=input.nextLine();
      //  Scanner input2= new Scanner(System.in);
        System.out.print("Gizli Soru= ");
        String gizli=input.nextLine();

        System.out.println("Username= "+name+"\nPassword= "+secret+"\nGizli Sorunuz= "+gizli);













     /*  Scanner input=new Scanner(System.in);

        System.out.print("Username= ");
        String name=input.next();

        System.out.print("Gizli Soru= ");
        String gizlisoru=input.nextLine();

        Scanner input2= new Scanner(System.in);
        System.out.print("Password=");
        int password=input.nextInt();


        System.out.println("Name= "+name+"\nPassword= "+password+"\ngizli soru="+gizlisoru);

KONSUL A GELEN EKRAN BÖYLE OLUYOR...
Username= ali,
Gizli Soru= Password=

*/

   /* Scanner input=new Scanner(System.in);

        System.out.print("Username= ");
        String name=input.next();


        Scanner input2= new Scanner(System.in);
        System.out.print("Password=");
        int password=input.nextInt();

        System.out.print("Gizli Soru= ");
        String gizlisoru=input.nextLine();

        System.out.println("Name= "+name+"\nPassword= "+password+"\ngizli soru="+gizlisoru);

KONSUL E GELEN NEDEN BÖYLE OLDU.


Username= ALİ
Password=1234
Gizli Soru= Name= ALİ
Password= 1234
gizli soru=
     */
//BURADA BİR ACIKLAMA VAR. https://mobile.donanimhaber.com/java-scanner-sinifi-problemi--129121754   DAN ALINAN...
/*
Kullanıcıdan id alırken “login_id.input.Next()” kullandığımda program evet sorunsuz çalışıyor fakat “login_id.input.NextLine”
 kullandığımda o satırı es geçiyor ben ise tüm satırı almak istediğim için “input.NextLine” ile bu programı yapmak istiyorum.
KOD
public  static void main (String args[])
     { Scanner input = new Scanner(System.in);
         Scanner input2 = new Scanner(System.in);



             String id,login_id;
             int pass,login_pass;
 /*KAYIT*/
       /* System.out.println("Kullanıcı Adınız");
        id = input.next();
        System.out.println("Şifreniz");
        pass = input.nextInt();
        /*System.out.println("Hoşgeldiniz "+" Lütfen Giriş Yapınız.");*/
        /*LOGIN*/
       /* System.out.println("Kullanıcı Adınız");
        login_id = input.next();
        System.out.println("Şifreniz");
        login_pass = input.nextInt();



        if (login_pass == pass && login_id.equals(id) == true)
            System.out.println("Giriş Başarılı");
        if (login_pass != pass || login_id.equals(id) == false)
            System.out.println("giriş başarısız!");
        */
/*
nextLine() metodu input bufferı /n karakterini görene kadar okur.
/n karakterine gelince son olarak bu karakteri de okur ve okunan karakterleri return eder.

nextInt() metodu da aynı şekilde okur fakat tek farkı /n karakterini okumaz. Bufferda bırakır.

Bu yüzden nextInt() uyguladıktan sonra bufferda bir /n karakteri kalır ve nextLine() ile sıradaki satırı okumak istediğinde direk bufferdaki /n karakteri görülür ve okuma yapılmaz.

Örnek:

Buffer: burak/n123/n


İlk nextLine(), burak/n okur.

Buffer: 123/n kalır

sonra nextInt(), 123 okur.

Buffer: /n kalır.

Bufferda karakter olduğu için program input beklemez, buffer okumaya devam eder.

İkinci nextLine() sonda kalan /n karakterini okur.

Son olarak 2. nextInt()'e geldiğinde buffer boş olduğu program için input bekler.


Bu sorunu çözmek için, sayı okunduktan sonra bufferda kalan /n karakterini silmen gerekir. Bunun için de her nextInt() metodundan sonra nextLine() uygulayarak /n karakterini bufferdan okutup silebilirsin.


System.out.println("Şifreniz");
pass = input.nextInt();
input.nextLine(); // Ekle

Veya daha doğru bir çözüm yolu şöyle olur; bütün inputlarını nextLine() ile oku, daha sonra ihtiyacın olan yerlerde integer, veya double neye çevireceksen çevirebilirsin.


Bu arada ikinci bir Scanner objesine (input2) ihtiyacın yok.
*/



    }
}








