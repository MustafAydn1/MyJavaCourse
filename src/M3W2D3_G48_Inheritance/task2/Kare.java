package M3W2D3_G48_Inheritance.task2;

public class Kare extends Rectangle {

    public Kare(double uzunluk) {// yeni fields eklenmedi.rectangle yi kullandı.
        super(uzunluk, uzunluk);
//Constructor da değişiklik yapabilirsin. Ama alltaki
// superclassın parametrelerini azaltamazsın.(sanırım)?!!
//çünkü metodlarını kullanabilmek için gerekliler.
    }




    // ÇOK ÖNEMLİ....
//Kare de hiç metod tanımlamadık. Adını bile yazmadık.
//Mainde Kare nin getArea ve getCevre cagrıldıgında
// kendinde yoksa otomatik olarak üste cıkacak(Rectangle)
//Orada da yoksa bir uste,Shape cıkacak.

    //PEKİ BUNU NASIL YAPACAK...
//cONSTRUCTOR ı ona göre düzenledik. Oradan yapacak.

    @Override
    public String toString() {
        return "Kare{" +
                "Alan" + getArea() +
                "Cevre" + getCevre() + '}';
    }
 //TOsTRİNGE metodları yazdıgımız için,Main de cağırılınca direk
 //superclasın metodunu kullanıp sonucu yazacak.
}
