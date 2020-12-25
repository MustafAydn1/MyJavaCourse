package M3W1D1_G41_DateAndTime.creatingAndFormating;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dt= LocalDateTime.now();

        LocalDate d= LocalDate.of(2020,1,23);
        LocalTime t= LocalTime.of(21, 3, 12);
        LocalDateTime dt1=LocalDateTime.of(d,t);

        System.out.println("dt1 = " + dt1);



        LocalDateTime dt2 = LocalDateTime.of(2021, 1,1,23,41,45,4567);

        System.out.println("dt2 = " + dt2);


 // bugun ve anın bilgilerini verir..
        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());











    }
}
