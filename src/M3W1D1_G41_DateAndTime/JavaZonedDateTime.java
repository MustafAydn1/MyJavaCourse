package M3W1D1_G41_DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class JavaZonedDateTime {

    public static void main(String[] args) {
        // Başka ülke veya bölgelerin saat dilimine göre zamanı alma

        // Newyork un saat dilimine saati aldım.
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
      //  ZonedDateTime zdtGER=ZonedDateTime.now(ZoneId.of("GERMANY/MUNIH"));
        ZonedDateTime zdtLocal=ZonedDateTime.now();

        System.out.println("America... Newyork = " + zdt);
      //  System.out.print
        //  ln("zdtGER = " + zdtGER);
        System.out.println("Turkiye = " + zdtLocal);

        System.out.println("***************** BELLİ BİR  FORMATA GÖRE  YAZDIRMA ******************");

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy ***  HH:mm:ss --> a");
        System.out.println("ABD Newyork: " + zdt.format(format1));
        System.out.println("Türkiye = " +zdtLocal.format( format1));


        // bu kısımda ulke sectirip yazdıramadım???????????????
       Set<String> bolgeler= ZoneId.getAvailableZoneIds();

       for(String s: bolgeler){

           if(s.toLowerCase().contains("Turkiye"))

           System.out.println("s = " + s);
       }







    }



}
