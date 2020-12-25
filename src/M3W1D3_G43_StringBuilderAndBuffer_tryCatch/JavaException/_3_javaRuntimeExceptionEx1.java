package M3W1D3_G43_StringBuilderAndBuffer_tryCatch.JavaException;

import java.util.Scanner;

/*

        //  a=5  b=3        a/b  cevap aliriz program sorunsuz calisir
        //  a=4  b=0        a/b   burda RunTimeEror Exeption oluyor
        //  a=3  b=fb; 3.59       a/b  burda yine RunTimeEror oluyor
 */
public class _3_javaRuntimeExceptionEx1 {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz=");
        int a=oku.nextInt();

        System.out.print("2.Sayıyı giriniz=");
        int b=oku.nextInt();

        System.out.println("a/b = " + a/b);
/*
 2. sayı=0 dersem...
//Exception in thread "main" java.lang.ArithmeticException: / by zero
// Aritmetik işlem hatası: bölmede payda sıfıl olması

2. sayı= fb dersem; Exception in thread "main" java.util.InputMismatchException
input ile eşlesmeyen/yanlış eşleşen bir giriş yaptınız...
 (_3_javaRuntimeExceptionEx1.java:21):::: hatanız 21. satırda...



 */
    }
}
