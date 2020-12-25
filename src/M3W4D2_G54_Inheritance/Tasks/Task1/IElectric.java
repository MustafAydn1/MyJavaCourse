package M3W4D2_G54_Inheritance.Tasks.Task1;


//bir interface i başka  bir interface den miras aldık. yanı extends ettik.
//bir interface i başka  bir interface den extends ile alırız.
// implement ile alınmadı.alınamaz...
//interface de fields olmaz ama final-static fields eklenebiliyordu.ekledik.
//interface_G53 sunumunu OKUUUUU...

public interface IElectric extends IVehicle{
    final  static  int batterylife=100;

    String changeBattery();

    //IElectric i implemen edenlerin hepsi üstteki metodun içini dolduracak


//İNTERFACE DE  gövdeli metod olmaz. Ama SADECE default ve static erişimleri ile olur.

    default void print(){
        System.out.println("Interface de KOD GÖVDESİ YAZMA İZNİ: default  access modifiersi ile metodlar interface govdeli " +
                "yani kod bloguyla birlikte yazılabilir.");
    }

    static void  autoPilot(){

        System.out.println("Interface de KOD GÖVDESİ YAZMA İZNİ: static ile yapılan metodlarında interface de" +
                " kod blogu yazılabiliyor..");
    }

}
