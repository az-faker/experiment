package 网络通信.socket.udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author faker
 * @date 2018/7/18
 */
public class AskClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(6666);
        String str = "在吗？来";
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getLocalHost(), 9999);
        ds.send(dp);

        byte[] buf = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(buf, buf.length);

        ds.receive(dp2);
        System.out.println(new String(buf, 0 , dp.getLength()));

        ds.close();
    }
}
