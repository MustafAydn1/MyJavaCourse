package M2W3D2_G32_CLASS_Methods.example.Ex1;

public class Ex1 {
    // 1.Adım  :Person isimli bir class yazınız:fields: name, surname, age; olsun.
    // 2.Adım  :main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3.Adım  :getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
    // 4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren metodu yazınız
    // örnek ahmet demir : A.D.

    public static void main(String[] args) {
        Person kisi1=new Person(); // insanların (nev'inden)içinden bir insan oluştu.
        kisi1.name = "Yusuf";
        kisi1.surname = "Yılmaz";
        kisi1.age = 35;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        Person kisi2=new Person();// insanların (nev'inden)içinden bir insan oluştu
        kisi2.name = "Ayşe";
        kisi2.surname = "Demir";
        kisi2.age = 30;

        //1.Yöntem oldukça uğraştırıcı
        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        System.out.println("**************************************************************************");

        //2.Yöntemin kullanılması : kendi başına yazdır, fakat her nesne için böyle yazarsak oldukça karışır
        BilgiYazdir(kisi1); // bu yöntemde parametre göndermek zorunda kalıyorum.
        BilgiYazdir(kisi2);

        //3.Yöntemin main de kullanılması
    kisi1.BilgiYazdir();
    kisi2.BilgiYazdir();

        System.out.println("kişi1 in dogum tarihi: "+ kisi1.getBirthYear());
        System.out.println("kişi2 in dogum tarihi: "+ kisi2.getBirthYear());

        System.out.println("kisi1.Initials() = " + kisi1.Initials());
        System.out.println("kisi2.Initials() = " + kisi2.Initials());

    }

    //2.Yöntem iyi metod kullandık, fakat
    public static void BilgiYazdir(Person kisi)// metod için,Person class dan kişi adlı bir parametre oluşturdum.
    {
        System.out.println("metod.name = " + kisi.name);// kisi yazınca name in gelme sebebi,kisi Person classından olustu.
        System.out.println("metod.surname = " + kisi.surname); // adam da yazsam aynı şekilde olurdu..
        System.out.println("metod.age = " + kisi.age); // Person da iki nesen(insan oluştugu için) otomatik bilgiler gelir
    }



}

class Person // extra biz açmadık. Ama Java kendisi class açıldıgı için otomatik sayfa açtı.
{
    // fields, attributes, properties
    String name;
    String surname;
    int age;

    // methods
    void BilgiYazdir()  //3.Yöntem ait olduğu class a ekleniyor ve en iyi yöntemi bulmuş oluyoruz
    {
        System.out.println("kisi.name = " + name);
        System.out.println("kisi.surname = " + surname);
        System.out.println("kisi.age = " + age);
    }
// çıktı da kişi1, kişi2 dıye ayırmadı... nasıl yapılabilir.????

    int getBirthYear(){

        return 2020-age;
    }

    String Initials (){ // baş harfleri demek.

        return name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".";
    }
}
