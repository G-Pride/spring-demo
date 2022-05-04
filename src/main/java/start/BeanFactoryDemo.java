package start;

import entity.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryDemo {

    public static void main(String[] args) {
        //加载xml文件，解析xml中的bean标签并生成相应的bean，将bean注入到spring容器中
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //从容器中获取bean
        Student student = (Student) xmlBeanFactory.getBean("stu");
        System.out.printf(student.getName());
    }
}
