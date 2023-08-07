package chapter26;

import org.junit.Test;

public class WrapperTest3 {
    private Integer a = 150;

    public Integer getA() {
        return a;
    }

    @Test
    public void test(){
        WrapperTest3 wrapperTest3 = new WrapperTest3();
        WrapperTest4 wrapperTest4 = new WrapperTest4();
        System.out.println(wrapperTest3.getA() == wrapperTest4.getA());
    }
}

class WrapperTest4 {
    private Integer a = 150;

    public Integer getA() {
        return a;
    }
}
