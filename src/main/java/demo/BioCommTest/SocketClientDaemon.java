package demo.BioCommTest;

import java.util.concurrent.CountDownLatch;

public class SocketClientDaemon {

    public static void main(String[] args) throws Exception{
        Integer clientNumber = 20;
        CountDownLatch countDownLatch = new CountDownLatch(clientNumber);
        for (int index = 0; index < clientNumber; index++, countDownLatch.countDown()) {
            SocketClientRequestThread socketClientRequestThread = new SocketClientRequestThread(countDownLatch, index);
            new Thread(socketClientRequestThread).start();
        }

        synchronized (SocketClientDaemon.class) {
            SocketClientDaemon.class.wait();
        }
    }
}
