package M2W1D3_G23_Methods2;

public class Ja_Methods_Overloading2 {
    public static void main(String[] args) {


    int s1=4;
    int s2=56;
    int s3=78;
    int s4=54;

    int sonuc=toplam(s1,s2);
    int sonuc2=toplam(s1,s2,s3);
    int sonuc3=toplam(s1,s2,s3,s4);

    }
    public static int toplam(int... sayilar) // string içinde bu yapılabilir...
    {
        int toplam=0;

        for(int i=0;i<sayilar.length;i++)
        {
            toplam +=sayilar[i];
        }

        return toplam;
    }

    public static double toplam(double... sayilar)
    {
        double toplam=0;

        for(int i=0;i<sayilar.length;i++)
        {
            toplam +=sayilar[i];
        }

        return toplam;
    }

// böylece aşagıdakilerle işimiz kalmadı....

    /*public static int toplam(int a, int b)
    {
        return a+b;
    }
    public static int toplam(int a, int b, int c)
    {
        return a+b+c;
    }
    public static int toplam(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }*/
}
