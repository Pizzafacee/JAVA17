package chapter33;

import org.junit.Test;

import java.util.*;

public class ProvinceTest {
    @Test
    public void test1() {
        Map<String, String[]> orgMap = ProvinceAndCity.orgMap;
        Scanner scanner = new Scanner(System.in);
        String[] strings;
        while (true) {
            System.out.println("请输入省份名称");
            String next = scanner.next();
            strings = orgMap.get(next);
            if (strings == null || strings.length == 0) {
                System.out.println("输入的省份不存在，请重写输入");
                continue;
            }
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
            break;
        }

        l:
        while (true) {
            System.out.println("请输入地市名称");
            String str = scanner.next();
            for (String string : strings) {
                if (string.equals(str)) {
                    System.out.println("登记成功");
                    break l;
                }
            }
            System.out.println("输入的地市不存在，请重新输入");
        }
        scanner.close();
    }
}

class ProvinceAndCity {
    public static Map<String, String[]> orgMap;

    static {
        orgMap = new HashMap<>();
        orgMap.put("江苏", new String[]{"南京", "苏州", "无锡", "常州"});
        orgMap.put("安徽", new String[]{"南京", "苏州", "无锡", "常州"});
        orgMap.put("甘肃", new String[]{"南京", "苏州", "无锡", "常州"});
        orgMap.put("河北", new String[]{"南京", "苏州", "无锡", "常州"});
    }
}
