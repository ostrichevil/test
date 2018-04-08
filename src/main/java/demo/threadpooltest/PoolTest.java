package demo.threadpooltest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author lizheng
 * @date 2018/4/8
 * @des 1. newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
 *      2.newFixedThreadPool 创建固定大小线程池，每来一个任务就新建一个线程
 *      3.newScheduledThreadPool 可定时，间隔执行任务
 *      4.newSingleThreadPool 单任务线程池
 */
public class PoolTest {


    public static void main(String[] args) {

        /**
         * 线程池为无限大,执行后面任务时，若之前任务已经完成，会复用之前任务的线程
         * */
//        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            final int index = i;
//            try {
//                Thread.sleep(index * 1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            cachedThreadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(index);
//                }
//            });
//        }

//        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 10; i++) {
//            final int index = i;
//
//            fixedThreadPool.execute(new Runnable() {
//
//                @Override
//                public void run() {
//                    try {
//                        System.out.println(index);
//                        /**
//                         * 每隔两秒输出一次 线程池大小为3，即每次输出三个数
//                         * */
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
//        scheduledThreadPool.schedule(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("delay 3 seconds");
//            }
//        }, 3, TimeUnit.SECONDS); //延迟三秒执行

//        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("delay 1 seconds, and excute every 3 seconds");
//            }
//        }, 1, 3, TimeUnit.SECONDS);

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}
