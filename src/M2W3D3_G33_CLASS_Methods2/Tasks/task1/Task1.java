package M2W3D3_G33_CLASS_Methods2.Tasks.task1;

public class Task1 {
    // Math sınıfndaki metodlarıdan 5 tanesini kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarınız kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.
    public static void main(String[] args) {

       int a=10;
       int b=16;

        System.out.println(MyMath.enBuyuk(a,b));
        System.out.println(MyMath.karekok(25));
        System.out.println(MyMath.mutlakDeger(-101));
        System.out.println(MyMath.rasgeleSayilar(5,9));


    }
}
