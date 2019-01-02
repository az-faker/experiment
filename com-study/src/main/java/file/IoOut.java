package file;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author faker
 * @date 2018/7/10
 */
public class IoOut {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/faker/Desktop/test.txt", true);
        String str = "hello world";
        byte[] by = str.getBytes();
        fos.write(by, 0, by.length);
        fos.close();
    }
}
