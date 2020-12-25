package M1W3D1_G11_ifelse_elseif_Logical;

import java.util.Scanner;

public class ifelse_Logic_4 {
    public static void main(String[] args) {
 /*       Scanner input=new Scanner(System.in);
        System.out.print("bir cümle giriniz");
        String str=input.nextLine();

        if(str.length()>10 && str.contains("study"))
            System.out.println(" evet");
        else System.out.println("hayır");
*/
//*****************************************************************

        Scanner input2=new Scanner(System.in);
        System.out.print("password giriniz : ");
        String str1 =input2.nextLine();


        if(str1.length()>=8 && str1.length()<=12 && !str1.contains("pass"))
            System.out.println("Doğru");
        else System.out.println("Yanlış");

        //*************************************************************************










    }
}
