package demo.UdpTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Clienttest {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("localhost");
            int port=1999;
            byte[] data = "I'm a man".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(data, data.length, inetAddress, port);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
