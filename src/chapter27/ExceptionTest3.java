package chapter27;

//手动抛异常
public class ExceptionTest3 {
    public static void main(String[] args) {
        ExceptionTest3 exceptionTest3 = new ExceptionTest3();
        try {
            exceptionTest3.regist(-9);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void regist(int id) {
        if (id > 0) {
            System.out.println("2222");
        } else {
            throw new RuntimeException("id小于0");
        }
    }
}
