package M3W1D1_G41_DateAndTime.creatingAndFormating;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaLocalTime {
    public static void main(String[] args) {

        // Tarih içermez sadece saat, dak, san içerir 9:00 am gibi)
        LocalTime  time1=LocalTime.now();// o andakini. şimdiki an.


        LocalTime time2=LocalTime.of(21,13);
        LocalTime time3=LocalTime.of(21,13,46);

        System.out.println("time1.getHour() = " + time1.getHour());
        System.out.println("time1.getMinute() = " + time1.getMinute());
        System.out.println("time1.getSecond() = " + time1.getSecond());
        System.out.println("time1.getNano() = " + time1.getNano());

        System.out.println("time1 = " + time1);
        LocalTime time4=LocalTime.now();
        System.out.println("time4 = " + time4);

        //pattern=DESEN---MODEL--KALIP---ŞABLON

       DateTimeFormatter format1=DateTimeFormatter.ofPattern("hh:mm:ss : a");// a: am, pm , localizasyon türkçe olduğu için ÖÖ, ÖS
        System.out.println("time1.format(format1) = " + time1.format(format1));
        
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("HH-mm-ss : a");
        System.out.println("time1.format(format2) = " + time1.format(format2));

        System.out.println("time1 SHORT = " + time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("time1 MEDİUM = "+ time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        //System.out.println("time1 MEDİUM = "+ time1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
// Time da LONG VE FULL yok. Sadece SHORT VE MEDIUM VAR.





    }
}
