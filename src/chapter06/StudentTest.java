package chapter06;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            Student student = new Student();
            student.number = i + 1;
            student.score = (int) (Math.random() * 101);
            student.state = (int) (Math.random() * 6 + 1);
            students[i] = student;
        }

        //打印3年级的学生
//        for (int i = 0; i < 20; i++) {
//            Student student = students[i];
//            if (student.state == 3) {
//                System.out.println(student.number + "\t" + student.state + "\t" + student.score);
//            }
//        }

        //按学生成绩冒泡排序，并遍历所有学生信息
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        //遍历所有学生信息
        for (int i = 0; i < 20; i++) {
            System.out.println(students[i].number + "\t" + students[i].state + "\t" + students[i].score);
        }
    }
}
