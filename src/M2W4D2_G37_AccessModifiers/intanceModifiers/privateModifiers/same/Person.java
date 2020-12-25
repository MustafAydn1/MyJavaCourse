package M2W4D2_G37_AccessModifiers.intanceModifiers.privateModifiers.same;

public class Person {

    int id;
    String name;
    String userName;
   private String password;

  //passworda herkesin ulaşmasını istemezsek prıvite yaparız.

    // içinde birtane dahi String varsa stringdir.rakamlar ve harfler...

    //passwordu herkesin cagırmasını istemiyorum.ama kullanmakda istiyorum.
    //metodla şifre özellikleri belirleyip,kısıtlı göstererek cagırtırım.
    //ŞİMDİ BUNU YAPACAGIZ...

    public void SifreBelirle(String sifre) {
        if (sifre.length() >= 8) {
          password = sifre;//FİELDS DEKİ passwordu artık şifre ye atadık.
        //    System.out.println("****"+this.password.substring(4));
  // bu cıktıyı buraya koyunca şifreGöster metoduna  hiç gerek yoktu...


        } else {
            System.out.println("En az 8 karakter olmalı");
 // böylece girilen şifre password olamaz. yani şifre kabul edilmedi. ortada yok.
        }
    }

        public void SifreGoster() {

        if (password!=null){// sifre yazılmaz.fieldsten gelmeli...
            System.out.println("****"+this.password.substring(4));
        }

        }
  // if (this.password!=null bunu neden yaptık. ÇÜNKÜ;
  // şifre<8 karakter olunca şifreyi bastan kabul etmeyince
  //şifre boş kalıyor. göster kısmı da hata veriyor.
  //bunun için if şartı koyduk.

    // NOT:::: BURADA this.password lar yerine password yazınca da calıştı.
    // niye this li yaptım. hikmeti??????????????


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    //passwordu kilitli gösteriyor. ama cıktıya da eksiksiz tamamını veriyor??????
}




