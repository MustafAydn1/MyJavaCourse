package M3W4D2_G54_Inheritance.Tasks.Task1;
//VEHİCLE den extends oldu.... IElectric ve IGas dan implement.
//yazılımı ve sırası aynen böyle.önce extends,
//sonra 1 tane implements yazılır, sonra interfaceler class adlarını yaz.
//ToyotaPrius extends Vehicle implements IElectric,IGas

public class ToyotaPrius extends Vehicle implements IElectric,IGas {

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }
//  Vehicle dan  const. ı aldı...

    @Override
    public String changeBattery() {
        return "Batarya nın ömru kısadır.";
    }

//IElestric den changeBattery  soyut met. aldı

    @Override
    public String changeOil() {
        return "Depoyu boş bırakma";
    }

//IGaz dan changeOil soyut met. aldı.

    @Override
    public String drive() {
        return "Benzın de misin Elektrik te mi farkında ol";
    }
}
// IElectric ve IGas, IVehicle dan extends oldugu için, ve de
//ToyotaPirus bunlardan implements old. için otomatik olarak,
//drive(); soyut metodu geldi.

// Bu cost. ve 3 soyut metodun yapılması zorunludur.