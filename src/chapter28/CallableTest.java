package chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        CallableRun callableRun = new CallableRun();
        FutureTask futureTask = new FutureTask(callableRun);

        new Thread(futureTask).start();

        try {
            //这个会阻塞主线程，直到分线程返回结果。
            Object o = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


//callable的call方法可以有返回值，其能抛出异常，相比Runnable更加灵活
class CallableRun implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
