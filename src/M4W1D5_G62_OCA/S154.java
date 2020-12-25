package M4W1D5_G62_OCA;

public class S154 {

        int count; // STATİC OLMAYAN DISARIDAKİ DEGİŞKENLER,static metodun içinden cagırılamaz...count++ kızarır.
                   // orayı yoruma aldım. aç gör.

        public static void displayMsg () {
     //       System.out.println("Welcome Visit Count: "+ count++); // line n1
        }

        public static void main(String[] args) {
            S154.displayMsg();     // STATİC METODLARI CLASS ADIYLA CAGIRIYORUM
            displayMsg();  //        AYNI SAYFA DA OLDUGU İÇİN DİREK CAGRILABİLİR.


                    }
    }

