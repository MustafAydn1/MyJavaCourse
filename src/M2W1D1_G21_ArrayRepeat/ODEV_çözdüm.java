package M2W1D1_G21_ArrayRepeat;

public class ODEV_çözdüm {
    public static void main(String[] args) {
 //       Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup, çarpımını ekrana yan yana
        // yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız

        int [][] matris1=new int[3][3];
        int [][] matris2=new int[3][3];
        int [][] matris3=new int[3][3];

        for (int satir = 0; satir <matris1.length ; satir++) {
            for (int sutun = 0; sutun <matris1[satir].length ; sutun++) {

                matris1[satir][sutun]=(int)(Math.random()*10);
                System.out.print(matris1[satir][sutun]+" ");

            }
            System.out.println();
        }
        System.out.println("*******************");

        for (int satir = 0; satir <matris2.length ; satir++) {
            for (int sutun = 0; sutun <matris2[satir].length ; sutun++) {
                matris2[satir][sutun]=(int)(Math.random()*10);
                System.out.print(matris2[satir][sutun]+" ");

            }
            System.out.println();
        }

        System.out.println("****************");

        for (int satir = 0; satir <matris3.length ; satir++) {
            for (int sutun = 0; sutun <matris3[satir].length ; sutun++) {
                matris3[satir][sutun]=((matris1[satir][sutun])*(matris2[satir][sutun]));
                System.out.print(matris3[satir][sutun]+" ");
            }
            System.out.println();
        }

// her matris için ayrı ayrı satır sutun atama... for i-j atar gibi aynı satır-sutun ifadelerini kullan.
           }
}
