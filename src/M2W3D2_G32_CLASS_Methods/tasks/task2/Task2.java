package M2W3D2_G32_CLASS_Methods.tasks.task2;

public class Task2 {
    // 1.Adım  :ayrı dosyada olmak üzere Customer isimli (fields: name) isimli bir class tanımlayınız.
    //2.Adım  :ayrı bir dosyada ElectricityAccount isimli (fields : totalKw, rate(double), bill)
    //3.Adım  :Customer a bir ElectricityAccount ekleyiniz.
    //4.Adım  :1 tane müşteri oluşturunuz, Account u dahil;
    //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
    //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
    //6.Adım  :Ödenecek rakamı  toplam tüketimi  rate ile çarparak hesaplatınız yazdırınız.
    public static void main(String[] args) {

        Customer musteri1=new Customer();
        musteri1.name="Kaya";

        //ElectricityAccount elektrikAbonesi= new ElectricityAccount();//bununla CALIŞMIYOR.

        musteri1.elektrikAbonesi=new ElectricityAccount();// bununla calışıyor.!!!!!!

        musteri1.elektrikAbonesi.tuketimEkle(100);
        musteri1.elektrikAbonesi.tuketimEkle(150);

        System.out.println("musteri1.elektrikAbonesi = " + musteri1.elektrikAbonesi);

        System.out.println("musteri1.elektrikAbonesi.totalbill() = " + musteri1.elektrikAbonesi.totalbill());
        System.out.println("Ödenecek Fatura: "+musteri1.elektrikAbonesi.bill);// üstte yazarsan 0.0 olur.totalbill calişmadan olmaz.
        // nedenini anlayamadım...??????


        // BU SAYFAYA DETAYLI BAKKKK. ANLAMADIGIM YERLER VAR...
    }
}
