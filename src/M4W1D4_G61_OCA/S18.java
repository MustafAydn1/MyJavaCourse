package M4W1D4_G61_OCA;

public class S18 {
    public static void main(String[] args) {

        String [][] chs = new  String [5][2]; // 5 satır 2 sutun

        chs[0] = new String[2]; //chs[0].lenght--> 2 dir.

        chs[1] = new String[5]; // chs[1].lenght-->5 dir.  new yaptıgı için yeniden tanımladı sutun sayısını 5 e cıkardı..
        int i =97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) { // chs[a].length desek dogru olurdu.
                chs[a][b]= ""+i;
                i++;
            }
        }


        for (String [] ca: chs ) {
            for (String c: ca) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
    }

