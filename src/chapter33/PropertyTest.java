package chapter33;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {
    @Test
    public void test() throws IOException {
        File f = new File("propertiesFile.properties");
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(f);
        properties.load(fileInputStream);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
    }
}
