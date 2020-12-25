package M2W4D3_G38_StaticFinal.nonAccesModifiers.example;

import java.util.ArrayList;

public class Ex1 {
     static final String  name="Maximilian";

 static  ArrayList<String> list= new ArrayList<>(); // önce basında static yoktu.

    public static void main(String[] args) {

      // list.add();  kızardı. çünkü... Arraylistin başında da static olmalıdır. Acıklama en altta..

        list.add("Ali");
        list.add("veli");

        list.remove("Ali");
        System.out.println("önceki list  = " + list.toString());

       // list =new ArrayList<>();  // clear görevini yaptı. birde basına final ekle gör..
//final oldugunda eklemeye-cıkatmaya izin var.yeniden olusturmaya izin yok.Map ve set içinde böyle.

        System.out.println("sonraki list  = " + list.toString());






        System.out.println("Replace= "+ name.replace("i","o"));//name  neden kırmızı oldu.
        //final String name static olmalı... çünkü en altta acıklandı...
        // sonuc: Replace= Maxomoloan olur.
        // ama burada name in degerini bişeye atamadık.sadece name değiştirdik..
        System.out.println("ilk name = " + name);

     //name=name.replace("i","o"); // yıne kızarır. izin vermez.çünkü bu sefer atama yapıyorsun!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("ikinci name = " + name);
    }

//Anladım hocam yani main içine yazacağımız her şeyin static özellik göstermesi gerekmekte,
 //ya class içinde static yazılacak ya da main içinde new kullanılacak.
//*************************************
    //  Static bir metodun içinde, metodun dışından kullanacağınız herşey
    //  static veya new ile yeni oluşturulmuş olmalı.
    // Sebebi: Static bir canlı bir yapı olduğundan,
    //  içinde kullanılanlarda o anda erişilebilir canlı yani
    // static olomalı.
//************************

}
