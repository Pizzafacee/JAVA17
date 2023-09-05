package chapter37;

import org.junit.Test;
import project03.conan.practice.team.view.TSUtility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonReflection {
    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();
        for (Field f : declaredFields) {
            f.setAccessible(true);
            if (f.getName().equals("age")) {
                f.set(person, 10);
            }
            if (f.getName().equals("name")) {
                f.set(person, "zhangsna");
            }
        }

        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m.getName());
        }

        Method show = personClass.getMethod("show");
        Object invoke = show.invoke(person);
        Method info = personClass.getMethod("info");
        String invoke1 = (String)info.invoke(person);
        System.out.println(invoke1);
    }
}
