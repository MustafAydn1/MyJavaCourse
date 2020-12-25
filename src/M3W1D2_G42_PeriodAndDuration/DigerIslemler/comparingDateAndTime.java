package M3W1D2_G42_PeriodAndDuration.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;

public class comparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);
        LocalDate dundenEvvelkiGun=bugun.minusDays(2);

        System.out.println("dundenEvvelkiGun = " + dundenEvvelkiGun.getDayOfWeek());

        boolean after=bugun.isAfter(dun); //bugun dunden sonra mı?  true
        System.out.println("after = " + after);

        boolean before =bugun.isBefore(dun);// bugun dunden önce mi? false
        System.out.println("before = " + before);

        boolean equal= bugun.isEqual(dun);
        System.out.println("equal = " + equal);//bugun dune eşit mi? false

        boolean leapYear=bugun.isLeapYear(); // Artık yıl mı? true
        System.out.println("leapYear = " + leapYear);


        int fark=bugun.compareTo(dun);// iki tarih arasındaki farkın en buyuk parcası arasındaki farkı  verir.
        System.out.println("fark = " + fark);
//        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
//        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
//        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için


        //  sanırım bu özellik (compareTo) LocalTime ile kullanılmıyor. Console de -1 cıkıyor.
        LocalTime simdi=LocalTime.now();
        LocalTime azSonra=LocalTime.of(19,18,17);
        int farkTime=simdi.compareTo(azSonra);
        System.out.println("farkTime = " + farkTime);


    }
}
