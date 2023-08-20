package chapter33;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PorkerTest {
    @Test
    public void test1() {
        //创建一个集合里面包含了扑克牌的所有牌
        List<String> porkerList = new ArrayList<>();
        for (int i = 0; i < porker.DECOR.length; i++) {
            for (int j = 0; j < porker.NUMBER.length; j++) {
                porkerList.add(porker.DECOR[i] + porker.NUMBER[j]);
            }
        }
        porkerList.add("大王");
        porkerList.add("小王");
        Collections.shuffle(porkerList);

        //给Tom Jerry Joker 发牌，并留三张底牌
        List<String> tomPorker = new ArrayList<>();
        List<String> jerryPorker = new ArrayList<>();
        List<String> jokerPorker = new ArrayList<>();

        for (int i = 0; i < porkerList.size() - 3; i += 3) {
            tomPorker.add(porkerList.get(i));
            jerryPorker.add(porkerList.get(i + 1));
            jokerPorker.add(porkerList.get(i + 2));
        }
        System.out.println(tomPorker);
        System.out.println(jerryPorker);
        System.out.println(jokerPorker);

    }
}

class porker {
    public static final String[] NUMBER = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public static final String[] DECOR = {"♥红桃", "♦方块", "♣梅花", "♠黑桃"};
}
