package M1W4D4_G19_Array;

import java.util.Scanner;

public class JavaArray1 {
    // Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten yazdırınız.

    public static void main(String[] args) {

        int [] sırala=new int[5];  //5 tane ama , oda numarası 0,1,2,3,4
        Scanner input=new Scanner(System.in);

        for (int i=0;i<sırala.length;i++){

            System.out.print("sayı giriniz: ");
            sırala[i]=input.nextInt();
            //System.out.println(sırala[i]);
        }
        System.out.println("************");


// tersten demek indexleri sondan başa doğru ilerletmek demek
        // 4,3,2,1,0
        for(int i=sırala.length-1; i>=0;i--){  // 4 yerine dizi.length-1 yazılabilir.
            System.out.println("Eleman= "+sırala[i]);
        }





    }


}
