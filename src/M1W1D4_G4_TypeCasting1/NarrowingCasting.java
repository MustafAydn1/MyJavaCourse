package M1W1D4_G4_TypeCasting1;

public class NarrowingCasting {

    public static void main(String[] args) {
       // narrowingcasting
      //  double -> float -> long -> int -> char -> short -> byte :   manuel dönüşüm


        double vergi=6.256;
        int yuvarlanmişvergi=(int)vergi;

        System.out.println("yuvarlanmişvergi = " + yuvarlanmişvergi);


        double vergi1=7.256;
        int tamolarak=(int)vergi1;
        System.out.println("tamolarak = " + tamolarak);


        double a= 7777.345;

        char b= (char)a;
        System.out.println("b = " + b);

        short c=(short)a;
        System.out.println("c = " + c);




    }
}
