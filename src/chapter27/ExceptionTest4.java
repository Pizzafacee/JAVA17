package chapter27;

public class ExceptionTest4 {
    public static void main(String[] args) {
        ExceptionTest4 exceptionTest4 = new ExceptionTest4();
        try {
            exceptionTest4.methodA();
        } catch (Exception e) {
            e.printStackTrace();
        }

        exceptionTest4.methodB();

    }

    public void methodA() throws Exception {
        try {
            System.out.println("A方法执行");
            throw new Exception("A方法异常");
        } finally {
            System.out.println("A方法的finally");
        }
    }

    public void methodB() {
        try {
            System.out.println("B");
        }finally {
            System.out.println("最终的B方法执行");
        }
    }
}
