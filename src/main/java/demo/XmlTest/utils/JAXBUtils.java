package demo.XmlTest.utils;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.Node;
import java.io.StringWriter;

/**
 * @author li
 * @date 20180315
 */
public class JAXBUtils {


    @SuppressWarnings("unused")
    private static final JAXBContext getJaxbContext(Class<?> c) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(c);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return jaxbContext;
    }

    /**
     * 报文节点反序列化成实体类
     */
    public static final Object documentToModel(Object obj, Node node) {
        if (node == null) {
            return null;
        }
        JAXBContext jaxbContext = getJaxbContext(obj.getClass());
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            obj = unmarshaller.unmarshal(node);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 将实体类转序列化为对应String类型xml节点
     * */
    public static final String modelToStringXml(Object object) {
        StringWriter writer = new StringWriter();
        JAXBContext context = getJaxbContext(object.getClass());
        try {
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, writer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return writer.toString();
    }

    /**
     * 实体类转序列化为对应node结点
     * */
    public static final Node modelToNode(Object object, Node node) {
        JAXBContext context = getJaxbContext(object.getClass());
        try {
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(object, node);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return node;
    }

}
