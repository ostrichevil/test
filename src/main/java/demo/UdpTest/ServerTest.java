package demo.UdpTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerTest {



    public static void main(String[] args) {
        try {

            String str = "the amount ofserver_kkl is 0";
            DatagramSocket datagramSocket = new DatagramSocket(1999);
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
            System.out.println("服务器已经启动，监听1999端口");
            datagramSocket.receive(datagramPacket);
            String info = new String(bytes, 0, datagramPacket.getLength());
            System.out.println("客户端说:"+info);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
