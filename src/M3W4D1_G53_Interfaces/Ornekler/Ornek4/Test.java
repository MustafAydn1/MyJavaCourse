package M3W4D1_G53_Interfaces.Ornekler.Ornek4;

public class Test implements IGoster,IYazdir{
    @Override
    public void goster() {
        System.out.println("Sadece göster...");

    }
/*
 // implemente edilen interfaceler deki aynı isim ve paramatrede
    // olan metdolardan bir tanesini yazmak yeterlidir,
    // problem oluşturmaz.
 */



    @Override
    public void yaz() {
        System.out.println("hem göster hemde yaz bakalım.");

    }
}
