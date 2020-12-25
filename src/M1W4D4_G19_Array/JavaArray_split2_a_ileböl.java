package M1W4D4_G19_Array;

import java.util.Scanner;

public class JavaArray_split2_a_ileböl {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız bi cümleyi kelimelerine bölerek alt alta yazdırınız.
// split diziyi nereden bölmek istersen oradan böler...
        //burada boşluga göre bölduk. eger a harflerinden böl deseydik.a lardan bölerdi...

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        String[] kelimeler= cumle.split("a"); // boşluk karakterine göre böler ve diziye atar

        for(int i=0; i<kelimeler.length ; i++)
        {
            System.out.println(kelimeler[i]); // String[] kelimeler= cumle.split(" ") ile yeniden tanımladık..
        }                                    // bu yuzden parcalanmış olarak gelecek...


        String[] harfler=cumle.split(""); // harflere parcalar.

        for(String hrflr: harfler)
            System.out.println(hrflr);


        //2.yöntem foreach= dizinin tüm elemanlarını benım verdiğim isme  tek tek atıyor...
     //   for(String elemanDegeri : kelimeler) //
      //  {
        //    System.out.println(elemanDegeri);
        //}


    }
}
