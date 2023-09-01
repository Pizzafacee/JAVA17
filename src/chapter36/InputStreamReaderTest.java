package chapter36;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderTest {

    //TODO 测试对于使用gbk编码的文件utf8解码会出现乱码，使用转换流时需要保证解码也是用gbk
    @Test
    public void test1() {
        InputStreamReader inputStreamReader = null;
        try {
            //inputStreamReader = new InputStreamReader(new FileInputStream("gbk_code.txt")); 这里默认使用utf8解码，所以会出现乱码，要指定使用gbk进行解码gbk编码的文件
            inputStreamReader = new InputStreamReader(new FileInputStream("gbk_code.txt"), "gbk");
            //inputStreamReader = new InputStreamReader(new FileInputStream("utf8_code.txt"));//默认解码utf8编码的文件就没有问题
            char[] chars = new char[5];
            int read;
            while ((read = inputStreamReader.read(chars)) != -1) {
                String s = new String(chars, 0, read);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 测试将gbk编码的文件转换成utf8编码的文件进行存储
     */
    @Test
    public void test02() {
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream("gbk_code.txt"), "gbk");
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("utf_8_code.txt"), StandardCharsets.UTF_8);
            char[] chars = new char[5];
            int read;
            while ((read = inputStreamReader.read(chars)) != -1) {
                outputStreamWriter.write(chars, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
