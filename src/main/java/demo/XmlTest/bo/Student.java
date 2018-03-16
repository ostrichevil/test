package demo.XmlTest.bo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;

/**
 * @author  li
 * @date 20180315
 * */
@XmlRootElement(name="studentBean")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    @XmlElement(name="age")
    private int age;
    @XmlElement(name="address")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlTransient
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @XmlTransient
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
