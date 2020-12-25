package M1W2D2_G7_Stringmethods1;

public class Metod_String_CharAt {
    public static void main(String[] args) {
        // istenen noktadaki karakteri verir.
        // karakterler sıfırdan başlar.          BUNA index DENİR.

                     //0123456789012
        String kelime="Merhaba Dünya";
        
        char harf=kelime.charAt(3);
        System.out.println("3. harf = " + harf);

       harf=kelime.charAt(0);                  // yukarıda birkez tanımlayınca artık tekrar char ...vb. tanımlamaya gerek yok
        System.out.println("0. harf = " + harf);

        char krktr=kelime.charAt(7);
        System.out.println("7. Harf= "+krktr);// bosluga gelirse boş gösterir..

        krktr=kelime.charAt(26);
        System.out.println("26. Harf= "+krktr);// aralığın dışında ise hata verir..



  // İSTENEN NOKTADAKİ KARAKTERİ VERİR.
  //KARAKTERLERİN SIRASI 0 DAN  BAŞLAR. BUNA  index denir...

        
        
        
        
        
        
        
    }
    
    
    
    
    
}
