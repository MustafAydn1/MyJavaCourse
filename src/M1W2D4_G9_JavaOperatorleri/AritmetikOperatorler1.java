package M1W2D4_G9_JavaOperatorleri;

public class AritmetikOperatorler1 {
    public static void main(String[] args) {
        
 
    int a=10;
    int b=5;

        System.out.println("TOPLAMA İŞLEMİ=");
        System.out.println("a+b= "+(a+b));
        System.out.println("a+b= "+a+b); // paranteze almazsan 105 olarak cıktı verir.MATEMATİK İŞLEMİ OLARAK ALGILAMIYOR.

        System.out.println("5+2= "+5+2);
        System.out.println("5+2= "+(5+2));

        System.out.println("a-b= "+(a-b));
        System.out.println("5-2= "+(5-2));

        System.out.println("NEGETİFLEŞTİRMEK İÇİN");
        System.out.println("b nin eksi degeri= "+(-b));
        a=-a;
        b=-b;    // a ve b yukarıda tanımlı oldukları için direk atadık...
        System.out.println("b = " + b);
        System.out.println("a = " + a);


    }
}
