package M3W1D2_G42_PeriodAndDuration.periodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class period1 {
    public static void main(String[] args) {
//period sadece date lerde kullanır.

        LocalDate bugun= LocalDate.now();

        Period period3Gun= Period.ofDays(3); // 3 günlük bir zaman tutuyor.
        Period ceyrekYil = Period.ofMonths(3); // 3 aylık bir zamn dilimi.

        bugun =bugun.plusDays(3); // bu gune  3 gün ekleme için...
        bugun = bugun.plus(period3Gun); // bugune  yukarıdaki atama ile  3 gün daha ekleme..

        System.out.println("bugun1 = " + bugun); //bugunun tarihıne 6 gun eklemiş oldum.


        bugun = bugun.minus(ceyrekYil); // bu 3 ay eksiltme
        bugun= bugun.plusWeeks(3);     // 3 hafta ekleme...

        System.out.println("bugun2 = " + bugun);


        LocalDate kursBaslangic = LocalDate.of(2020, 5, 25);// bilinen bir tarih verildi...
        Period kursSure = Period.ofMonths(6);                   //  Period.of  ile 6 aylık zaman dilimi belirlendi...
        LocalDate kursBitis = kursBaslangic.plus(kursSure);    // plus ıle bu zaman dilimi eklendi.
        System.out.println("kursBitis = " + kursBitis.format(DateTimeFormatter.ISO_DATE));
        System.out.println("kursBitis gün= " + kursBitis.getDayOfWeek());


    }
}
