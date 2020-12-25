package M3W1D3_G43_StringBuilderAndBuffer_tryCatch.JavaException;

import java.time.LocalDate;
import java.time.Month;

public class _4_JavaTryCatch {
    public static void main(String[] args) {

        try {// denemek demek--- hatanın başladıgı yerin ustune konur.

            LocalDate date = LocalDate.of(2018, Month.APRIL, 40); // 40 ve 4 yaz farkı gör..

            System.out.println("işlem tamam ");

        }// hatanın bittiği yerde  parantez kapatılır.
        catch(Exception hata)//hatayı yakala;  hata oldugunda yapılacak işlemler buradan aşagıda parantez arasına yazılır
        {
            // bu kısım sadece hata olunca calışır.
            // hata oldugunda ne yapılacagı buraya(da)yazılıyor.
            // System.out.println("hata oldu");
            //System.out.println("hata = " + "tarih dönüşüm hatası");

            System.out.println("hata.getMessage() = " + hata.getMessage());// hata mesajını verir.

            hata.printStackTrace();// hatanın gectigi aşamaları tek tek yazar.hataların izini  sürer.hatanın adını gör.
        }

        System.out.println("Programın Sonuna Kadar Gelindi...");


        try{

           // java ögren

        }catch (Exception hata){
            // anlaşılamadı
            //hızlıca konuları tekrar et
            //zaman az
        }

        // sonunda inş iyi bir iş ve meslek seni bekliyor.
    }
}
