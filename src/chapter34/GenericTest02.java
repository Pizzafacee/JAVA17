package chapter34;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//泛型的通配符
public class GenericTest02 {
    @Test
    public void test1() {
        List<Integer> list = null;
        List<String> list1 = null;
        method(list1);
        //method(list);不能放
        //list = list1;错误的
        List<Object> list2 = null;
        //list = list2;错误的
        //list2 = list;错误的
        List<?> list3 = null;
        //list3.add(2);错误的
        //list3.add(new Object())错误的
        Object o = list3.get(0);
        method2(list);
        method2(list2);
    }

    public void method(List<String> list) {

    }

    public void method2(List<?> list) {

    }

    public void method3(List<? extends Fatherr> list) {
    }

    public void method4(List<? super Fatherr> list) {
    }

    public void method5(Order<? extends Fatherr> order) {
        //order.setT(new Fatherr() );
        order.setT(null);
        // order.setT(new Son());
        // order.setT();
        Fatherr t = order.getT();
    }

    public void method6(Order<? super Fatherr> order) {
        order.setT(new Fatherr());
        order.setT(new Son());
        //order.setT(new Grandfather());
        Object t = order.getT();
    }

    @Test
    public void test2() {
        List<Son> sons = null;
        List<Fatherr> fathers = null;
        List<Object> objects = null;
        List<String> strings = null;
        method3(sons);
        method3(fathers);
        // method3(objects);错误的
        //fathers = sons;错误的
        List<? extends Fatherr> list = null;
        Fatherr fatherr = list.get(1);
        //list.add(new Son());错误的
        //list.add(new Fatherr());错误的
        //list.add(new Object());错误的
        list = sons;
        //list.add(new Son());错误的
        method3(new ArrayList<>());
    }

    @Test
    public void test3() {
        List<Son> sons = null;
        List<Fatherr> fatherrs = null;
        List<Object> objects = null;
        List<String> strings = null;
        List<Grandfather> grandfathers = null;
        method4(fatherrs);
        //method4(sons);错误的
        method4(objects);
        List<? super Fatherr> list = null;
        Object object = list.get(2);
        list.add(new Fatherr());
        list.add(new Son());
        //list.add(new Object());错误的
        list = fatherrs;
        list = objects;
        list = grandfathers;
        method4(grandfathers);
    }
}
