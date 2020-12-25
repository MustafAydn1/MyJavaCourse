

package M1W1D4_G4_TypeCasting1;

public class String_Int {

    public static void main(String[] args) {

        // int ve stringi birlikte yazabilmek için

             System.out.println("merhaba"); // çift tırnak arasını aynen yazdırır.

            int sayi=5;

            String ad = "mustafa ";  // stringi tanimlarken tırnak içinde tanimla,eşitliğin karşısını..
            String soyad = "aydın ";

            System.out.println(ad+" "+soyad);//ÇİFT TIRNAK ARASINA YAZILMAYAN HERSEY DEĞİŞKEN KABUL EDİLİR.DEGERİ YAZILIR.
            System.out.println(ad);
            System.out.println(soyad);
            System.out.println("ad"+"        "+"soyad");// arasını acmak için çift tırnaklı boşluk acmalisin.

            String  fullname= ad +" "+soyad;           // yine çift tırnakla aç arayı...
            System.out.println("fullname=" +fullname); // üstte string te tanımlı fulname i, fulname eşitliği ile yazdır

            int yas=38;
            String bilgi= ad+" "+ soyad+ "   "+ yas;
            System.out.println(bilgi);                 // bunun ve yukarıdaki fullname in kısa yolu var. SOR????

        System.out.println("fullname= "+ad+soyad+yas);

        // int ve stringi birlikte yazabilmek için
        System.out.println("**********************");
        int yil= 38;
        String  d= "menekse";
        String  u= "mor";

        String bilgi1= d +" "+ u + "  " + yil;
        System.out.println(bilgi1);
        System.out.println(d+"  "+u+"   "+yil);// yukaridaki iki satır yerine tek satırda böyle yapabirsin.
        System.out.println("u="+u+"  "+"d="+d+"  "+"yil="+yil);//yine değişken adları ıle degişkenleri teksatırda yazarsn







    }
}
