package demo.BioCommTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;

public class SocketClientRequestThread implements Runnable {

    private static final Log LOGGER = LogFactory.getLog(SocketClientRequestThread.class);
    private CountDownLatch countDownLatch;
    /**
     * 这个线层的编号
     *
     * @param countDownLatch
     */
    private Integer clientIndex;

    public SocketClientRequestThread(CountDownLatch countDownLatch, Integer clientIndex) {
        this.countDownLatch = countDownLatch;
        this.clientIndex = clientIndex;
    }

    @Override
    public void run() {
        Socket socket = null;
        OutputStream outputStream = null;   //request
        InputStream inputStream = null;     //response
        try {
            socket = new Socket("localhost", 1099);
            outputStream = socket.getOutputStream();
            inputStream = socket.getInputStream();
            this.countDownLatch.await();                //等待，直到SocketClientDaemon完成所有线程的启动，然后所有线程一起发送请求
            //发送请求信息
            outputStream.write(("这是第" + this.clientIndex + " 个客户端的请求。").getBytes());
            outputStream.flush();
            SocketClientRequestThread.LOGGER.info("第" + this.clientIndex + "个客户端的请求发送完成，等待服务器返回信息");
            int maxLen = 1024;
            byte[] contextBytes = new byte[maxLen];
            int realLen;
            String message = "";
            //程序执行到这里，会一直等待服务器返回信息（注意，前提是in和out都不能close，如果close了就收不到服务器的反馈了）
            while ((realLen = inputStream.read(contextBytes, 0, maxLen)) != -1) {
                message += new String(contextBytes, 0, realLen);
            }
            SocketClientRequestThread.LOGGER.info("接收到来自服务器的信息:" + message);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                SocketClientRequestThread.LOGGER.error(e.getMessage(), e);
            }
        }
    }
}
