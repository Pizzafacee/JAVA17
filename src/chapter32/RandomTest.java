package chapter32;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import project03.conan.practice.team.view.TSUtility;

import java.util.Date;
import java.util.Random;

public class RandomTest {
    @Test
    public void test(){
        Random random = new Random();
        int i = random.nextInt();//均匀分布的随机整数
        int i1 = random.nextInt(10);//[0,10)
        System.out.println(i1);
    }
    @Test
    public void test2(){
        Person lisi = new Person(new Date(), "lisi");
        String s = JSON.toJSONString(lisi);
        Person person = JSON.parseObject(s, Person.class);
        System.out.println(person);
        //System.out.println(s);
    }

}
class Person{
    Date date;
    String name;

    public Person(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Person() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}