package M2W4D3_G38_StaticFinal.nonAccesModifiers.staticModifiers;

public class Simple {

  //  int a;
    // int b;
  // bunları direk kullanamayız. nesnesi olmalı


    int a;            // instance variable; oluşturulacak her bir nesnenin kendi değişkeni
    static  int b;   // class variable; bu static anahtarı ile sınıfın bir değişkeni oluyor.

    void increase(){
        a++;
        b++;
    }


    public static void main(String[] args) {

        Simple ornek=new Simple();
        ornek.a=5;

        Simple ornek2=new Simple();
        ornek2.a=7;
  //  RAM de iki farklı yerde nesne tanımlı ikisinde de a nın farklı degerleri var.
// a ya nesnelerle ulasırım.

        Simple.b=5;// b degeri sınıfa aıt oldugu için 1 tanedir.
        Simple.b=7;// yeni deger atandıkca degişir.

        ornek.increase(); // ornek.a 1 arttı,  sınıfn da b si 1 arttı
        ornek2.increase(); // ornek2.a 1 arttı, sınıf da b si 1 arttı



        System.out.println("ornek.a = " + ornek.a); // ornek.a = 6
        System.out.println("ornek2.a = " + ornek2.a); // ornek2.a = 8
        System.out.println("Simple.b = " + Simple.b); // Simple.b = 9);

// ANlamadıgım,b nesnelerle cagırılamzken burada bnasıl artıyor.?????????
// static :oluturulacak Bütün nesnelere ait ortak özellik.Degismeyen.sinifin ayni ozelligini tutup yer kaplammasi icin

        //1- Kural static field a sadece class dan erişilir
        //2- Kural diğer field lara sadece new ile oluşturulmuş nesnelerden
        //   ulaşılır.
        //3- Ancak oluşturulmuş bir nesnenin metodlarında
        //   static değişkene ulaşılabilir

    }
}
