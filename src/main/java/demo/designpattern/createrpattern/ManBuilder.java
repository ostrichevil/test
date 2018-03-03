package demo.designpattern.createrpattern;

public class ManBuilder implements  PersonBuilder {

    Person person;

    public ManBuilder(Person person) {
        this.person = new Man();
    }

    @Override
    public void buildHead() {
        person.setHead("开始建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("开始建造男人的身子");
    }

    @Override
    public void buildFoot() {
        person.setFoot("开始建造男人脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
