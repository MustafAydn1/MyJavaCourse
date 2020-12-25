package M2W2D2_G27_HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class J_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

      HashSet<String> hs= new HashSet<>();

       // Set<String> hs= new HashSet<>();

        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

//eklenme sırasına göre  cıktı veriri
        LinkedHashSet<String> lhs= new LinkedHashSet<>();

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

// alfabeye yada sayı sırasına göre sıralar..
      TreeSet<String> ts= new TreeSet<>();

        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

//Diziler ve sonrasında tanımlamayı yaparken   [] & <>   =new    [] & <> ;      olarak yapılıyor.....

        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(2);
        ts1.add(3);
        ts1.add(0);
        ts1.add(-1);
        System.out.println("ts1 = " + ts1);

    }
}

