package M3W1D1_G41_DateAndTime.creatingAndFormating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class javaLocalDate {
    public static void main(String[] args) {

// Sadece gün, ay, yıldan oluşan tarih tutar, saat,dk,sn tutmaz, doğum tarihi 27.01.2000
        LocalDate date1=LocalDate.now(); // bu static tir.// ŞİMDİKİ ANI..CIKTISINI İSTEDİĞİN ANI VERİR,CONSOLE..

        LocalDate date2=LocalDate.of(2019,7,20);

        LocalDate date3= LocalDate.of(2019, Month.JULY,20);

        System.out.println("date3.getMonth() = " + date3.getMonth());
        System.out.println("date2.getDayOfWeek() = " + date2.getDayOfWeek());





        System.out.println("date1.getYear() = " + date1.getYear());
        System.out.println("date1.getMonth() = " + date1.getMonth());
        System.out.println("date1.getMonthValue() = " + date1.getMonthValue());// sayı olarak ay. 7. ay
        System.out.println("date1.getDayOfMonth() = " + date1.getDayOfMonth());
        System.out.println("date1.getDayOfWeek() = " + date1.getDayOfWeek()); // haftanın hangi gunu
        System.out.println("date1.getDayOfYear() = " + date1.getDayOfYear());// yılın kacıncı gunu.202. gunu

        System.out.println("********** İSTENEN TARİHİ DİLEDİĞİN FORMATTA YAZMA YÖNTEMLERİ********** .ofPattern ********");

        DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // ÖNCE FORMATINA AD VER VE FORMATINI BELİRLE...
        System.out.println("date1.format(format1) = " + date1.format(format1));//sonra dilediğin tarih(leri) formata uygun yazdır...
        System.out.println("date2.format(fotmat1) = " + date2.format(format1));


// bunu sırayla ezberleyeceksin.((date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))nokta koydukca gelenleri incele.ögren.

        System.out.println("SHORT = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))); //21.07.2020
        System.out.println("MEDIUM = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))); // 21 Tem 2020
        System.out.println("LONG = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));    // 21 Temmuz 2020
        System.out.println("FULL = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));   //  21 Temmuz 2020 Salı
        System.out.println("FULL GERMANY = " + date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.GERMANY)));// istediğin ülkenın tarih yazımını yapar.
        System.out.println("long DATE2: "+date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        System.out.println("date1.format(DateTimeFormatter.ISO_DATE) = " + date1.format(DateTimeFormatter.ISO_DATE));
      //  System.out.println("date1.format(DateTimeFormatter.ISO_DATE_TIME) = " + date1.format(DateTimeFormatter.ISO_DATE_TIME));
// .ISO_DATE_TIME     OUTPUT hatası verdi. cunku. sadece  Date girildigi için...


//withLocale(Locale.) da SINIRLI SAYIDA ULKE VAR.burada olayan ulkeleri ise AŞAGIDAKİ GİBİ ALIRIZ.

        Locale [] kullanilabilirLokaller=Locale.getAvailableLocales(); // sistemde olmayan ama ulaşılabilir lokaller. array olarak alınacak.
        // Sistemde kullanılabilir lokalleri aşağıdaki kod ile aldık, turkiye için if e bağladık.


        for(Locale l:kullanilabilirLokaller){ //foreach ile tum lokalleri array olarak yazdırıyorum.
            if(l.getDisplayCountry().toLowerCase().contains("türkiye")) // toLowerCase yazınca Türkiyeleri buluyor. yazmayınca bulamıyor.
                System.out.println("l: "+l+" ==> "+l.getDisplayCountry());

        }
        // Aşağıda turkiye ye göre , lokalizasyon sonucunda göre var zamanın turk dilindeki gösterimi oldu.
        Locale localeTurkiye=new Locale("ku","TR"); // kurtce olarak TURKİYE deki  tarih yazılır. tr yazarsan TURKÇE YAZAR.
        System.out.println("FULL Date TURKİYE= "+date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeTurkiye)));
// BURADA NEW İLE OLUŞTURMA SEBEBİMİZ.... bu sisteme dahil olmayan bir yapı.. usttekiler sıstem içindeki metodlar gibiydi. Locale.now(); gibi..




    }
}
