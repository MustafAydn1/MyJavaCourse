package M1W3D3_G12_Nestedif_switch;



import java.util.Scanner;

public class ODEV1 {
    public static void main(String[] args) {
     //   1- Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.

       // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        //Scanner input=new Scanner(System.in);
        //System.out.print("BUGÜN HANGİ GÜN: ");
       // String gün=input.nextLine();

      int gün=(100%7);

        switch (gün) {
            case 0: System.out.println("100 gün sonrası çarşamba dır"); break;
            case 1: System.out.println("100 gün sonrası perşembe dır"); break;
            case 2: System.out.println("100 gün sonrası cuma dır"); break;
            case 3: System.out.println("100 gün sonrası c.ertesi dır"); break;
            case 4: System.out.println("100 gün sonrası pazar dır"); break;
            case 5: System.out.println("100 gün sonrası pazartesi dır"); break;
            case 6: System.out.println("100 gün sonrası salı dır"); break;
            default:
                System.out.println("hatalı giriş");

                /*
                acaba kullanicidan bugünü isteyip ona gore 100 gun sonrasini mi bulsak
   Scanner oku = new Scanner(System.in);
        System.out.print("Gün giriniz=");
        String gun = oku.nextLine();
        int sayi=10;

        switch (gun.toLowerCase()) {
            case "pazartesi": sayi = 1;break;
            case "salı": sayi = 2;break;
            case "çarşamba": sayi = 3;break;
            case "perşembe": sayi = 4;break;
            case "cuma": sayi = 5;break;
            case "cumartesi": sayi = 6;break;
            case "pazar": sayi = 0;break;
            default:
        }
        int gun01 = (sayi + 100) % 7;
        switch (gun01) {
            case 1: System.out.println("Yüz gün sonra pazartesi");break;
            case 2: System.out.println("Yüz gün sonra salı");break;
            case 3: System.out.println("Yüz gün sonra çarşamba");break;
            case 4: System.out.println("Yüz gün sonra perşembe");break;
            case 5: System.out.println("Yüz gün sonra cuma");break;
            case 6: System.out.println("Yüz gün sonra cumartesi");break;
            case 0: System.out.println("Yüz gün sonra pazar");break;
            default:
                System.out.println("olmadı");
        }

****************************************************************

       Scanner sc = new Scanner(System.in);
        System.out.println("Pazartesi= 1.Gün\nSali= 2.Gün\nCarsamba= 3.Gün\nPersembe= 4.Gün\nCuma= 5.Gün\nCumartesi= 6.Gün\nPazar= 7.Gün");
        System.out.print("Bulundugunuz gün kacinci günse lütfen giriniz= ");
        int gun = sc.nextInt();
        int artikgun = 100 % 7;
        int gunhesap=gun+artikgun;

        switch (gunhesap) {


            case 3:
                System.out.println("Yüz gün sonra bugun= Carsamba");
                break;
            case 4:
                System.out.println("Yüz gün sonra bugun= Persembe");
                break;
            case 5:
                System.out.println("Yüz gün sonra bugun= Cuma");
                break;
            case 6:
                System.out.println("Yüz gün sonra bugun= C.tesi");
                break;
            case 7:
                System.out.println("Yüz gün sonra bugun= Pazar");
                break;


        }if (gunhesap==8) {
            System.out.println("Yüz gün sonra bugun= Pazartesi");
        }else if(gunhesap==9){
            System.out.println("Yüz gün sonra bugun= Sali");
        }

    }








                 */


        }

    }
}
