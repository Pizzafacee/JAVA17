package chapter33;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LIstTest {
    @Test
    public void test1() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("lisi");
        stringList.add("liu");
        stringList.add("zhangpeng");
        stringList.add("kun");
        stringList.add("liyifei");
        //删除
        stringList.remove(3);
        stringList.remove("lisi");
        stringList.removeAll(new ArrayList<String>());
        //修改
        String zhoufei = stringList.set(2, "zhoufei");
        System.out.println(zhoufei);
        //查找
        int lisi = stringList.indexOf("lisi");
        int zhangsan = stringList.lastIndexOf("zhangsan");
        //插入
        stringList.add(2, "2222");
        stringList.addAll(3, new ArrayList<>());
    }

    @Test
    public void test2() {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            //a-z [97,122]
            char i1 = (char) (Math.random() * (122 - 97 + 1) + 97);
            characters.add(i1);
        }
        int x = getNumber('x', characters);
        int b = getNumber('b', characters);
        int g = getNumber('g', characters);
        System.out.println(x + "  " + b + "  " + g);

    }

    public int getNumber(Character character, List<Character> list) {
        int count = 0;
        for (Character c : list) {
            if (character.equals(c))
                count++;
        }
        return count;
    }
}
