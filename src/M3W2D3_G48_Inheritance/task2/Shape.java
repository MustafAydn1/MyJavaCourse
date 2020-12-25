package M3W2D3_G48_Inheritance.task2;
// 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
//Shape
//  Circle (bu türün alan hesaplaması yok)
//  Rectangle
//      Square

// 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
// 3- Her bir sınıfa consructor ekleyiniz.
// 4- Her metodun toStringini override yapınız.
// 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
// 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
// 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hta mesajı ürettiriniz.
public class Shape {

// bence bu örnegin sadece dikdortgen kare kısmı inheritance ye uygundur.
//superclassa konstraktır kurmadık ki subclasslar da kendi özelliklerinde kuralım.
    @Override
    public String toString() {
        return "Bilgi Yok";
    }

// kendi clasında  bu metodu bulamayan sub class
//yukarı doğru superclass akadar gelir. bunu yazdırır.
    public double getArea(){

       throw new RuntimeException("BU Sınıfın Bu metod özelliği Yoktur.");
    }

    public  double getCevre(){
       throw new RuntimeException("Bu sınıfa bu metoda implemente(entegre) edilmemiştir.");
    }




}
