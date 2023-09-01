package chapter36;

import org.junit.Test;

import java.io.*;

//对象输出流 用于序列化对象和反序列化
public class ObjectInputStreamTest {

    //序列化
    @Test
    public void test1() {
        ObjectOutputStream objectOutputStream = null;
        try {
            Person zhangsan = new Person("zhangsan", 33);
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
            objectOutputStream.writeObject(zhangsan);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream!=null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //反序列化
    @Test
    public void test2(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));
            Object o = objectInputStream.readObject();
            System.out.println((Person)o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream!=null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
