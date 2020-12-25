package M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex4;

import M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex1.Aylar;

public class Ex4Main {
    public static void main(String[] args) {



    Months ay=Months.MART;
        // atama anında constructer gibi
        // çalışan bölüm : Months(int gunMiktari)
        // gun miktarını dayse set ediyor.

        ay.getGunMiktari();
        System.out.println("ay.days = " + ay.days);
        System.out.println("Mart ayı hava durumu: "+ ay.havaDurumu);
        System.out.println("Mart ayı gun sayısı ve hava durumu: "+ay.days+" - "+ay.havaDurumu);
    /*
    enum içindeki metodlardan dolayı burasına gerek kalmadı

    switch (ay){

        case OCAK:
            System.out.println("31");
            break;
        case SUBAT:
            System.out.println("28");
            break;

        case MART:
            System.out.println("31");
            break;

    }
*/
    }
}
