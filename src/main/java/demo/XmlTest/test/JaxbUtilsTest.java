package demo.XmlTest.test;

import demo.XmlTest.bo.Student;
import demo.XmlTest.utils.JAXBUtils;

/**
 * @author lizheng
 * @date 2018/3/15
 * @des
 */
public class JaxbUtilsTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAddress("1");
        student.setName("1");
        student.setAge(1);
        String xml = JAXBUtils.modelToStringXml(student);
        System.out.println("-------------------------------");
        System.out.println(xml);
    }
}
