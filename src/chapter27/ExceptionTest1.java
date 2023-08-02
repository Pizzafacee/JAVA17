package chapter27;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {
    @Test
    public void test1() {
        try {
            int aba = Integer.parseInt("aba");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        File file = new File("aadsda");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int read = fileInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test3() {
        test2();
    }


    public static void main(String[] args)
    {
//        long l = Runtime.getRuntime().totalMemory()/1024/1024;
//        long m = Runtime.getRuntime().maxMemory()/1024/1024;
        //System.out.println(l + ":" + m);
        try {
            byte[] bytes = new byte[1024 * 1024 * 100];
        } catch (Error error) {
            error.printStackTrace();
        } finally {
            System.out.println("oom错误也会执行finally语句吗？");
        }
    }
}

class ExceptionTest2 extends ExceptionTest1 {
    @Override
    public void test2() {
        super.test2();
    }
}
