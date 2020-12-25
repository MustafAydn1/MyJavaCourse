package M2W2D3_G28_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet3 {
    public static void main(String[] args) {

        Set<String> hs=new HashSet<>();
        hs.add("Ali");
        hs.add("MEHMET");
        hs.add("Ayşe");
        hs.add("Dilek");
        hs.add("Emir");
        System.out.println("hs = " + hs);// en hızlı yapmak içi kendince bir algoritmayla yaptı...


        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("Ali");
        lhs.add("MEHMET");
        lhs.add("Ayşe");
        lhs.add("Dilek");
        lhs.add("Emir");

        System.out.println("lhs = " + lhs);//"market kuyrugu" gibi eklenme sırasına göre  yerleştirdi....

        Set<String> ts=new TreeSet<>();
        ts.add("Ali");
        ts.add("MEHMET");
        ts.add("Ayşe");
        ts.add("Dilek");
        ts.add("Emir");

        System.out.println("ts = " + ts);// büyükten küçüge göre  yerleştirildi..


    }
}
