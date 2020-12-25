package M2W2D3_G28_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    /*
    ArrayList<Integer>asd=new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(asd);
arraylist de oldu
     */

    public static void main(String[] args) {
        // RemoveAll, RetainAll, AddAl

        Set<Integer> hs1=new HashSet<>(Arrays.asList(1,2,3,4,5)); // int[] dizi = {1,2,3} bunun gibi
        // Arrays.asList(1,2,3,4,5)  bu işlem, hs1.add(1); hs1.add(2) ... ile aynı

        Set<Integer> hs2=new HashSet<>(Arrays.asList(4,5,6,7,8));

        System.out.println("hs2 = " + hs2);
        System.out.println("hs1 = " + hs1);

        // retainAll : Kesişim
        Set<Integer> hsKesisim= new HashSet<>(hs1); // hs1 den kopya oluşturdum.// BUNU YAPMAK ZORUNDA.BAŞKA YOLU YOK.
        hsKesisim.retainAll(hs2); // hs1 ile hs 2 nin kesişimi bulundu
        System.out.println("hsKesisim = " + hsKesisim); // Ortak elemanlar bulundu

        Set<Integer> hsFark = new HashSet<>();// SANIRIM BOŞ bir set yapıp sonra içine fark veya kesişim konuyor...
        // Kopya oluşturmanın 2.Yöntemi
        hsFark.addAll(hs1); // hs1 din tamamı hsFark a atandı
        hsFark.removeAll(hs2);

        System.out.println("hsFark = " + hsFark);

    }
}
