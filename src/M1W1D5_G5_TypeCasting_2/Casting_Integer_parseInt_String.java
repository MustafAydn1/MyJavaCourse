package M1W1D5_G5_TypeCasting_2;

public class Casting_Integer_parseInt_String {
    public static void main(String[] args) {
        // stringi sayıya dönusturme

        String ekrandanGelen1 = "500";
        String ekrandanGelen2 = "1000";

        //int toplamBagis = ekrandanGelen1 +ekrandanGelen2;
        // bu şekilde olmaz çünkü rakam gibi gözüken semboller , sayı değil

// parse: uygun formda cevirmek sunmak

int bagis1=Integer.parseInt(ekrandanGelen1);
int bagis2=Integer.parseInt(ekrandanGelen2);

int TOPLAMBAGIS= bagis1 + bagis2;
        System.out.println("TOPLAMBAGIS = " + TOPLAMBAGIS);


        String mac1faul="12";
        String mac2faul="27";

        byte faul1=Byte.parseByte(mac1faul);
        byte faul2=Byte.parseByte(mac2faul);

        int toplamfaul= faul1 + faul2;  // NEDEN BYTE OLARAK TOPLAYAMADIM...
        System.out.println("toplamfaul = " + toplamfaul);


byte a= 3;
byte b=5;

//byte toplam= a+b; // byte ler kendi içinde toplanamıyorlar mı????




    }


}
