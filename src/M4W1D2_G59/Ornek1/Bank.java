package M4W1D2_G59.Ornek1;
// BU SORUYU KENDİM ÇÖZEMEDİM... İNCELE VE GELİŞTİREREK KENDİN ÇÖZ.
public abstract class Bank {

    private String name;
    private String phoneNumber;
    private String address;
    private int numEmployee;
    private double balance;

    public Bank(String name, String phoneNumber, String address, int numEmployee) {
        setAddress(address);
        setName(name);
        setNumEmployee(numEmployee);
        setPhoneNumber(phoneNumber);

    }


    abstract void openAccount();

    abstract void closeAccount();



    String withdraw(double gidenPara){ //para çekme
        this.balance-=gidenPara;
        return gidenPara+ " tl para gönderildi";
    }


    String deposit(double gelenPara){ //para  yatırma
        this.balance+=gelenPara;
        return gelenPara+" tl hesabınıza eklendi";
    }

    //String loan();     // kredi // ÖNEMLİ NOT: Abstract class da gövdesiz metod sadece abstrac olan metodlar içindir
                        // abstract olmayanlar için gövde olmak zorundadır...


    String loan(){

        return "Bu miktarı Kredi Olarak Çekilebilir...";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", numEmployee=" + numEmployee +
                ", balance=" + balance +
                '}';
    }


    //  public void setBalance(double balance) { // bu olmamalı ki usulsuzluk olmasın...
  //      this.balance = balance;
 //   }



    //abstract class oldugu için metodlara public yazmasak bile,metodları public olarak algılıyor...
    //yazmaya gerek kalmıyor.
}

