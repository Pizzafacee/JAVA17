package chapter32;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigTest {
    @Test
    public void test(){
        //大于long的范围就用bigInteger
        BigInteger bigInteger = new BigInteger("12554658562554");
        BigDecimal bigDecimal = new BigDecimal("3.235256");
        BigDecimal divide = bigDecimal.divide(new BigDecimal("0.22"), 12, BigDecimal.ROUND_HALF_UP);
    }
}
