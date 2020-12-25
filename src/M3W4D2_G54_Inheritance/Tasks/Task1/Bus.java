package M3W4D2_G54_Inheritance.Tasks.Task1;

public class Bus extends Vehicle implements IDiesel {
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Yolcu Varken Akaryakıt Alma...";
    }

    @Override
    public String drive() {
        return "Uykulu iken yola Çıkma";
    }
}
