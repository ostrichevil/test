package demo.ThreadTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RunnableExample implements Runnable {

    private static final Log logger = LogFactory.getLog(RunnableExample.class);
    @Override
    public void run() {
        Long threadId= Thread.currentThread().getId();
        logger.info(threadId);
    }

    public static void main(String[] args) {
        new Thread(new RunnableExample()).start();
    }
}

