package M3W3D4_G51_final_Polymorphism.finalClass;

public final class Tasit {
 private String model;

    public Tasit(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
