package chapter36;

import org.junit.Test;

import java.io.*;

public class FileReadAndWriteTest {
    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            File file = new File("reader.txt");
            fileReader = new FileReader(file);
            int read = fileReader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() throws IOException {
        FileReader fileReader = null;
        try {
            File file = new File("reader.txt");
            fileReader = new FileReader(file);
            int read;
            while ((read = fileReader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //使用数组一次读多个
    @Test
    public void test3() {
        FileReader fileReader = null;
        try {
            File file = new File("reader.txt");
            fileReader = new FileReader(file);
            char[] chars = new char[5];//每次读5个，读完的字符封装在数组中
            int read;//read表示每次实际读到几个字符
            while ((read = fileReader.read(chars)) != -1) {
                for (int i = 0; i < read; i++) {
                    System.out.print(chars[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test4() {
        FileWriter fileWriter = null;
        try {
            File file = new File("writer.txt");//写入的时候可以不用有文件存在，会自动创建
            fileWriter = new FileWriter(file, true);//构造器里面如果是true就是在文件里面追加，如果不写或者是false则是覆盖文件
            fileWriter.write("helloWriter,zzzz,are u ok?");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //将一个文件复制到另一个文件
    @Test
    public void test5() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File sourceFile = new File("sourceFile.txt");
            File copyFile = new File("copyFile.txt");
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(copyFile);
            char[] chars = new char[5];
            int read;
            while ((read = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
