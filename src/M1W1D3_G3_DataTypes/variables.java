package M1W1D3_G3_DataTypes;

public class variables {
    public static void main(String[] args) {


        int sayi=5; // 1. yöntem


        int sayi2;  //  2. yöntem= önce  tanimla  / sonra degişken ata
        sayi2=10;

        System.out.println(sayi2);


        int sayi3, sayi4,sayi5; // 3. yöntem

        sayi4=3;
        sayi5=6;

        int h= sayi4+sayi5;

        System.out.println("tpl = " + sayi4+sayi5);
        System.out.println("tpl = " + (sayi4+sayi5));
        System.out.println(h);

        int sayi6=10, sayi7=9;  // 4. yöntem >>>> BÖYLECE BİRSÜRÜ ALT ALTA int TANIMLAMAMIŞ OLURSUN.


        System.out.println("tp = " + (sayi6+sayi4));


        int a=10;
        int b=20;
        int toplam= a+b;
        toplam=toplam+2;
        toplam=toplam+3; // hep en sondakine mi gider???? EVEET

        System.out.println("toplam = " + toplam);

        System.out.println("toplam = " + toplam);

        System.out.println("toplam="+(toplam+sayi4+5));








    }


}
