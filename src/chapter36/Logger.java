package chapter36;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//日志工具
public class Logger {
    public static void info(String msg) {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("log.txt", true));
            System.setOut(printStream);
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String format = dateTimeFormatter.format(now);
            System.out.println(format + "\t" + msg + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printStream != null)
                printStream.close();
        }

    }
}
