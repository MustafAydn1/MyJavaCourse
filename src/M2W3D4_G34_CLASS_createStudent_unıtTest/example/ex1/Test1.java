package M2W3D4_G34_CLASS_createStudent_unıtTest.example.ex1;

import org.junit.*;
import org.junit.Assert;

public class Test1 {

     @Test
    public void testGetArea1(){

// YÖNTEM: İLGİLİ SINIFTAN NESNEYİ OLUSTUR  VE verileri hazırla....

         Rectangle dikdortgen= new Rectangle();
         dikdortgen.length=5;
         dikdortgen.width=4;

// beklenen yani actual degeri al...
         int sonuc=dikdortgen.getArea(); // Actual deger, yani o  code dan anda gelen deger..20 çıkması lazım...


//Assert ile karşılaştır..
         Assert.assertEquals("Test Geçemedi",20,sonuc); // expected ile actual(sonuc) birbirine eşit olmalıdır ki gecsın.



    }

    @Test
    public void testGetArea2(){

// YÖNTEM: İLGİLİ SINIFTAN NESNEYİ OLUSTUR  VE verileri hazırla....

        Rectangle dikdortgen= new Rectangle();
        dikdortgen.length=5;
        dikdortgen.width=4;

// beklenen yani actual degeri al...
        int sonuc=dikdortgen.getArea(); // Actual deger, yani o anda gelen deger..20 çıkması lazım...


//Assert ile karşılaştır..
        Assert.assertEquals("Test Geçemedi.",23,sonuc); // expected ile actual(sonuc) birbirine eşit olmalıdır ki gecsın.



    }
}
