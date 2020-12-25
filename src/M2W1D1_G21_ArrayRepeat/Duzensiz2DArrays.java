package M2W1D1_G21_ArrayRepeat;

public class Duzensiz2DArrays {
    public static void main(String[] args) {

        int [][] duzensiz2d= {
                {0,1,2},
                {3,4},
                {5,6,7,8,9,10},
                {11,12,13,14,15}};
        // boş olan yerelere eleman atanamaz tanımlama sonrasında hata verir

        System.out.println("0. satırdaki sutun sayısı: "+duzensiz2d[0].length);
        System.out.println("1. satırdaki sutun sayısı: "+duzensiz2d[1].length);
        System.out.println("2. satırdaki sutun sayısı: "+duzensiz2d[2].length);
        System.out.println("3. satırdaki sutun sayısı: "+duzensiz2d[3].length);

        for (int i = 0; i <duzensiz2d.length ; i++) { // sadece satır sayısını verir.
            
            for (int j = 0; j <duzensiz2d[i].length ; j++) {// her satır için ayrı ayrı sutun sayılarını verir.

                System.out.print(duzensiz2d[i][j]+" ");

            }
            System.out.println();
        }


/*
        // Düzensiz 2 boyutlu diziler.
        int[][] duzensiz2d = {
                {0,1,2},
                {3,4},
                {5,6,7,8,9,10},
                {11,12,13,14,15}
        }; // boş olan yerelere eleman atanamaz tanımlama sonrasında hata verir
        System.out.println("0.Satırdaki sutun sayısı = " + duzensiz2d[0].length);
        System.out.println("1.Satırdaki sutun sayısı = " + duzensiz2d[1].length);
        System.out.println("2.Satırdaki sutun sayısı = " + duzensiz2d[2].length);
        System.out.println("3.Satırdaki sutun sayısı = " + duzensiz2d[3].length);

        for(int i=0;i<duzensiz2d.length;i++)
        {
            for(int j=0;j< duzensiz2d[i].length;j++){
                System.out.print(duzensiz2d[i][j]+" ");
            }
            System.out.println();
        }
 */
    }
}
