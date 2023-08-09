package chaptertest;

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
        List<TargetProduct> targetProductList = new ArrayList<>();
        for (Map.Entry<String, List<Product>> entry : map.entrySet()) {
            TargetProduct targetProduct = new TargetProduct();
            targetProduct.setSoreference1(entry.getKey());
            targetProduct.setProductDetails(entry.getValue());
            targetProductList.add(targetProduct);
        }
    }
}
