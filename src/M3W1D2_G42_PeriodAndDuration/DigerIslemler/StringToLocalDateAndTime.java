package M3W1D2_G42_PeriodAndDuration.DigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTime {
    public static void main(String[] args) {
// parse= ayrıştırma demek... parse ile yapacagız işlemlerimizi...

        String strDate="01 25 2020";

        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM dd yyyy");//String degeri tarihe cevirmek için format yaptık.

        LocalDate tarih=LocalDate.parse(strDate,format);// burada default formata cevirir... senin istediğin gibi yapmaz.ISO_DATE...

        System.out.println("tarih = " + tarih);

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("MMM.dd.yyyy");// ekrana yazdırma formatı belirledik.istediğimiz gibi
        System.out.println("tarih.format(format1) = " + tarih.format(format1));// burada formatın içine kendi belirlediğimiz formatı yaptık.
//format metodunun icine hangi formati olacagini yaziyoruz.

        String strTime="23:49";
        LocalTime time= LocalTime.parse(strTime);//parse ile string olan zaman bilgisi,LocalTime tipi gercek zaman degiskenine
        System.out.println("time = " + time);   // cevirdik..


    }
}
