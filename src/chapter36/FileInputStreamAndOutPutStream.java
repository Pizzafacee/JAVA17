package chapter36;

import org.junit.Test;

import java.io.*;

public class FileInputStreamAndOutPutStream {
    //使用字节流复制非文本文件
    @Test
    public void test1() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File sourceFile = new File("stream.jpg");
            File copyFile = new File("copy_stream.jpg");
            fileInputStream = new FileInputStream(sourceFile);
            fileOutputStream = new FileOutputStream(copyFile);
            byte[] bytes = new byte[1024];
            int read;
            while ((read = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, read);
            }

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
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //使用字节流读取文本文件，在内存中展示的话可能会出现乱码，对于中文。复制则不受影响
    @Test
    public void test2() {
        FileInputStream fileInputStream = null;
        try {
            File sourceFile = new File("codeError.txt");
            fileInputStream = new FileInputStream(sourceFile);
            byte[] bytes = new byte[5];
            int read;
            while ((read = fileInputStream.read(bytes)) != -1) {
                String s = new String(bytes, 0, read);
                System.out.print(s);
            }
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
}
