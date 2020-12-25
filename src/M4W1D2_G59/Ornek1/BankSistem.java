package M4W1D2_G59.Ornek1;

import java.util.Scanner;

public class BankSistem {
    public static void main(String[] args) {
        System.out.println("Hangi bankada hesap açmak istiyorsunuz...\n1-BOA\n2-ChaseBank\n3-WellsFargo");
/*
        BOA costumBOA=new BOA("Mustafa","12345","Bozyaka",1);
        ChaseBank costumChase=new ChaseBank("Ali","123456","Konak",1);
        WellsFargo costumWhellsFargo=new WellsFargo("Veli","1234567","Buca",1);
 */
        Scanner input = new Scanner(System.in);
        int Seciminiz1 = input.nextInt();

        Scanner inputBilgi = new Scanner(System.in);
        System.out.print("Adınız: ");
        String ad = inputBilgi.nextLine();

        System.out.print("Tel No: ");
        String Telno = inputBilgi.nextLine();

        System.out.print("Adersiniz: ");
        String adres = inputBilgi.nextLine();

        int employeeNo = 1; // calışanın sicilno. sbt...


/*ÇOK ÖNEMLİ BİR HADİSE...
bu kısım ile hesap olusturulabildi.AMA AŞAGIDA HESAP İŞLEMLERİ YAPABİLMEK İÇİN,
Bİ DUZENLEME YAPMAM GEREKİYORDU.Acılan hesabı heryerde görebilmem lazım.
Bankalar üstü bir referans kullanayım ki,ortak bir ad vereyim.
BUNUN İÇİN polimorfizm i KULLANDIK.
Bank hesabınBankası=new BOA(); şeklinde...
bunu da heryerde görebilmesi için önce Bank hesabinbankasi; üstte diye tanımladık.
önce buradaki switch de sonra da aşagıdakinde kullandık...


        switch (Seciminiz1) {
            case 1:
                BOA costumBOA = new BOA(ad, Telno, adres, employeeNo);
                costumBOA.openAccount();
                break;

            case 2:
                ChaseBank costumChase = new ChaseBank(ad, Telno, adres, employeeNo);

                costumChase.openAccount();
                break;


            case 3:
                WellsFargo costumWhellsFargo = new WellsFargo(ad, Telno, adres, employeeNo);

                costumWhellsFargo.openAccount();
                break;
        }
 */

        Bank hesabinBankasi=null; // !!!! bunu yapmazsam aşagıda sıkıntı veriyor. initilaze et diyor.null u sil,bak.
//NEDEN null ATADIK.nesne oldugu için. dedi hoca... String le alakalı değil yanı,sanırım.

        switch (Seciminiz1) {
            case 1:
                hesabinBankasi= new BOA(ad, Telno, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;

            case 2:
                hesabinBankasi= new ChaseBank(ad, Telno, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;


            case 3:
                hesabinBankasi = new WellsFargo(ad, Telno, adres, employeeNo);
                hesabinBankasi.openAccount();
                break;
        }




        System.out.println("HANGİ İŞLEMİ YAPMAK İSTERSİNİZ:\n1-deposit\n2-withdraw\n3-loan\n4-Balance" +
                "\n5-Hesap Kapatma\n6-Çıkış");
//bu kısmı donguye koyarsan her seferinde cağırır. bence gerek yok.

        int secim = 0;
        do {


            secim = input.nextInt(); // aynı Scanner ile ikinci farklı giris adı. usttekinden farklı..!!

            double miktar=0.0;
            switch (secim) {
                case 1:
                    System.out.println("Para Yatırmak için Miktar Giriniz: ");
                    miktar=input.nextDouble();
                    hesabinBankasi.deposit(miktar);
                    break;

                case 2:
                    System.out.println("Para Cekmek için Miktar giriniz: ");
                    miktar=input.nextDouble();
                    hesabinBankasi.withdraw(miktar); break;


                case 3:
                    System.out.println("Kredi çekmek istediğiniz miktarı Yazınız: ");
                    miktar=input.nextDouble();
                    System.out.println( hesabinBankasi.loan()); break;

                case 4:
                    System.out.println("Bakiyeniz: "+hesabinBankasi.getBalance()); break;


                case 5:
                    hesabinBankasi.closeAccount(); break;


            }


        } while (secim!=6);
    }
}
//extra yapılacaklar: HESABINDA PARA VARSA TAMANINI CEKTİRİP HESABI KAPATMA..
// HER CEKİM VE YATIRIMDA BAKİYE GÖRUNTULEME...
//YETERLİ PARA YOKSA - 1500 TL Yİ AŞAN CEKİMDE- CEVAP YAZMA..  vb.
//bunları da ekle sen calışşşşşş.




/*
3- BankSistem classındaki main de kullanıcıya hangi bankada hesap açmak istediğini soralım
   bir menü ile.
    İlgili bankada hesap açtıktan sonra , yine bir menü ile para yatırıp , çeksin,
   işlemi tamamlamak istediğinde (çıkış seçeneği ile) , son bakiyesini ekrana yazalım.


    String withdraw(double gidenPara)
   String deposit(double gelenPara)
   String loan
 */