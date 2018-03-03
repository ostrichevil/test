package demo.designpattern.createrpattern;



/**
 * @author  li
 * @date 2017/11/2
 * 建造者模式
 * builder 抽象建造方法的接口
 * concreteBuilder 实现builder的类
 * Director 构建使用builder的对象，指导构建过程
 * Product 构建出的产品 在concreteBuilder中创建该产品并定义它的装配
 * */
public interface PersonBuilder {

    public void buildHead();
    public void buildBody();
    public void buildFoot();
    Person buildPerson();

}
