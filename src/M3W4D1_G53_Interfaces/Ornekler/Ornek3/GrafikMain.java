package M3W4D1_G53_Interfaces.Ornekler.Ornek3;

import M3W2D4_G49_Inheritance.task3_staticKullanım.A;

public class GrafikMain {
    public static void main(String[] args) {
        // bir interface den bir çok class implemente edilebilir.

        A4 nesne=new A4();
        nesne.yaz();
        nesne.goster();

        //interface lerden nesne üretileme fakat referans tipi oluşturulabilir.
        // bu bize Polymorphism sağladı.


        IYazdirilabilir nesne2=new A4();
        nesne2.yaz();
       // nesne2.goster(); // bu olmuyor cunku. nesne2 IGosterilebilir den oluşmadı.
        // BUNU AŞMANIN YOLU DA;

        ((A4)nesne2).goster(); // yani bir tur TYPEcasting oldu.



        IGosterilebilir nesne3=new A4();
        nesne3.goster();
      //  nesne3.yaz(); // bu olmuyor cunku. nesne2 IYazdirilabilir den oluşmadı.


    }
}
