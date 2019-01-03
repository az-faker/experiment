package 网络通信;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author faker
 * @date 2018/7/11
 */


/*
TCP（Transmission Control Protocol）传输控制协议：
需要建立连接
效率相对比较低，数据传输安全
需要三次握手
简单来说一下三次握手：
主机A向主机B发出连接请求数据包：“我想给你发数据，可以吗？”
主机B向主机A发送同意连接和要求同步：“可以，你什么时候发？”
主机A再发出一个数据包确认主机B的要求同步：“我现在就发，你接着吧！”
经过三次“对话”之后，主机A才向主机B正式发送数据
 */
public class Test {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();

        System.out.println(ia);
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());


        //根据域名找到主机ip
        InetAddress ia1 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia1.getHostAddress());
    }
}
