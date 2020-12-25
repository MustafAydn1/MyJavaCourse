package M3W4D3_G55_Abstract.Ornekler.Ornek2;

public class ShapesMain {
    public static void main(String[] args) {



        Rectangle dikdortgen=new Rectangle("dikdörtgen",4,5);
        Circle cember=new Circle("cember",6);
// eger constructor  içine  name leri eklemeseydik.mainde
//        dikdortgen.setName("dikdörtgen");
//        cember.setName("cember");
// şeklinde yazarak, isimlerini verirdik.




        System.out.println( dikdortgen.Area());
        System.out.println(dikdortgen.Perimeter());

        System.out.println(cember.Area());
        System.out.println(cember.Perimeter());

        System.out.println(dikdortgen.ciz());
        System.out.println(cember.ciz());


        System.out.println(dikdortgen);
        System.out.println(cember.toString2()); // toString2 de yapılan duzenlemelerden dolayı oldu.

        Rectangle dd=new Rectangle();
        System.out.println("BOŞ CONST. HİKAYESİ= "+dd);
// cıktıyı incele...

    }
}
