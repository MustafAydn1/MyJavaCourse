package M3W4D2_G54_Inheritance.Tasks.Task1;

import M3W2D4_G49_Inheritance.task3_staticKullanım.A;

import java.util.ArrayList;
import java.util.Arrays;

public class AotuGaleriMain {
    public static void main(String[] args) {

    TeslaCar tesla=new TeslaCar("Tesla p90",3000);
    ToyotaPrius toyota=new ToyotaPrius("Pirus",1600);
    Bus otobus=new Bus("302",6000);

    tesla.print();
    IElectric.autoPilot(); // cunku static oldugu için class adıyla aldık.

//Listeleyecegin elemanlar hangi class dan veya super class dan sa
//o class ın type ile yapacaksın.Burada ust class ları
// Vehicle  veya IVehicle oldugu için bunlarla olusturacagız.

        ArrayList<Vehicle > Araclar= new ArrayList<>();
        ArrayList<IVehicle > Araclar2= new ArrayList<>();
      //  ArrayList<Object > Araclar3= new ArrayList<>(); // yazabilirdin.

        Araclar.add(tesla);
        Araclar.add(toyota);
        Araclar.add(otobus);
        System.out.println(Araclar);

       for(Vehicle arac: Araclar){

           System.out.println("Aracların Class ı= "+arac.getClass().getSimpleName());
           System.out.println("SuperClass ı= "+arac.getClass().getSuperclass());

       }
}
}