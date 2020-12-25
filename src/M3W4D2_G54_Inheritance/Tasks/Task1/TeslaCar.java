package M3W4D2_G54_Inheritance.Tasks.Task1;

//önce extends ---->>> sonra implement yapılacak.sırası bu...
//IElectric, IVehicle den extends ile miras aldıgından
//IVechile deki drive metodunu yazdırdı,otomatik.
//IElectric ten de changeBattery aldı.İÇLERİNİ SEN Class doldurcan.
//Vehicle den de extends olunca constructor istedi.yapıldı.
public class TeslaCar extends  Vehicle implements IElectric{


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "2 Yılda bir batarya değiştir...";
    }
//return olarak direk strıng de yazılır." ... "
    @Override
    public String drive() {
        return "AutoPilot a çok güvenme sakın...";
    }
}
