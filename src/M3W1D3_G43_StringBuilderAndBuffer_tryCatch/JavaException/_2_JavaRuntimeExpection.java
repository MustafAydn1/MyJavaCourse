package M3W1D3_G43_StringBuilderAndBuffer_tryCatch.JavaException;

public class _2_JavaRuntimeExpection {
    public static void main(String[] args) {

        System.out.println("Program Çalıştı...");
        String str="";

        str.charAt(3);
    }
}

// Çalışma zamanı hatası şeklinde bir hata grubu var  : RunTime Error, Exception
// Derlenme zamanı hatası şeklinde bir hata grubu var : Compile Error, Exception

/*
BU SAYFADAKİ HATA Runtime Error  hatası,


Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 3
main kısmında hata var. Stringin sınırlarının dışında birşey istiyorsun: Sring index aralığı 3 ün dışında...

at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:711)
	BU İKİSİ JAVA YA AİT UYGULAMALARDA OLUŞAN HATALAR.


at M3W1D3_G43_StringBuilderAndStringBuffer.JavaException._2_JavaRuntimeExpection.main(_2_JavaRuntimeExpection.java:9)
 BENİM HATAM İSE :Paket Adı_class adı_class daki satır Adı:9 da oluşmuş.

 */

