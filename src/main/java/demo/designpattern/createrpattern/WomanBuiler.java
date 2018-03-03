package demo.designpattern.createrpattern;

public class WomanBuiler implements PersonBuilder {

    Person person;
    public WomanBuiler() {
        this.person = new Woman();
    }

    @Override
    public void buildHead() {
        person.setHead("开始建造女人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("开始建造女人的身子");
    }

    @Override
    public void buildFoot() {
        person.setFoot("开始建造女人的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
