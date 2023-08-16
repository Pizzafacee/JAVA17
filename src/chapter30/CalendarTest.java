package chapter30;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    @Test
    public void test01() {
        Calendar calendar = Calendar.getInstance();
        Calendar instance = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        Date time = calendar.getTime();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = s.format(time);
        //System.out.println(calendar==instance);
        System.out.println(format);
    }

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.YEAR,2);
        Date time = instance.getTime();
        new Thread(){
            @Override
            public void run() {
                Calendar instance1 = Calendar.getInstance();
                Date time1 = instance1.getTime();
                Thread.currentThread().setName("副线程");
                System.out.println(Thread.currentThread()+"==>"+time1);
                System.out.println(time==time1);
            }
        }.start();
        System.out.println(Thread.currentThread()+"==>"+time);
    }
}
