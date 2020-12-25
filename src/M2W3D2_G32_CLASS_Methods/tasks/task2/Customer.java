package M2W3D2_G32_CLASS_Methods.tasks.task2;

public class Customer {
    String name;

   //ElectricityAccount elektrikAbonesi=new ElectricityAccount();// bu şekilde Customer class ın dada  tanımlanıp.mainde kullanılabilir.


    ElectricityAccount elektrikAbonesi; //Önce burada böyle,,sonra main de new ile tanımlanabilir.
    //
    // Customer sen artık bir elektrik abonesısın...bu omazsa costumer ile elektrik abone bilgisi eşlenemez.
    // Elektrik ile bilgiler Elektrik sınıfında olsun ki, Customer in içi karişmasın.Ama fatura için Customer ile ilişkilensin



}
