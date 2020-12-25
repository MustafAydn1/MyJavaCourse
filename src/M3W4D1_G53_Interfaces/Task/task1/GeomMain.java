package M3W4D1_G53_Interfaces.Task.task1;

import M3W2D3_G48_Inheritance.task2.Kare;

public class GeomMain {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();


        System.out.println(rectangle.Area(4,3));
        System.out.println( rectangle.Perimeter(4,5));
/*Hoca constructor oluşturmamıstı. ben olusturdum,ama pek işe yaramadı
metodda da istiyor ve onu kullanıyor.
Hatta aynı nesneye farklı degerler girdim. yıne kabul etti.???????
//CEVAP: BUNLAR CONST. dan gelmiyor. metoddan geliyor.const.lar yorum da.:)
 */

        System.out.println("cember alan= "+circle.Area(4));
        System.out.println("cember cevre= "+circle.Perimeter(5));



       Square square=new Square();
        System.out.println("kare alan "+ square.Area(4));
        System.out.println("kare cevre: "+square.Perimeter(3,3));
        // metodları Rectangleden miras aldıgı için 2(kez) deger girmeliyim
// aynı nesneye farklı degerler girdim. yıne kabul etti.???????

//AYRICA: Square de tek deger yollayarak bunu nasıl cözerim.
//Rectangel nin metodlarına if koşulu ekleyerek.
//Area ya ekleyeyim.Primeter eski gibi kalsın ki ilk halını de bileyım.
//inanmıyorsan Primeter i tek e indir. hatayı gör.


    }
}
