package M1W1D5_G5_TypeCasting_2;

public class örnek9 {
    public static void main(String[] args) {
        //string olarak verilen karenin 1 kenar uzunlugundan
        // karenin cevresinı hesapla

        String kenar1= "2";
        String kenar2= "2";
        String kenar3= "2";
        String kenar4= "2";

        int k1= Integer.parseInt(kenar1); //parseInt ile string degerini int e cevirdi....
        int k2= Integer.parseInt(kenar2);
        int k3= Integer.parseInt(kenar3);
        int k4= Integer.parseInt(kenar4);

        int toplam= k1+k2+k3+k4; // artık int  e dönen degerleri toplayabilirsin.
        System.out.println("toplam = " + toplam);

        //****************************************************************************
        // BİRKENARI STRİNG VERİLEN 6 GENİN CEVRE UZUNLUGUNU BULUNUZ.

        String a ="36";
        int a1=Integer.parseInt(a);
        int toplamcevre= a1+a1+a1+a1+a1+a1;
        System.out.println("toplamcevre = " + toplamcevre);






        //  hocanın kı  coook daha ıyı oldu.. kısa...

        }
    }