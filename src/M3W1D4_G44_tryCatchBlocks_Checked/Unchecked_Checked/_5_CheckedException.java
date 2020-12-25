package M3W1D4_G44_tryCatchBlocks_Checked.Unchecked_Checked;

import java.io.FileInputStream;

// Dosya okuma/yazma işlemi (dosyaya ulşım vb. sorunlar)
// bu işlemlerde hata olasılığı yüksek olduğundan
// hata kontrolü zorunlu tutuluyor.
// bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
// bu gibi surumlara karşılk gelen hatalara Checked Exception denir.

// özellikle IO(inputOutput) işlemleri Checked Exception dur.!!!!!!!!!!!!!!

public class _5_CheckedException {
    public static void main(String[] args) {
//Stream: akış...
//ÖNCE SADECE FileInputStream YAZDIM.DİREK KIZARDI.GİDERİLMESİNİN TEK YOLU...
// FileInputStream file= new FileInputStream("dosya.txt"); ifadesini
//tryCatch ile yazmasaydım. kırmızılıktan kutulamayacaktı.
// bu yuzden bunlara CheckedException mecburiyeti olan işlemler deniyor.
//Bunları(kırmızılık) yazınca görursun başka yolu var mı?? bilmiyorum???

        try{
            FileInputStream file= new FileInputStream("dosya.txt");
        }
        catch(Exception ex)
    {


    }
}}
