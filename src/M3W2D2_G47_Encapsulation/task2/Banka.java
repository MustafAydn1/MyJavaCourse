package M3W2D2_G47_Encapsulation.task2;
// 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
// 2- bir consructor ekleyiniz.
// 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
// 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
// 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
// 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
public class Banka {
    public static void main(String[] args) {

        Account account1 = new Account();

      try {

          account1.deposit(1000);
          System.out.println("account1.getBalance() = " + account1.getBalance());

          account1.withdraw(500);
          System.out.println("account1.getBalance() = " + account1.getBalance());

          //account1.balance=100000;
          System.out.println("account1.getBalance() = " + account1.getBalance());

          account1.deposit(12000);
          System.out.println("account1.getBalance() = " + account1.getBalance());

          account1.withdraw(6000);


          account1.withdraw(1800);// neden bunu göstermiyor.
                                          //ne yapmalı?????
      }
      catch(Exception ex)
      {
          System.out.println(ex.getMessage());
      }

    }
}
