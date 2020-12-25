package M2W3D1_G31_CLASS;

// ikinci yöntem...

public class Personel {// burada   direk class ın ismini verdik. Ayrıca acmadık bu yuzden..
    int id;           // personel clasında neler olacagı belirlendi... tasarlandı. ama olusmadı...
    String name;
    String surName;

    public static void main(String[] args) {

        Personel mudur=new Personel(); // nesneye dönustu. ve özellikleri yazılıyor...
        mudur.id=1;
        mudur.name="Mehmet";
        mudur.surName="Yılmaz";

        System.out.println("mudur.surName = " + mudur.surName);
        System.out.println("mudur.name = " + mudur.name);
        System.out.println("mudur.id = " + mudur.id);


    }
}
