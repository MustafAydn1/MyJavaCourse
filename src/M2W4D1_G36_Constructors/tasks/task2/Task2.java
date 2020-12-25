package M2W4D1_G36_Constructors.tasks.task2;

public class Task2 {
    public static void main(String[] args) {

       Banka bank1=new Banka("Yapı Kredi",1234,"Konak");
       Banka bank2=new Banka("Ziraat",6789);
       Banka bank3=new Banka("BankAsya");

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
// toStrin metodunu yazınca Constructors ile yazılan herşeyi
//verilen kadarı ile ayrı ayrı yazdırıyor.
    }
}
