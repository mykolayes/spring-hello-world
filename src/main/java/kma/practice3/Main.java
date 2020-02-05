package kma.practice3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        HelloWorld helloWorldBean = (HelloWorld) applicationContext.getBean("helloBean");
        helloWorldBean.printHello();
    }
}
