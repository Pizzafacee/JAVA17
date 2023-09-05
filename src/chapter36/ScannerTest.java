package chapter36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerTest {
    public static String readString() {
        BufferedReader bufferedReader = null;
        String str = "";
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            str = bufferedReader.readLine();
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
        return str;
    }

    public static Integer readInteger() {
        return Integer.parseInt(readString());
    }
}
