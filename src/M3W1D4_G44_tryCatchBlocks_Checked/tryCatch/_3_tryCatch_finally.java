package M3W1D4_G44_tryCatchBlocks_Checked.tryCatch;

public class _3_tryCatch_finally {
    public static void main(String[] args) {

        System.out.println("try bloguna girmeden önceki kodlar çalıştı.");

      try{// hatanın olma ihtimalinin oldugu kodların alındıgı blok

       String str="";
          System.out.println("hatadan bir önceki adım");

        char ilkHarf=str.charAt(0);// hata oldugunda try ın içindeki
          System.out.println("hatadan bir sonraki adım");
      }
      catch (Exception ex){ //try da olşabilecek hata yakalama blogu...

          System.out.println("Catch bölümü çalıştı.");

      }
      finally { // hata olsun veya olmasın çalışacak bölüm: finaldir
          // kullanım sebebi: try catch in içinde yapılmış işlemlerde arda kalan kapama gibi (tryCatchleri) bu bölüme ait
          //işlemler yapılarak kod düzeni ve kod bütünlüğü saglanmış olur.

          System.out.println("finally bölümü çaliştı.");
          // database  kapat.
      }

        System.out.println("tum hata kodlarından sonraki bölüm çalıştı");





    }
}
