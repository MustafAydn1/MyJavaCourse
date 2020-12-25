package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class ODEV2 {
    public static void main(String[] args) {
        //  2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız


        Scanner input = new Scanner(System.in);
        System.out.print("üç basamaklı bir sayı giriniz: ");
        int sayi = input.nextInt();
        //123

        int birler = (sayi % 10);
        int onlar = (sayi / 10) % 10;
        int yüzler=(sayi/100);


        switch (yüzler) {

            case 1:
                System.out.print("yüz");
                break;
            case 2:
                System.out.print("ikiyüz");
                break;
            case 3:
                System.out.print("üçyüz");
                break;
            case 4:
                System.out.print("dörtyüz");
                break;
            case 5:
                System.out.print("beşyüz");
                break;
            case 6:
                System.out.print("altıyüz");
                break;
            case 7:
                System.out.print("yediyüz");
                break;
            case 8:
                System.out.print("sekizyüz");
                break;
            case 9:
                System.out.print("dokuzyüz");
                break;


        }


        switch (onlar) {

            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;

        }


            switch (birler) {

                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }



    }


}




