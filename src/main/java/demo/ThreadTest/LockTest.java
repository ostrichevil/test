package demo.ThreadTest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LockTest {

    private static final Log logger = LogFactory.getLog(LockTest.class);

    private static final Object myobject = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (myobject) {
                    logger.info("第一个线程在搞事情");
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (myobject) {
                    logger.info("第二个线程在搞事情");
                }
            }
        });

        threadA.start();
        threadB.start();

    }

}
