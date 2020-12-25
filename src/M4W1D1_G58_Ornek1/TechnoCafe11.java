package M4W1D1_G58_Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

// BU  SORUYU SADEE WHİE KULLANARAK ÇÖÖÖÖZZZZZZ.

public class TechnoCafe11 {
    public static void main(String[] args) {
        ArrayList<Food> siparis=new ArrayList<>();


        AdanaKebap adanaKebap=new AdanaKebap();
        Lahmacun lahmacun=new Lahmacun();
        Palov palov=new Palov();
        Borsh borsh=new Borsh();


        System.out.println("***MENU***\n1-Borsh: \n2-Palov: \n3-Lahmacun: \n4-Adana Kebap: \n5-Tamam:");
        Scanner input=new Scanner(System.in);
        System.out.println("Yemeklerinizi Seçiniz...");

       int Seciminiz=input.nextInt();

        while (Seciminiz==5){

        Seciminiz=input.nextInt();

        switch (Seciminiz) {
            case 1:
                siparis.add(borsh); break;

            case 2:
                siparis.add(palov);break;

            case 3:
                siparis.add(lahmacun);

            case 4:
                siparis.add(adanaKebap);


        }}
    }
}
