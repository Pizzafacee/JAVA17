package chapter36;

import org.junit.Test;
import project03.conan.practice.team.view.TSUtility;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
    @Test
    public void test1() {
        File file = new File("javaStu.txt");
        String name = file.getName();
        String absolutePath = file.getAbsolutePath();
        File absoluteFile = file.getAbsoluteFile();
        String parent = file.getParent();
        //File parentFile = file.getParentFile();
        //String name1 = parentFile.getName();
        String path = file.getPath();
        System.out.println(name);
        System.out.println(absolutePath);
        System.out.println(absoluteFile);
        System.out.println(parent);
        //System.out.println(parentFile);
        //System.out.println(name1);
        System.out.println(path);
    }

    @Test
    public void test2() {
        File file = new File("hello.sql");
        String parent = file.getAbsoluteFile().getParent();
        System.out.println(parent);
    }

    @Test
    public void test3() {
        String fileName1 = "d:\\IO\\FileTest";
        String fileName2 = "world.txt";
        File file = new File(fileName1, fileName2);
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);
        File file1 = new File(fileName1);
        File file2 = new File(file1, fileName2);
        System.out.println(file2.getAbsolutePath());
    }

    @Test
    public void test4() {
        String fileName = "/helloIO.txt";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
    }

    @Test
    public void test5() {
        File file = new File("D:\\222\\(修订版)bec中级全套光盘");
        String[] list = file.list();
        for (String fileName : list) {
            System.out.println(fileName);
        }
    }

    @Test
    public void test6() {
        File file = new File("hellok.sql");
        File file1 = new File(file.getAbsoluteFile().getParent() + "\\hello.sql");
        boolean b = file.renameTo(file1);
    }

    @Test
    public void test7() throws IOException {
        File file = new File("io.txt");
        if (!file.exists()) {
            boolean newFile = file.createNewFile();
        }
    }

    @Test
    public void test8() throws IOException {
        File file = new File("io.txt");
        if (!file.exists()) {
            boolean newFile = file.createNewFile();
        }
        boolean delete = file.delete();
    }

    @Test
    public void test9() {
        File file = new File("D:\\222\\(修订版)bec中级全套光盘");
        File file1 = new File("/D:/222/(修订版)bec中级全套光盘/BEC常用缩写词.pdf");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());
        System.out.println(file.canRead());
    }

    @Test
    public void test10() {
        File file = new File("D:\\IO\\FileTest\\ok");
        if (!file.exists()) {
            boolean mkdir = file.mkdirs();
            System.out.println(mkdir);
        }

        File file1 = new File("D:\\IO\\FileTest\\ok\\hello");
        if (!file1.exists()) {
            boolean mkdir = file1.mkdir();
            System.out.println(mkdir);
        }
    }

    //输出指定文件夹中的.jpg格式的文件
    @Test
    public void test11() {
        File file = new File("D:\\IO\\FileTest\\ok\\hello");
        String[] list = file.list();
        for (String fileName : list) {
            if (fileName.endsWith(".jpg")) {
                System.out.println(fileName);
            }
        }
    }

    //输出指定文件夹中的.jpg格式的文件方式2
    @Test
    public void test12() {
        File file = new File("D:\\IO\\FileTest\\ok\\hello");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
    }

    /**
     * 练习 3：遍历指定目录所有文件名称，包括子文件目录中的文件。
     * 拓展 1：并计算指定目录占用空间的大小
     * 拓展 2：删除指定文件目录及其下的所有文件
     */

    //方法一
    public void printFileName(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                printFileName(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }

    //方法二
    public void printFileName2(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                printFileName2(f);
            }
        }
    }

    //计算指定目录空间的大小
    public long calculateFileSize(File file) {
        if (file.isFile()) {
            return file.length();
        } else {
            File[] files = file.listFiles();
            long size = 0;
            for (File f : files) {
                long l = calculateFileSize(f);
                size += l;
            }
            return size;
        }
    }

    //删除指定的目录
    public void deleteFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f);
            }
        }
        file.delete();
    }

    /**
     * 将一个文件目录的名称封装到MyFile类中
     */
    public MyFile toMyFile(File file) {
        MyFile myFile = new MyFile();
        if (file.isFile()) {
            myFile.setFileName(file.getName());
        }
        return myFile;
    }


    @Test
    public void test13() {
        File file = new File("D:\\222\\(修订版)bec中级全套光盘");
        printFileName(file);
        System.out.println("=============================");
        printFileName2(file);
    }


    @Test
    public void test14() {
        File file = new File("D:\\222\\(修订版)bec中级全套光盘");
        long l = calculateFileSize(file);
        System.out.println(l);
    }

}
