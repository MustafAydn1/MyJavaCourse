package M1W2D4_G9_JavaOperatorleri;

public class AritmetikOperators_arttırma_unary {
    public static void main(String[] args) {

        int a=5;
        int b=2;
        int k=0;

         a++; // a nın değerini bir  arttırır...=>  a+1 le  aynı -> a=6 olur.
         ++a; // a nın değerini bir  arttırır...=>  a+1 le  aynı -> a=7 olur.

         k=a++;  // ++ lar sağda olduğu için,  önce k= a çalışır, sonra a=a+1; k=7 , a=8
         k=++a; //  ++ lar solda olduğu için,  önce a=a+1 olur, sonra k=9 olur, a=9 olur


        a--; // a nın değerini bir azaltır => a=a-1 le aynı -> 8
        --a; // a nın degerini bir azaltır => a=a-1 le aynı -> 7

        k = a--; // -- ler sağda olduğu için, önce k=a çalışır, sonra a=a-1 ;k=7, a=6
        k = --a; // -- ler solda olduğu için, önce a=a-1 çalışır, sonra k=a ;a=5, k=5

//        ++ veya -- değişkenin sağındaysa: önce işlemleri yap,
//        sonra değişkenin değerini 1 artır veya azalt
//
//        ++ veya -- değişkenin SOLUNDAYSA: önce değişkenin
//        kendi değerini 1 artır veya azalt sonra işlemleri yap




    }
}
