package 网络通信.socket.udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author faker
 * @date 2018/7/18
 */
public class AskServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9999);
        byte[] buf = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);
        System.out.println(new String(buf, 0, dp.getLength()));

        String str = "在的啊！";
        DatagramPacket dp2 = new DatagramPacket(str.getBytes(), str.getBytes().length, dp.getAddress(), 6666);
        ds.send(dp2);
        ds.close();

        ds.close();
    }
}
