package M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex2;

public class Ex2Main {
    public static void main(String[] args) {
        //        User kullanici=new User();
//        kullanici.name="Alperen";
//        kullanici.Role=1;
//        kullanici.Status=2;
//
//        User kullanici2=new User();
//        kullanici.name="Çiğdem";
//        kullanici.Role=1;
//        kullanici.Status=1;

        User kul1= new User();
        kul1.name="Ali";
        kul1.yetkisi=Role.ADMIN;
        kul1.durumu=Status.ACTIVE;

        User Esra=new User();

        Esra.name="Esra";
        Esra.yetkisi=Role.CUSTOMER;
        Esra.durumu=Status.INACTIVE;



if(Esra.durumu==Status.INACTIVE){

    // silme işlemi yap...
}





        // Önceden belli olan sabit verilerin
        // atanmasındaki anlama zorluğu yerine
        // bu değerlerin karşılıkları ENUM ile
        // tanımlanarak , atama değeri için kullanılrlar.
        // Bu durum yazma ve anlama kolaylığı sağlar.

    }

    //enumlar başında static olamadan
    //digerlerinde, new de kullanmadan
    // kullanılır çünkü???
    //bunlar deger alması gereken degişken degil.

}
