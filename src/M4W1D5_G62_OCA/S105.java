package M4W1D5_G62_OCA;

public class S105 {

        int x, y;

        public S105(int x, int y) {
            initialize(x, y);
        }

        public void initialize(int x, int y) {

            this.x = x * x;
            this.y = y * y;
        }

        public static void main(String[] args) {

            int x = 9, y = 5;
            S105 obj = new S105(x, y);

         //   System.out.println(obj.x+" "+obj.y); // olsaydı... 81 25  olurdu...

            System.out.println(x + " " + y); //9 5
        }
    }


