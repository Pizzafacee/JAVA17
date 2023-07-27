package chaptertest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JsonTest {
    @Test
    public void test01() {
        String s = "{\"name\":\"xingzhenjuan\"}";
        JSONObject jsonObject = JSON.parseObject(s);
        Object name = jsonObject.get("name");
        System.out.println(name);
        System.out.println(jsonObject);
        Student student = new Student();
        String str = JSON.toJSONString(student);
        System.out.println(str);

        Map map = new HashMap();
        map.put("key",3);
        String s1 = JSONObject.toJSONString(map);
        HashMap hashMap = JSON.parseObject(s1, HashMap.class);
        Object key = hashMap.get("key");
        System.out.println(key);
    }
}
