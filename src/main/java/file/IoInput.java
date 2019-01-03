package file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author faker
 * @date 2018/7/10
 */
public class IoInput {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/faker/Desktop/test.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }
        fis.close();
    }
}
