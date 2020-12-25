package M2W4D4_G39_Enum_mainArgmnts.javaEnum.Ex1;

public class Ex1 {

    public static void main(String[] args) {

        // verilen ay nosuna göre ayın kaç gün olduğunu yazdırnız.

        //int   sayi = 5; gibi
        // new e gerek olmadan, enum adıyla bir nesne olustur.
        //sonra, enumadı.enumdeğişkeni yap..
        Aylar ay=Aylar.MART;
        System.out.println("ay = " + ay); // ay = MART
        System.out.println("ay.name() = " + ay.name()); // ay.name() = MART
        System.out.println("ay.ordinal() = " + ay.ordinal()); // ay.ordinal() = 2: İNDEXİ DENEBİLİR.

        switch (ay)
        {
            case OCAK:
                System.out.println(31);
                break;

            case SUBAT:
                System.out.println(28);
                break;

            case MART:
                System.out.println(30);
                break;

            case NISAN:
                System.out.println(31);
                break;

            case MAYIS:
                System.out.println(30);
                break;
        }




/*
BİR NOT:
Java dilinde Enum türleri önceden tanımlanmış sabit değerleri ifade etmede kullanılır.
Burada kastedilen, bir haftanın kaç günden ve hangi günlerden oluştuğudur.
Enum için yapıcı metot tanımlandığında private erişim belirleyici kullanılması zorunludur.
 */
    }
}

