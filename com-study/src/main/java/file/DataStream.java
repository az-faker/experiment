package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author faker
 * @date 2018/7/10
 */
public class DataStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/faker/Desktop/test.txt", true);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(100);
        dos.writeDouble(100.99);
        dos.writeUTF("我是张乐乐，我是大魔王");
        dos.close();
        fos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("/Users/faker/Desktop/test.txt"));

        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());

        dis.close();
    }
}
