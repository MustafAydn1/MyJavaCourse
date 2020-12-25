package M2W4D3_G38_StaticFinal.nonAccesModifiers.FinalModifier.example2;

public class Persons {
    public static void main(String[] args) {

        Person kisi1=new Person("ismet",12);

      //  kisi1.fingerprintCode=15;// buna izin vermez.

        System.out.println("kisi1 = " + kisi1);

        Person kisi2=new Person("esra",23);
        System.out.println("kisi2 = " + kisi2);

      //  kisi2.fingerprintCode=17;// olmaz

//final static olmadıgı için her kişi için ayrı degişmez deger verilir.
 // Aynı degeri de atayamazsın.
        //bir kere atayacagim ve degismeyecek bir sey varsa
        //ama her nesne icin farkli deger


    }
}
