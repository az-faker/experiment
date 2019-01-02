package file;

import java.io.File;
import java.io.IOException;

/**
 * @author faker
 * @date 2018/7/10
 */
public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/faker/Desktop/test1.txt");
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
        System.out.println(file.createNewFile());
//        System.out.println(file);
//        System.out.println(file.length());
//        System.out.println(file.getPath());
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.delete());
    }

}
