package chapter32;

import org.junit.Test;

public class MathTest {
    @Test
    public void test(){
        double ceil = Math.ceil(3.12);//4.0
        double floor = Math.floor(3.12);//3.0
        long round = Math.round(3.33);//3
        long round1 = Math.round(-2.5);//-2
        long round2 = Math.round(-2.9);//-3
        int i = (int) (Math.random() * 11 + 90);//[90,100]
    }
}
