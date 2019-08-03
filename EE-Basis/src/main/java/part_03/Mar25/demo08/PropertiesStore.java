package part_03.Mar25.demo08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesStore {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("jack","123");
        p.setProperty("rose","123");
        p.setProperty("tom","123");
        FileOutputStream os = new FileOutputStream("C:\\Users\\ZY\\Desktop\\user.txt");
        //void store(OutputStream out, String comments)
        p.store(os,"20190325");
        os.close();
    }
}
