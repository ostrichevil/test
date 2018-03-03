package demo.designpattern.singlepattern;


/**
 * @author li
 * @date 2017/11/1
 * 懒汉式单例 在调用方法的时候才实例化
 */
public class LazySingleTon {

    private LazySingleTon() {
    }

    ;

    private static LazySingleTon lazySingleTon = null;


    /**
     * 在getInstance上加同步
     */
    public static synchronized LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }

    /**
     * 双重检查锁定
     */
    public static LazySingleTon getInstance2() {
        if (lazySingleTon == null) {
            /**
             * 双重检查模式
             * 只有一个线程能够获得锁 ，如果不加第二个if，在另外一个线程获得锁后，也会直接new出一个新的对象
             * */
            synchronized (LazySingleTon.class) {
                if (lazySingleTon == null) {
                    lazySingleTon = new LazySingleTon();
                }

            }
        }
        return lazySingleTon;
    }

}
