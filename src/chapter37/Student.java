package chapter37;

@Table("student")
public class Student extends Human<String> implements Comparable<Student>{
    @Colum(name = "class_name",type = "String")
    private String className;
    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public Student() {
        super();
    }
}
