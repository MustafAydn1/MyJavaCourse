package M3W1D1_G41_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaPeriod {
    public static void main(String[] args) {

        // Period : 2 tarih arasında geçen zamanı yıl-ay-gün olarak verir. GECEN SUREYİ SAAT-DAK-SN OLARAK VERMEZ.!!!!!!

        // SADECE LocalDate  İLE kullanılabiliyor.

        // LocalTime buSaat=LocalTime.now();
        //LocalTime sonrasi=LocalTime.of(10,11,12);
        //Period gecenSure=Period.between(buSaat,sonrasi);
//BÖYLECE LocalTime  İLE KULLANILAMADIGINI GÖRDUK.


        LocalDate dt=LocalDate.of(1982,1,11); // DOGUM TARİHİM...
        LocalDate bugun=LocalDate.now();

        Period benimyaşım=Period.between(dt,bugun);// Period.between ile yaşımı hesaplar.İKİ TARİH ARASINDAKİ SUREYİ BELİRLER.
        System.out.println("BenimYaşım = " + benimyaşım);

       // DateTimeFormatter Yaşım=DateTimeFormatter.ofPattern("yyyy/MM/dd");
       // System.out.println("Yaşım.format(Yaşım) = " + BenimYaşım.format(Yaşım)); BUNDA FORMAT  YOKMUSŞŞ

        System.out.println("BenimYaşım.getYears() = " + benimyaşım.getYears());
        System.out.println("BenimYaşım.getMonths() = " + benimyaşım.getMonths());

        System.out.println("*******************************************************************************");


        System.out.println("BEN DOĞALI " + benimyaşım.getYears()+" YIL VE "+ benimyaşım.getMonths()+ "  AY  VE "+benimyaşım.getDays()+"  GÜN OLDU..");




    }
}
