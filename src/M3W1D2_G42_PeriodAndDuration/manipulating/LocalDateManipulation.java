package M3W1D2_G42_PeriodAndDuration.manipulating;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LocalDateManipulation {


   @Test
    public void testPlus(){
       LocalDate bugun=LocalDate.now();

       LocalDate actual =bugun.plusYears(1).plusMonths(1).plusDays(1);

      // System.out.println("eklemeli = " + actual);

      // String expect= "2021-08-22";

       Assert.assertEquals("Sizin sonucunuz "+actual+" ama sonuc 2020-08-22 olmalı.","2021-08-22",actual.toString());

   }

    @Test
   public void testMinus(){


   LocalDate bugun= LocalDate.now();
   LocalDate actual=bugun.minusYears(1).minusMonths(1).minusDays(1);

   //String expected= "2019-06-20";

   Assert.assertEquals("2019-06-20",actual.toString());




   }
}
