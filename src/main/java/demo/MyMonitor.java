package demo;

public class MyMonitor {

    MonitorObject monitorObject = new MonitorObject();

    public void doWait() {
        synchronized (monitorObject) {
            try {
                monitorObject.wait();
            } catch (Exception e) {

            }
        }
    }

    public void doNotify() {
        synchronized (monitorObject) {
            monitorObject.notify();
        }
    }

    public static void main(String[] args) {
    }
}
