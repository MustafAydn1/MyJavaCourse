package M1W3D4_G14_WhileLoop;

public class ODEV4 {
    public static void main(String[] args) {
// 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız...


  /*      int sayi=1;

        while(sayi<255){

            char Karakter=(char)sayi;

            // bilgisayar harfleri bilmez ,bu sebeple saklayamaz
            // bu yüzden karakterleri karşılık gelen bir sayı ile saklar.
            // bu yüzden char yani karakterler aslında sayı olarak saklanır.
            // bu özellikten dolayı char saklanacak yere direk karakterin karşılık gelen sayısı
            // atanabilir yani A harfi de tanabilir, 65 i char a çevirip de atanabilir.

            System.out.println(sayi +" = "+Karakter);

            sayi++;

        }
*/


        for(int i=1; i<255;i++) {

            char Krktr = (char) i;
            System.out.println(i + " >>> " + Krktr);

        }




    }
}
