package M1W1D5_G5_TypeCasting_2;

public class Casting_Short_toString {

    public static void main(String[] args) {
        // sayılar arası dönusum
        short sayi1 = 26;
        String kelimehali=Short.toString(sayi1); // I came home to school= evden okula geldim.
        System.out.println("kelimehali = " + kelimehali);

        byte sayihali= 17;
        String wordhali=Byte.toString(sayihali); // to yönelme halidir. stringe cevir.

        System.out.println("wordhali = " + wordhali);


        // sayıyyı  stringe dönusturme


       int sayi2 = 245; //
      // String kelimehali2= "245";  // sayı degeri taşımaz. sadece sembol dur
        // int top= 34+ sayi2;
        //  int top2= 34+ kelimehali2; // kabul etmiyor.çunku:  biri sayi digeri yazı...

       String metinhali=Integer.toString(sayi2);
        System.out.println("metinhali = " + metinhali);








    }
}
