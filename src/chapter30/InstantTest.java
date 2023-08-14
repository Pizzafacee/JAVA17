package chapter30;

import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class InstantTest {
    @Test
    public void test3(){
        Instant now = Instant.now();
        System.out.println(now);
        Instant plus = now.plus(3, ChronoUnit.DAYS);
        System.out.println(plus);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        LocalDateTime now1 = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now1.atZone(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        Date from = Date.from(instant);
        System.out.println(localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalDate localDate1 = LocalDate.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(localDate1);
        //Date.from()
        //localDateTime.to
    }
}
