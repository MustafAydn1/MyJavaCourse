package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek1;

public class Kopek extends Hayvan {

    public Kopek(String name) {

        super(name);
    }

    @Override
    public void ses() {
        System.out.println(getName()+ " havladı");
    }
    public void kokladi(){
        System.out.println(getName()+" kokladı");
    }
}
