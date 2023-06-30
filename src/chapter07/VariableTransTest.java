package chapter07;

//变量的传递行为
public class VariableTransTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        VariableTransTest variableTransTest = new VariableTransTest();
        variableTransTest.swap(10, 20);
        System.out.println(a + "\t" + b);//发现并并没有交换

        Data data = new Data();
        data.m = 10;
        data.n = 20;
        variableTransTest.swap(data);
        System.out.println(data.m + "\t" + data.n);//发现交换成功


    }

    //定义一个交换变量的方法
    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


    //定义一个交换类成员变量的方法
    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data {
    int m;
    int n;


}
