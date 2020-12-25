package M4W1D4_G61_OCA;

import java.util.Arrays;

public class S39 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];

        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for (String[] c : shirts) { // shirt 2 boyutlu diziyi : c ise herbirsatırı
            // for (String s : c) {
            System.out.println(Arrays.toString(c));   // parcalamayı gör...bununla da bi incele ikinci for silerek.
            for (String s : c) {

                System.out.println(s + ":");
            }
        }
    }

    }
