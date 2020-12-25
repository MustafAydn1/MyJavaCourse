package M3W3D3_G50_Interface.task2;

public class Soru2 {

    public static void main(String[] args) {

        try {
            System.out.println("LINE A");
            System.out.println("LINE B");
            System.out.println("LINE C");
            System.out.println("LINE D");
        } catch (Exception e) {
            System.out.println("LINE E");
            System.out.println("LINE F");
        }
        System.out.println("LINE G");
    }
// cevap : A B C D G   OLACAK... E VE F OLMAZ CUNKU HATA VERİNCE OLMALI. HATA YOK.
}


//      for(int i=1; i<=100;i++)
//           System.out.println(i);     1 2 3 4 5 6 --->>> BU İFADEYİ SADECE;
//   System.out.println(i); i yi değiştirerek nasıl tersten yazdırırsınız....

//              System.out.println(100-i);   99 98 97 96 95 ....