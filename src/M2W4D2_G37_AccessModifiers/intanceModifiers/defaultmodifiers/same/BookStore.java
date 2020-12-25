package M2W4D2_G37_AccessModifiers.intanceModifiers.defaultmodifiers.same;

public class BookStore {
    public static void main(String[] args) {

  // Aynı pakette oldugu için  defaulta ulastık.
        //bunun default oldugunu içinde parametre yok. oradan bildik
    Book kitap1=new Book();
    kitap1.name="Lord of the Rings";
// aynı pakette old. için Contructors ve fields e ulaştık.




    Book kitap2= new Book("Kar");
    // public oldugunu  parametreli yaparak anladık...
    }

}
