package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek1;

public class Hayvan {
     private String name;

    public Hayvan(String name) {
      this.name=name;
    }

    public void  ses(){

        System.out.println("ses cıkardı");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 /*
    public static void HayvanSesi(Hayvan hayvan){
        hayvan.ses();
    }
    // buraya aldım ama sorun verdi. bunun uzerine düşün calış. cöz.
  */
}
