package M1W1D5_G5_TypeCasting_2;

public class örnek12 {
    public static void main(String[] args) {

        short a= 235;
        String Strb=Short.toString(a);
        System.out.println("b = " + Strb);

        int aa= 123;
        String Stra="27";

       // int toplam=aa+Stra;  böyle olmaz.
        //int tpl=(aa+Stra);   böyle de olmaz...  stringi int e  cevirmen lazım. bu parantezle cözülmez.

        int bb=Integer.parseInt(Stra);
        int tplm=aa+bb;  // ARTIK OLDU...
        System.out.println("tplm = " + tplm);

        int Tp=aa+5;
        System.out.println("Tp = " + Tp);

        //**********************************************


        // sayılar arası dönüşüm.. BU KISMA TEKRAR CALIŞ. HOCANIN ÖRNEK 6 SI... 5. GUN SANIRIM.

        int sayi=15;
        double rakam= 20;

        rakam=sayi;       // otomatik oluyor. ... rakam=(double)sayi;
        sayi=(int)rakam;  // manuel olmalı











    }
}
