package chapter06;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.study();
        person.age=20;
        int age = person.showAge();
        System.out.println(age);
        person.addAge(10);
        System.out.println(person.age);

        Person person1 = new Person();
        person1.age = 15;
        person1.study();
        int i = person1.showAge();
        System.out.println(i);
        person1.addAge(3);
        System.out.println(person1.age);

        Cat cat = Person.cat;
        System.out.println(cat.getName());
        cat.setName("damao");
        System.out.println(cat.getName());

//        Cat cat = Person.getCat();
//        System.out.println(cat.getName());
//        cat.setName("damao");
//        System.out.println(cat);
    }
}
