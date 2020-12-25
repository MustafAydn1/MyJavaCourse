package M1W3D2_G12_Ternary_MathClass;

import java.util.Scanner;

public class MathClass_Max {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        // böyle de olur. kullanıcıya  talimat gitmemiş olur, sadece...
      //  int a,b,c=input.nextInt(); olmadı...  Bu Neden olmadı.....???????????????

        int enbüyük= Math.max(a,b);
        enbüyük=Math.max(enbüyük,c);

        System.out.println("enbuyuk= "+enbüyük);

        System.out.println("en büyügü= "+ Math.max(Math.max(a,b),c));

        // iki turlu de olur. ikinci daha pratık


    }
}
