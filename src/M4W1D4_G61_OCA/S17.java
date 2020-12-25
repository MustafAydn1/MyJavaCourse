package M4W1D4_G61_OCA;

public class S17 {
    public static void main(String[] args) {

        int [][] arr = new  int [2][4];
        arr[0] = new int[]{1,3,5,7};    // 0. satır ın elemanları 1 3 5 7 olarak yazıldı...
        arr[1] = new int[]{1,3};       // 1. satır ın elemanları 1 3 olarak yazıldı...

        for (int [] a: arr ) {

            for (int i: a ) {

                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}
