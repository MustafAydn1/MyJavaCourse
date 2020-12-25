package M3W1D2_G42_PeriodAndDuration.periodAndDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class JavaDuration {
    public static void main(String[] args) {
//LocalDate.between ile yapılanı,LocalTime.between ile yapamıyorduk.!!!!!!!!!!!
//Şimdi Duration iki zaman dilimi arasında gecen sureyi : HOURS-MİNUTES-SECONDS-NANOOFSECOND olarak verir...


        //duration: süre demek. belirlenen ıkı zaman diliminin arasında gecen sureleri verir
        // ne olarak istersen oyle verir. Duration.between(,)


        LocalTime geceYarisi= LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,24,25,26);

        Duration  fark=Duration.between(geceYarisi,ogleVakti);//İKİNCİDEN,BİRİNCİYİ CIKARIR...bunu ters yazarsan negatif cıkar.

        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis() = " + fark.toMillis());// toplam milisanıyeyi verir.
        System.out.println("fark.toHours() = " + fark.toHours());// toplam saatleri verir..
        System.out.println("fark.toMinutes() = " + fark.toMinutes());// saatler dahil toplam dakikayı veriri
        System.out.println("fark.toDays() = " + fark.toDays());// bu kısımda Time cinsinden(gün içindeki saatler) zamanlar belirlenip farkları alınacagından farkın Gun cıkması imkansız

       // part lı olanlar net olarak fazlaları(artanları) veriyor. 25 dak.... 34 sanıye... olarak verir.
        System.out.println("fark.toHoursPart() = " + fark.toHoursPart()); // Bu bölüm sadece saat bölümünü verir
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart()); // bu bölüm sadece bölümünü dakikayı verir, toplamı vermez
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());// bu bölüm sadece saniye bölümünü verir.


    }
}
