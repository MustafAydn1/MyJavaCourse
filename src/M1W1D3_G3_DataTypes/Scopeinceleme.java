package M1W1D3_G3_DataTypes;

public class Scopeinceleme {
    public static void main(String[] args) {

         int a=5;
             a=6;

        {

        int b=7;
            b=8;
            a=10; // burada a ve b mevcuttur
            System.out.println("b = " + (a+b));
        }
        a=11;
  //      b= 12;     b yi  burada kullanamazsın.çünkü buaralıkta tanımlı değil.


        int b=13;    // yeniden  b tanımlayabilirsin. bu aralıikta tanımlı degil.
        b=14;
 //       int a= 15;  tanımlayamazsın cunku a tum aralıklarda tanımlı... en ust parantezde...


// BİR DEGİŞKENİ SADECE BELLİ BİR YERDE KULLANIP KORUMAYA ALMAK./BELLİ ALANDAKI HAFIZAYA ALIP HAFIZA COĞALTMAMAK...etc.

    }
}