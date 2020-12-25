package M3W1D3_G43_StringBuilderAndBuffer_tryCatch.JavaException;

public class _5_tryCatch {
    public static void main(String[] args) {

        String str="bu";
        int a=5;
        int b=0;
        int c=0;

        try{
            System.out.println("1. Adım");
            char ilkHarf=str.charAt(0); // burada hata oluştu.str="" oldugunda..
            System.out.println("2. Adım");
            c=a/b;
            System.out.println("3. Adım");

        }
        // Catch bloklarında hangi hata önce geliyorsa ona uygun hata adı yazılır, genel Exception en sona yazılır.

        catch (StringIndexOutOfBoundsException ex)// burada özel hata ismi yazılırsa; ilgili hata gelirse catch calışır
// ilgili hatanın dışında hata gelirse, bunun için başka bölüm olmadıgından program KIRILIR.

        {
           // ex.printStackTrace(); // BUNU YAZARAK HATANIN ADINI CONSULDE GÖRECEKSİN.KOPYALAYIP ALIRSIN.hata izsürücüsü
            System.out.println("4. Adım");
            System.out.println("Hata: String dizisinin sınırının dışına taşıldı. ");

        }
            catch(ArithmeticException ex){

                System.out.println("Aritmetik Hata oluştu");

        }


        catch(Exception ex)//hangi hata olursa olsun Exception oldugundan burası calisir. (else gibi)
        {
            System.out.println("Genel hata oluştu");

        }

        System.out.println("5. Adım");



/*
ADIM ADIM GİDELİM...Sadece tek catch (Exception ex) var iken...
ilk hatayı yapınca ikincisine gecmeyecek.--- 2. adım a gecmeden program hata için kırılacak.
str="bugun" yazınca  1-2-4-5- inci adımlar calışır. ama str="" in hatasının cıktısını verdi.oysa hata bölmede oluştu.
Exception ex::: Ne hata olursa olsun bunu calıştır demektir. hatayı özelleştirerek hangi hatayı verirse onun cıktısını alalım

önce ,  str=""; yazarak,  catch in içine ;
ex.printStackTrace(); ile hatanın tamamını yazdırıp. hatanın adını kopyalayarak alırım.
StringIndexOutOfBoundsException   bu kısım  str=""; nin hatasının adıdır. bunu Exception yerine yazarım.
artık catch in içine:: BU HATA GELİRSE BUNU YAP TALİMATI VERMİŞ OLDUM.... HATA ÖZELLEŞTİRİDİ.

PEKİİİİİİ:::::  str="bugun" yazarsam. ne olur.
charAt(0); hata vermeyeceginden dolayı  bölme işlemine gecer. ama onun hatasını gösteren bir catch olamdıgından dolayı
runtime error verir..
PROGRAM Adım 2   de kırılır. alta gecemez.

BUNU AŞMAK İÇİN:: ikinci bir catch oluştururuz. Exception yazınca yukarıdaki özel hata haric hepsini alır.


1. ve 2. catch in arasına 2. sıraya bir catch daha koy... özel adı: ArithmeticException olsun.
Artık bölme hatasını burası görecektir... VE  genel hatayı = Exception ex i görmeyecek.

Ancak dikkat: burada muhtemel hata oluşum sırasına göre catch yazılmalıdır.
mesela ilk başa Exception ex yazarsan  altta kalan özel hatalar kızarır.
genel hata  exception ex daima SONDA OLMALIDIR.

 */

    }
}
