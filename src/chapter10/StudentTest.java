package chapter10;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Jhon", 33, "College", "software");
        int age = student.getAge();
        String name = student.getName();
        String major = student.getMajor();
        System.out.println("age\t" + age + "\tname\t" + name + "\tmajor\t" + major);
    }
}
