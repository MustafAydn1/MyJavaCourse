package M4W1D5_G62_OCA;

public class S123 {

        int a1;

        public static void doProduct(int a) {
            a = a * a;
        }
        public static void doString(String s) {
            s.concat(" " + s);
        }



        public static void main(String[] args) {

            S123 item = new S123();

            item.a1 = 11;
            String sb = "Hello";
            Integer i = 10;
            doProduct(i); // i degeri metodda primitive tipe dönuserekişleme girdiğinden i, Integer nesnesi de olsa degeri degişmiyor.
            doString(sb);
            doProduct(item.a1);

            System.out.println(i + " " + sb + " " + item.a1);



        }
    }
