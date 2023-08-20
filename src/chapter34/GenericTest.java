package chapter34;

import org.junit.Test;

import java.util.List;

public class GenericTest {
    @Test
    public void test1() {
        SubOrder1 subOrder1 = new SubOrder1();
        Object t = subOrder1.getT();
    }

    @Test
    public void test2() {
        SubOrder2 subOrder2 = new SubOrder2();
        Integer t = subOrder2.getT();
    }

    @Test
    public void test3() {
        SubOrder3<Integer> subOrder3 = new SubOrder3<>();
        Integer t = subOrder3.getT();
    }

    @Test
    public void test4() {
        SubOrder4<String> stringSubOrder4 = new SubOrder4<>();
        String e = stringSubOrder4.getE();
        Integer t = stringSubOrder4.getT();
    }

    @Test
    public void test5() {
        SubOrder5<String, Integer> subOrder5 = new SubOrder5<>();
        String t = subOrder5.getT();
        Integer e = subOrder5.getE();
    }


    //测试泛型方法
    @Test
    public void test6() {
        Order<Integer> integerOrder = new Order<>();
        List<String> strings = integerOrder.copyArrayToList(new String[]{"3", "放", "魔晶"});
        System.out.println(strings);
    }
}
