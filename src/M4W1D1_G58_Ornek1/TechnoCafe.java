package M4W1D1_G58_Ornek1;

import java.util.ArrayList;
import java.util.Scanner;
// BUNU DETAYLI İNCELE COK GUZEL Bİ ORNEK..
public class TechnoCafe {
    public static void main(String[] args) {

        ArrayList<Food> siparis=new ArrayList<>();


         AdanaKebap adanaKebap=new AdanaKebap();
         Lahmacun lahmacun=new Lahmacun();
         Palov palov=new Palov();
        // Borsh borsh=new Borsh();


        System.out.println("***MENU***\n1-Borsh: \n2-Palov: \n3-Lahmacun: \n4-Adana Kebap: \n5-Tamam:");
        Scanner input=new Scanner(System.in);

      String Seciminiz = "";

    do {
        //     Seciminiz = input.nextLine();
        // System.out.println("***MENU***\n1-Borsh: \n2-Palov: \n3-Lahmacun: \n4-Adana Kebap: \n5-Tamam:");


        Seciminiz = input.nextLine();

        switch (Seciminiz) {
            case "Borsh":
                Borsh borsh=new Borsh();
                siparis.add(borsh);
                break;
            case "Palov":
                siparis.add(palov);
                break;
            case "Lahmacun":
                siparis.add(lahmacun);
                break;
            case "Adana Kebap":
                siparis.add(adanaKebap);
                break;
        }
    }
                while (!Seciminiz.equalsIgnoreCase("Tamam"));

      //  System.out.println(siparis); // bUnları add ile eklediğim halde neden direk cıktı alamadım.

        System.out.println("Alınan Siparişler\n");
        for(Food yemek:siparis)
            System.out.println(yemek.getClass().getSimpleName());


        double toplamUcret=0;
        for(Food yemek:siparis){

          TechnoKitchen.pisir(yemek); // technokıtcin neden static yaptık.
          toplamUcret+=yemek.ucret();// her yemek de ucret olussun diye ,BASKA????
        }

        System.out.println(toplamUcret);



            }
        }










