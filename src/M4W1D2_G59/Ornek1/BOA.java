package M4W1D2_G59.Ornek1;

public class BOA extends Bank {


    public BOA(String name, String phoneNumber, String address, int numEmployee) {
        super(name, phoneNumber, address, numEmployee);
    }

    @Override
    void openAccount() {
        System.out.println("Adınız ve Hesap Bilgileriniz alındı..");
        System.out.println(this.getClass().getSimpleName()+" Hesap Açılışınız Yapıldı...");

    }

    @Override
    void closeAccount() {
        System.out.println("Hesabınızı kapatmamak için size her zorlugu çıkaracagız....");
        System.out.println(this.getClass().getSimpleName()+ " Hesabınız 3 ay içinde kapatılacak....");
    }
}





/*
 void openAccount  (imza, kimlik)
   void closeAccount  (imza , kimlik, hesap kontrol)
 */