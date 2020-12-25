package M1W3D3_G12_Nestedif_switch;

import java.util.Scanner;

public class switch3 {
    public static void main(String[] args) {

        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.print("Ay No =");
        int ayNo= input.nextInt();

//        switch (ayNo)
//        {
//            case 1:   System.out.println("31");break;
//            case 2 :  System.out.println("28"); break;
//            case 3 :  System.out.println("31"); break;
//            case 4 :  System.out.println("30"); break;
//            case 5 :  System.out.println("31"); break;
//            case 6 :  System.out.println("30"); break;
//            case 7 :  System.out.println("31"); break;
//            case 8 :  System.out.println("31"); break;
//            case 9 :  System.out.println("30"); break;
//            case 10 :  System.out.println("31"); break;
//            case 11 :  System.out.println("30"); break;
//            case 12 :  System.out.println("31"); break;
//            default: System.out.println("Hatalı no");
//        }

        switch (ayNo)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31"); break; // case in karşısında bişey bulamayınca buraya kadar iner. yazar.
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("30"); break; // aynı şekilde herhangibirinden buraya kadar iner.
            case 2:
                System.out.print("yıl =");
                int yil= input.nextInt();
                if (yil%4==0)
                    System.out.println("29");
                else
                    System.out.println("28");
                break;

            default: System.out.println("Hatalı no");
    // case lerin içine if koşulu yazılabilir.  devam edilir.. sonuna  break eklenir... defalt u unutma...



        }







    }
}
