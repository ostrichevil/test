package demo.ThreadTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ThreadExample extends Thread {

    private static final Log LOGGER= LogFactory.getLog(ThreadExample.class);
    public void run()
    {
        Long threadId= this.getId();
        LOGGER.info("线程ID：" + threadId);
    }

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
        new Thread(new ThreadExample()).start();
    }
}
