package M2W2D4_G29_Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        
        Map<String,String> userMap= new HashMap<>();
        
        userMap.put("name","Ahmet Zan");
        userMap.put("email","ahmet@hotmail.com");
        userMap.put("adres","Şişli/İstanbul");
        userMap.put("MobilTel","0530 345 6789");

        System.out.println("usermap.get(name): "+ userMap.get("name") ); // burada key "name" oldugu iççin
        System.out.println("userMap.get(\"adres\") = " + userMap.get("adres"));

        Map<String,String> userMap2=new HashMap<>();

        userMap2.put("name","Ayşe Yılmaz");
        userMap2.put("email","ayşe@hotmail.com");
        userMap2.put("adres","Pendik/İstanbul");
        userMap2.put("MobilTel","0530 123 45 67");

        System.out.println("userMap2.get(\"name\") = " + userMap2.get("name"));
        System.out.println("userMap2.get(\"MobilTel\") = " + userMap2.get("MobilTeel"));// key i yanliş girersen null verir.
        System.out.println("userMap2.get(\"MobilTel\") = " + userMap2.get("MobilTel"));

        System.out.println("*******************************");
        // Ahmet ve Ayşe nın bilgilerini kartvizit gibi beraber görmek istiyorsam, içiçe Map yapmaliyım.
        // ilk String,Ayşe yada Ahmet olacak.Map<String,String> de herbirini bilgileri olacak...

        Map<String,Map<String,String>> kartvizitler=new HashMap<>(); // bu boş bir kartvizit cüzdani halinde...

        kartvizitler.put("Ahmet",userMap); // cüzdanın bölümlerine kartvizit koymaya başladım
        kartvizitler.put("Ayşe",userMap2); // istediğin isim   key(istediğin ismi ver),tanımlı Map i value yapıp...

        System.out.println("kartvizitler = " + kartvizitler);


        System.out.println("kartvizitler.get(\"Ahmet\") = " + kartvizitler.get("Ahmet"));
        System.out.println("kartvizitler.get(\"Ayşe\") = " + kartvizitler.get("Ayşe"));

        System.out.println("************************************");

        System.out.println("kartvizitler.get(\"Ahmet\").get(\"email\") = " + kartvizitler.get("Ahmet").get("email"));
        System.out.println("kartvizitler.get(\"Ayşe\").get(\"email\") = " + kartvizitler.get("Ayşe").get("email"));

        String ahmetAdersi=kartvizitler.get("Ahmet").get("adres");
        System.out.println("ahmetAdresi = " + ahmetAdersi);











       // yanliş yapalım... kartvizite ne isim verirsen. onu cagırır. Adı önemli degil..
       // kartvizitler.put("Mehmet",userMap);
        //System.out.println(kartvizitler.get("Mehmet").get("name"));






    }
}
