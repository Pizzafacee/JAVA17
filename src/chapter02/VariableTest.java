package chapter02;

import com.sun.security.jgss.GSSUtil;

//变量
public class VariableTest {
    public static void main(String[] args) {
        char gender;
        gender = '男';
        System.out.println(gender);
        int age = 10;
        String name = "zhangsan";
        System.out.println(name + age);
        //byte a1 = 128;
        //System.out.println(a1);
        float f1 = 0.1f;
        float f2 = 0.2f;
        float f3 = f1 + f2;
        System.out.println((float) f3);
        System.out.println(0.1 + 0.2);
        float f4 = 12312312313f;
        float f5 = f4 + 1;
        System.out.println("f5==" + f5);
        System.out.println(f4 == f5);

        double pie = 3.1415926;
        double radius = 2.06;
        double area = pie * radius * radius;
        System.out.println(area);
        int radius2 = 4;
        double area2 = pie * radius2 * radius2;
        System.out.println(area2);

        double hua = 80.0;
        double she = (hua - 12) / 1.8;
        System.out.println(hua+"华氏度对应"+she+"摄氏度");

        char c1 = '\u0043';
        System.out.println(c1);
        char c2 = '\t';
        char c3 ='\n';
        //char i = c1 + c2 + c1 + c3 + c1;
        System.out.println();

        char c4 = 97;
        System.out.println(c4);
        double d = 1.0/3;
        System.out.println(d);
    }
}
