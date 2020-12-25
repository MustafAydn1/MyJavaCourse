package M3W3D4_G51_final_Polymorphism.Polymorphism.Ornek1;

public class Kedi extends Hayvan{
    public Kedi(String name) {
        super(name);
    }


    @Override
    public void ses() {
        System.out.println(getName()+" miyavladı");
    }
}
