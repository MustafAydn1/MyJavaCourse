package M2W2D4_G29_Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<Integer,Integer> m= new HashMap<>();
        m.put(2,11); // 2 anahtarına set edildi.
        m.put(3,12);
        m.put(4,13);
        m.put(5,12);  // farklı key ile aynı value yi alabiliyor.
        m.put(2,14); // 2 anahtarindaki degeri guncelledi.Artık bu gecerli

        System.out.println(m);// hem key hem value beraber yazdırır.
        System.out.println("m.get(2) = " + m.get(2));   // 2 anahtarındaki değer alındı  m.get(2) = 14

        System.out.println(".keySet = " +m.keySet());        // key ler yazdırılır. m.keySet() = [2, 3, 4]
        System.out.println("m.values() = " + m.values());   // values yazdırılır.  m.values() = [14, 12, 13]

        System.out.println("m = " + m);

      //  2. yöntemler:
    for (Integer ky: m.keySet()){ // key int oldugu için Integer dedik. yoksa kabul etmez.
        System.out.println("ky = " + ky);
    }

    for(Integer vl: m.values()){
        System.out.println("vl = " + vl);
    }

    for(Map.Entry<Integer,Integer> AnahtarVeDeger: m.entrySet()){// key ve value nin tamamı için...ilki E, ikinci enrtry
    for(Map.Entry<Integer,Integer> KeyAndValue: m.entrySet())
        System.out.print("AnahtarVeDeger.getKey() = " + AnahtarVeDeger.getKey()); //.Entry ile alınırken get.key/value()...
        System.out.print(",  AnahtarVeDeger.getValue() = " + AnahtarVeDeger.getValue());
        System.out.println();

// BU YAZDIRMA YÖNTEMİNİ HIFZET... Print-print-println.... döngü buyunca...
    }

    boolean buAnahtarVarMı = m.containsKey(2);
    boolean buDegerVarMı = m.containsValue(14);


        System.out.println("buAnahtarVarMı = " + buAnahtarVarMı);
        System.out.println("buDegerVarMı = " + buDegerVarMı);

        m.remove(2);
        System.out.println("remove den sonraki m: "+m);

        m.clear();;
        System.out.println("clear  den sonraki m: "+ m);



    }
}
