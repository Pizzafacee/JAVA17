package chapter33;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    @Test
    public void test(){
        ArrayList<Object> objects = new ArrayList<>();
        List<Object> objects1 = Collections.synchronizedList(objects);

    }
}
