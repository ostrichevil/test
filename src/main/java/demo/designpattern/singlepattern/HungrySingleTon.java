package demo.designpattern.singlepattern;


/**
 * @author  li
 * @date 2017/11/1
 * 饿汉式单例  类初始化的时候就已经实例化了
 * */
public class HungrySingleTon {

    private HungrySingleTon(){};
    private static final HungrySingleTon HUNGRY_SINGLE_TON = new HungrySingleTon();
    public static  HungrySingleTon getSingleTon()
    {
        return HUNGRY_SINGLE_TON;
    }
}
