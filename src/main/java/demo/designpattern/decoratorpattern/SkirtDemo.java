package demo.designpattern.decoratorpattern;


/**
 * @author lizheng
 * @date 2017.11.16
 * @des decorator模式 重写父类或者接口中的方法，保留原有逻辑，新增逻辑
 */
public class SkirtDemo {

    public static void main(String[] args) {
        CommonHumburger commonHumburger =new CommonHumburger();
        CabbageHumburger cabbageHunburger = new CabbageHumburger(commonHumburger);
        BeatHumburger beatHunburger = new BeatHumburger(commonHumburger);
        System.out.println(commonHumburger.getName()+"卖"+commonHumburger.getPrice());
        System.out.println(cabbageHunburger.getName()+"卖"+cabbageHunburger.getPrice());
        System.out.println(beatHunburger.getName()+"卖"+beatHunburger.getPrice());
    }



}

abstract class AbstractHumburger {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();


};

class CommonHumburger extends AbstractHumburger {

    public CommonHumburger()
    {
        this.name ="普通汉堡";
    }
    @Override

    public double getPrice() {
        return 10;
    }
}

class CabbageHumburger extends AbstractHumburger {

    public AbstractHumburger abstractHumburger;

    public CabbageHumburger(AbstractHumburger abstractHumburger) {
        this.abstractHumburger = abstractHumburger;
    }

    @Override
    public String getName() {
        return abstractHumburger.getName()+"加白菜";
    }

    @Override
    public double getPrice() {
        return abstractHumburger.getPrice()+5;
    }
}

class BeatHumburger extends AbstractHumburger {

    public AbstractHumburger abstractHumburger;

    public BeatHumburger(AbstractHumburger abstractHumburger) {
        this.abstractHumburger = abstractHumburger;
    }

    @Override
    public String getName() {
        return abstractHumburger.getName()+"加节奏";
    }

    @Override
    public double getPrice() {
        return abstractHumburger.getPrice()+10;
    }
}