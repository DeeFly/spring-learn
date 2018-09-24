package net.xuele;

import net.xuele.service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/application-context.xml");
        MyService myService = (MyService)applicationContext.getBean("myService");
        myService.printString("test");
    }
}
