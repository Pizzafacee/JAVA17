package chapter06;

public class Person {
  static   Cat cat = new Cat("xiaomao");
  private   String name;
    int age;
    char gender;

    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        return age;
    }

    public void addAge(int addAge) {
        age += addAge;
    }

    public static Cat getCat() {
        return cat;
    }
}
