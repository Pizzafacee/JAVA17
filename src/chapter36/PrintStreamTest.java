package chapter36;

import org.junit.Test;

import java.io.*;
import java.util.Locale;

public class PrintStreamTest {
    @Test
    public void test1() {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("printStream.txt", true));
            System.setOut(printStream);
            System.out.println("sfkajf\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null)
                printStream.close();
        }
    }

    @Test
    //从键盘输入字符，要求把小写转换成大写，如果输入的是e或者exit则退出
    public void test2() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if ("e".equals(str) || "exit".equals(str)) {
                    System.out.println("输入结束");
                    break;
                }
                System.out.println(str.toUpperCase(Locale.ROOT));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
