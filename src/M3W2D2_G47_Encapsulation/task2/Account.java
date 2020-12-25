package M3W2D2_G47_Encapsulation.task2;

public class Account {
// musteri no otomatik atanacaktır.kimseye bırakılmaz.

    int accountNumber; //müşteri hesap no
    private double balance; //bakiye

    private static int Number=1;// otomatik verilecek sayı
//önce müşteri tanımlanacak. sonra para işlemleri başlayacak.
// güvenlik için bu şart. yatan her para dekonta tabi olacak.
// bu yuzden setleri bile oluşturulmadı.sadece getler oluştu.

    public Account() {// constructor un parametresi bile yok.
//para(balance) ortada hiç yok. kayıttan sonra...
        this.accountNumber=Number++;
    }

    public void deposit (double gelenpara)
    {

        this.balance+=gelenpara;
    }

    public void withdraw(double gidenpara)
    {
        if(gidenpara>5000)
            throw new RuntimeException("Günlük Limiti Aştınız... Bakiyeniz: "+ getBalance());

        if(gidenpara>this.balance)
            throw new RuntimeException("Yetersiz Bakiye.. BAKİYENİZ: "+getBalance());

        this.balance-=gidenpara;
    }

    // bu ikisinin de seti yok.sadece get.
public double getBalance()
{

    return balance;
}
    public int getAccountNumber()
    {

        return accountNumber;
    }



}
