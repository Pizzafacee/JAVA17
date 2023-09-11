package chapter37;

import org.junit.Test;
import project03.conan.practice.team.view.TSUtility;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

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
        String invoke1 = (String) info.invoke(person);
        System.out.println(invoke1);
    }

    @Test
    public void test2() throws Exception {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getConstructor();
        constructor.setAccessible(true);
        Student student = constructor.newInstance();
        Field name = studentClass.getSuperclass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(student,"zhangsan");
        System.out.println(name.get(student));
    }

    @Test
    public void test3(){
        Class<Student> studentClass = Student.class;
        Annotation[] annotations = studentClass.getAnnotations();
        for (Annotation annot : annotations) {
            System.out.println(annot.annotationType().getName());
            Method[] fields = annot.annotationType().getMethods();
            for (Method f : fields) {
                System.out.println(f.getName());
            }
        }
    }

    @Test
    public void test4(){
        Class<Student> studentClass = Student.class;
        Type genericSuperclass = studentClass.getGenericSuperclass();
        ParameterizedType genericSuperclass1 = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = genericSuperclass1.getActualTypeArguments();
        Type actualTypeArgument = actualTypeArguments[0];
        System.out.println(actualTypeArgument.getTypeName());
    }
}
