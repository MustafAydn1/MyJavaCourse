package M4W1D4_G61_OCA;

public class S71 {
    public static void main(String[] args) {
        int [][] arr = new  int [2][4];
        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

        for (int [] a: arr ) { //0. ve 1. satırı alıyor. 1357 ve 13  aldı... yani hepsini....

            for (int i = 0; i < arr.length; i++) { // sadece satır sayısını alır.:2 dir. a.length olsaydı 6 olurdu.

                System.out.println(a[i]+ " ");//a[0],a[1] yani a'dan 1. satırdan  1 3
            }System.out.println();
        }

    }






    }

