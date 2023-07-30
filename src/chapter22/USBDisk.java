package chapter22;

public class USBDisk implements USB {
    @Override
    public void start() {
        System.out.println("U盘开始传输数据");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止传输数据");
    }
}
