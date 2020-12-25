package M4W1D4_G61_OCA;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");
        colors.add("bule");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2);
        colors.add(3, "cyan"); // 4 olsaydı, bounds verirdi.// index vermeyince de sona eklerdi.
        System.out.println(colors);         // 2 deseydi... 2. indexe kendi girer. sonrakiler birer kayardı.
    }
}
