package chapter30;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    @Test
    public void test01() throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        Date parse = simpleDateFormat.parse(format);
        System.out.println(parse);
        long time = date.getTime();
        System.out.println(time);

        //sql中的date
        java.sql.Date date1 = new java.sql.Date(387748994L);
    }


    //util中的date转sql中的date
    @Test
    public void test2(){
        Date date = new Date();
        long time = date.getTime();
        java.sql.Date date1 = new java.sql.Date(time);
        System.out.println(date1);
    }

    //将控制台传来的date字符串转成sql中的date
    @Test
    public void test3() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2023-12-10";
        Date parse = simpleDateFormat.parse(dateString);
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);
    }
}

