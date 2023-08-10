package chaptertest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TargetProductTest {
    @Test
    public void test01() {
        List<Product> productList = new ArrayList<>();

        Map<String, List<Product>> map = new HashMap<>();
        for (Product product : productList) {
            String soreference1 = product.getSoreference1();
            if (map.containsKey(soreference1)) {
                map.get(soreference1).add(product);
            } else {
                ArrayList<Product> products = new ArrayList<>();
                products.add(product);
                map.put(soreference1, products);
            }
        }


        //可以把map转成对象的集合，封装起来，得到最后的结果。也可以不封装，直接用map；
        Data data = new Data();
        List<Header> headerList = new ArrayList<>();
        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
            Header header = new Header();
            List<Details> detailsList = new ArrayList<>();
            List<Product> value = entry.getValue();
            Product product = value.get(0);
            header.setCarrierAddress3(product.getCarrieraddress3());
            header.setConsigneeAddress1(product.getConsigneeaddress1());
            header.setHedi03(product.getHedi04());
            //TODO
            // 还有几个属性没有set
            for (Product pro : value) {
                Details details = new Details();
                details.setCustomerId(pro.getCustomerid());
                details.setLotAtt05(pro.getLotatt05());
                //TODO
                // 还有几个属性没有set
                detailsList.add(details);
            }
            header.setDetails(detailsList);
            headerList.add(header);
        }
        data.setHeader(headerList);
    }
}
