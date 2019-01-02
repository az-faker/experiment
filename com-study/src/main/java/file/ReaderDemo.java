package file;

import java.io.*;

/**
 * @author faker
 * @date 2018/7/11
 */
public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        //创建文件对象
        FileInputStream fis = new FileInputStream("/Users/faker/Desktop/test1.txt");
        //将字节流转换为字符流
        Reader r = new InputStreamReader(fis, "utf-8");
        //字符流读取的缓冲区
        BufferedReader br = new BufferedReader(r);
        //声明变量存储接收缓冲区取来的数据
        String line;

        //循环读取
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        r.close();
        fis.close();
    }
}
