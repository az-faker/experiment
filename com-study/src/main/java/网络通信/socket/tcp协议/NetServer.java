package 网络通信.socket.tcp协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author faker
 * @date 2018/7/18
 */
public class NetServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6666);
        Socket client = server.accept();
        InputStream is = client.getInputStream();

        byte[] buf = new byte[1024];
        int len = is.read(buf);

        String str = new String(buf, 0, len);
        client.shutdownInput();

        System.out.println("收到，客户端IP为+" + client.getInetAddress() + ", 发送的消息为+" + str);

        OutputStream os = client.getOutputStream();
        os.write("土豆收到！".getBytes());
        client.shutdownOutput();
        os.close();

        is.close();
        client.close();
        server.close();

    }
}
