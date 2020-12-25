package M4W1D4_G61_OCA;

public class S82 {
    public static void main(String[] args) {
        String [][] chs = new  String [2][]; // böyle yazıma
        chs[0] = new String[2]; // burada satırı chs[0] ile vermiş.. sutunu new String[2] ile vermiş. farklı bir 2d yazımı
        chs[1] = new String[5]; // burada satırı chs[1] ile vermiş.. sutunu new String[5] ile vermiş. farklı bir 2d yazımı
        int i =97;
        for (int a = 0; a < chs.length; a++) { //for un sınırı 2 ye kadar
            for (int b = 0; b < chs.length; b++) { //burada da 2 ye kadar...

                chs[a][b]= ""+i; // int i stringe cevirmiş. yoksa...

                i++;   // 97 98--99 100--  geriye kalanlar string oldugu için null nul null olur.
            }
        }
        for (String [] ca: chs ) {
            for (String c: ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    }

