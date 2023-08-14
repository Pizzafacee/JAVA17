package chapter30;

import org.junit.Test;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class LocalDateTimeTest {
    @Test
    public void test01() {
        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now();
        LocalTime now2 = LocalTime.now();
        LocalTime of = LocalTime.of(3, 30);
        System.out.println(of);
        LocalDate localDate = now.plusDays(3);
        LocalDate localDate1 = now.withDayOfMonth(4);
        LocalDate localDate2 = now.withDayOfYear(9);
        LocalDate max = LocalDate.MAX;
        System.out.println(localDate2);
        System.out.println(max);
    }

    @Test
    public void test2(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        TemporalAccessor parse = dateTimeFormatter.parse(format);
        LocalDate parse1 = LocalDate.parse(format);
        System.out.println(parse1);
        LocalDate from = LocalDate.from(parse);
    }

    @Test
    public void test3(){
        LocalDateTime now = LocalDateTime.now();
        LocalDate now1 = LocalDate.now();
        Date date = Date.valueOf(now1);
        long time = date.getTime();
        java.util.Date date1 = new java.util.Date(time);
        LocalDate localDate = date.toLocalDate();
        Instant instant = date.toInstant();
        java.util.Date from = Date.from(instant);
    }
}
