package 网络通信.socket.tcp协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author faker
 * @date 2018/7/11
 */
public class NetClient {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket client = new Socket("localhost", 6666);
        //准备向服务器发送数据
        OutputStream os = client.getOutputStream();
        String str = "土豆，土豆！我是地瓜，收到请回答！";
        os.write(str.getBytes());

        //发送完毕
        client.shutdownOutput();

        //接收来自服务器的回复
        InputStream is = client.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        System.out.println("服务器回复说: " + new String(buf, 0, len));

        //关闭
        is.close();

        os.close();
        client.close();
    }
}