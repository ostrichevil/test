package demo.designpattern.createrpattern;

public class Person {

    private String head;
    private String body;
    private String foot;


    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

}
class Man extends Person{
    public Man()
    {
        System.out.println("开始建造男人");
    }
}
class Woman extends Person{
    public Woman()
    {
        System.out.println("开始建造女人");
    }
}