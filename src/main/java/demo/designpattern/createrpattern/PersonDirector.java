package demo.designpattern.createrpattern;

public class PersonDirector {

    public Person director(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
