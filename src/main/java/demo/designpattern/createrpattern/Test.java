package demo.designpattern.createrpattern;

public class Test {

    public static void main(String[] args)
    {
        PersonDirector personDirector =new PersonDirector();
        Person aa = personDirector.director(new WomanBuiler());
    }

}
