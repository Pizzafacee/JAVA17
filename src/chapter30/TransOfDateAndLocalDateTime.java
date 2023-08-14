package chapter30;

import org.junit.Test;

import java.time.*;
import java.util.Arrays;
import java.util.Date;

public class TransOfDateAndLocalDateTime {
    @Test
    public void test1(){
        //LocalDateTime转Date
        Date from = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
       //Date转LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        //LocalDateTime转LocalDate
        LocalDate localDate = localDateTime.toLocalDate();
        //LocalDateTime转LocalTime
        LocalTime localTime = localDateTime.toLocalTime();
        //localTime转localDateTime
        LocalDateTime localDateTime1 = localTime.atDate(localDate);
        System.out.println(localDateTime1);
        //localDate转LocalDateTime
        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        System.out.println(localDateTime2);
    }
}
