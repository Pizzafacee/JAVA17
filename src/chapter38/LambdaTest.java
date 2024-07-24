package chapter38;

import chapter37.Student;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.*;

public class LambdaTest {
    @Test
    public void test1() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }

    @Test
    public void test2() {
        Comparator<String> comparator = (o1, o2) -> {
            return o1.compareTo(o2);
        };
    }

    @Test
    public void test3() {
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
    }

    @Test
    public void test4() {
        Comparator<String> comparator = String::compareTo;
    }

    @Test
    public void test5() {
        Supplier<Student> studentSupplier = Student::new;
    }

    @Test
    public void test6() {
        Student student = new Student();
        Supplier<String> stringSupplier = student::getName;
    }

    @Test
    public void test7() {
        Integer a = 1;
        Comparator<Integer> comparator = Integer::compareTo;
        comparator.compare(a, 3);
    }

    @Test
    public void test8() {
        Comparator<Integer> comparator = Integer::compare;
        comparator.compare(1, 1);
    }

    @Test
    public void test9() {

        Consumer<String> consumer = System.out::println;
        consumer.accept("a");
    }

    @Test
    public void test10() {
        String a = "a";
        Predicate<String> predicate = a::equals;
        boolean a1 = predicate.test("b");
        System.out.println();
        System.out.println();
    }

    @Test
    public void test11() {
        String a = "a";
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return a.equals(s);
            }
        };

        predicate.test("s");
    }

    @Test
    public void test12() {
        Function<String, Integer> function = Integer::parseInt;
        Integer apply = function.apply("222");
    }

    @Test
    public void test13() {
        chapter10.Student ahznag = new chapter10.Student("ahznag", 3);
        BiFunction<String, Integer, chapter10.Student> biFunction = chapter10.Student::new;
        chapter10.Student wnagkang = biFunction.apply("wnagkang", 3);
        System.out.println(wnagkang);
    }

    @Test
    public void test14() {
        Integer[] integers = new Integer[20];
        Function<Integer, Integer[]> function = Integer[]::new;
        System.out.println(function.apply(10).length);
    }
}
