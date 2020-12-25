package M3W1D2_G42_PeriodAndDuration.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class LocalTimeTask {

    @Test
    public  void plusTime(){

        LocalTime bugun=LocalTime.now();
        LocalTime actual=bugun.plusHours(1).plusMinutes(1);

        //String expected="23:43";

        Assert.assertEquals(23,actual.getHour());
        Assert.assertEquals(58,actual.getMinute());


    }

    @Test
    public  void minusTime(){

        LocalTime buSaat=LocalTime.now();
        LocalTime actuleTime=buSaat.minusHours(1).minusMinutes(1);

        Assert.assertEquals(21,actuleTime.getHour());
        Assert.assertEquals(56,actuleTime.getMinute());



    }



}
