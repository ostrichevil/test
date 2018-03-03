package demo.ThreadTest;


import java.util.concurrent.ThreadFactory;

/**
 * @author li
 * @date 2017/11/2
 */
public class ABThreadTest {

    public static void main(String[] args) {

        final print print = new print();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    print.printA();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    print.printB();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    print.printC();
                }
            }
        }).start();


    }

}

class print {

    private boolean flagA = true;
    private boolean flagB = false;
    private boolean flagC = false;


    public synchronized void printA() {
        while (flagB||flagC) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A");
        flagA=false;
        flagB = true;
        flagC = false;
        this.notifyAll();
    }

    public synchronized void printB() {
        while (flagA||flagC) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
        flagA = false;
        flagB = false;
        flagC = true;
        this.notifyAll();
    }

    public synchronized void printC() {
        while (flagA||flagB) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("C");
        flagA = true;
        flagB = false;
        flagC = false;
        this.notifyAll();
    }
}