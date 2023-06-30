package chaptertest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

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
    }
}
