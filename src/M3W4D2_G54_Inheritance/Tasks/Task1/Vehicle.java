package M3W4D2_G54_Inheritance.Tasks.Task1;

public class Vehicle {
   private String model;
   private double engine; //motor

    public Vehicle(String model, double engine) {
        setModel(model);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

//mor renkli degişkenler veya veriler,AKTIF olanlar demektir.
//BURADA model ve engine her yerde mor. bunu farket.