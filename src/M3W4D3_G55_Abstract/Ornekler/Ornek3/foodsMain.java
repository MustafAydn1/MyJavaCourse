package M3W4D3_G55_Abstract.Ornekler.Ornek3;

public class foodsMain {
    public static void main(String[] args) {

        SezarSalad SS = new SezarSalad();

        System.out.println(SS.taste());
        System.out.println(SS.madeIn());
        SS.setName("Roma Salatası"); // const.oluşturmadık. ama ismi setName ile alacaz...önemli.
        System.out.println(SS);     // setName ile ismi alınca toString ile aldık.
        System.out.println("***************************************************");

        GreekSalad GS= new GreekSalad();

        System.out.println(GS.taste());
        System.out.println(GS.madeIn());
        GS.setName("Atina Yeşilliği");
        System.out.println(GS);

        System.out.println("****************************************************");
        Baklava Antep=new Baklava();
        System.out.println(Antep.taste());
        System.out.println(Antep.madeIn());
        Antep.setName("Fıstıklı");
        System.out.println(Antep);


        System.out.println("*******************************************************");
        CheeseCake CC=new CheeseCake();
        System.out.println(CC.taste());
        System.out.println(CC.madeIn());
        CC.setName("Hoşmerim");
        System.out.println(CC);



    }
}
