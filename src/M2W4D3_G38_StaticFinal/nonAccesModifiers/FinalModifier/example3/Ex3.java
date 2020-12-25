package M2W4D3_G38_StaticFinal.nonAccesModifiers.FinalModifier.example3;

public class Ex3 {
    final String name;
    // yine baslangıcta final degeri vermedik.
    //yine kırmızı verdi... Ama Constructor ile calısacagımızı görunce tamam,kabul dedi.


    public Ex3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
      Ex3 ornek1=new Ex3("Esra");
      Ex3 ornek2=new Ex3("Betül");


    //  ornek1.name="Esra"; //final olduğu için, ilk değer atama sonrası değiştirilemez
     // ornek2.name="Betül"; // AYNI BİLE OLSA DEĞİŞMESİ TEKLİF EDİLEMEZ.
        System.out.println("ornek1.name = " + ornek1.name);
        System.out.println("ornek2.name = " + ornek2.name);


    }
}
