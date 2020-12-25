package EXTRA;

public class recursive_Ozyenilemeli {
    public static void main(String[] args) {










        }


    public static int toplamBul(int n){

        if(n==1)
            return 1;
        else
            return n+toplamBul(n-1);
    }

    public static int faktoriyel(int n){

        if(n==1)
            return 1;
        else
            return n*toplamBul(n-1);

}

public static int fibonacci(int n){

        if(n==1 || n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);

}
public static int ustAlma(int x,int y){

        if (y==0)
            return 1;
        else
            return x*ustAlma(x,y-1);

}

public static int ustAlma2(int x,int y){

        int sonuc=1;
        int i=1;
        while (i<=y){
            sonuc=sonuc*x;
            i++;

        }
        return sonuc;
}




}
