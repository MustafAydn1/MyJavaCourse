package M1W1D3_G3_DataTypes;

public class JavaDataTypes {
    public static void main(String[] args) {

        byte byteDeger=4;
        short shortDeger=3000;
        int  intDeger=200000;
        long longDeger=1234599999;  // 10 teneyi gecince hata veriyor NEDEN?????


        float floatDeger=3.14f;  // hata  verdi. çunku defalt olarak double kabul ediyor. sonuns f koyarak gider.???
        double doubleDeger=3.14;

         char charDeger1='A';
         char charDeger2= 65;   // farklı durumlarda harflerin saısal degerleri de kullanılıyor.CIKTIYA HARF/char VERİR.??
         char charDeger3= 97;  // a nın Degeri=97 ve A=65 dir. birini diğerine 32 ekleyip çıkarak cevirebilirsin.
         char charDeger4=123;  // 123 sayısının karsılığı olan bir karakteri CIKTI olarak verir.

         boolean boolDeger1=true;
         boolean boolDeger2=false;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("charDeger1 = " + charDeger1);
        System.out.println("charDeger2 = " + charDeger2);
        System.out.println("charDeger3 = " + charDeger3);
        System.out.println("charDeger4 = " + charDeger4);
        System.out.println("boolDeger1 = " + boolDeger1);
        System.out.println("boolDeger2 = " + boolDeger2);



        

    }
}
