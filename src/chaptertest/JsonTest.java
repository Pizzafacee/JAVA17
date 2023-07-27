package chaptertest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    @Test
    public void test01() {
//        String s = "{\"name\":\"xingzhenjuan\"}";
//        JSONObject jsonObject = JSON.parseObject(s);
//        Object name = jsonObject.get("name");
//        System.out.println(name);
//        System.out.println(jsonObject);
//        Student student = new Student();
//        String str = JSON.toJSONString(student);
//        System.out.println(str);
//
//        Map map = new HashMap();
//        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        objectObjectHashMap.put("map", map);
//        map.put("key", 3);
//        String s1 = JSONObject.toJSONString(map);
//        HashMap hashMap = JSON.parseObject(s1, HashMap.class);
//        Object key = hashMap.get("key");
//        Object o = ((HashMap) objectObjectHashMap.get("map")).get("key");
//        System.out.println("o=" + o);
//        System.out.println(key);

        String json = "{\n" +
                "    \"data\": {\n" +
                "        \"header\": [\n" +
                "  {\n" +
                "            \"No\": \"SO2306020028\",\n" +
                "            \"OrderTypeCode\": \"93\",\n" +
                "            \"details\": [\n" +
                "                {\n" +
                "                    \"RowNo\": \"1\",\n" +
                "                    \"SAPCode\": \"P6C1FGH120RR012005\",\n" +
                "                    \"ShipQty\": \"20\",\n" +
                "                    \"ShipDate\": \"2023-07-26\"\n" +
                "                },\n" +
                "    {\n" +
                "                    \"RowNo\": \"2\",\n" +
                "                    \"SAPCode\": \"P6C1FXQGH120RR2036\",\n" +
                "                    \"ShipQty\": \"20\",\n" +
                "                    \"ShipDate\": \"2023-07-26\"\n" +
                "                }\n" +
                "     ]\n" +
                "        },\n" +
                "  {\n" +
                "            \"No\": \"SO2307070165\",\n" +
                "            \"OrderTypeCode\": \"93\",\n" +
                "            \"details\": [\n" +
                "                {\n" +
                "                    \"RowNo\": \"1\",\n" +
                "                    \"SAPCode\": \"P6C0HXQH100H561005\",\n" +
                "                    \"ShipQty\": \"10\",\n" +
                "                    \"ShipDate\": \"2023-07-10\"\n" +
                "                }\n" +
                "     ]\n" +
                "        }\n" +
                "    ]\n" +
                "  \n" +
                "   }\n" +
                "}";


        Result result = JSON.parseObject(json, Result.class);
        List<String> sapCodeList = new ArrayList<>();
        Data data = result.getData();
        List<Header> headerList = data.getHeader();
        for (Header header : headerList) {
            List<Details> details = header.getDetails();
            for (Details detail : details) {
                String sapCode = detail.getSAPCode();
                sapCodeList.add(sapCode);
            }
        }
        System.out.println(sapCodeList);
    }
}
