import net.xuele.initialize.service.ServiceAnnotation;
import net.xuele.initialize.service.ServiceMixed;
import net.xuele.initialize.service.ServicePrototype;
import net.xuele.initialize.service.ServiceXML;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args ) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/application-context.xml");
        //PropertySourcesPlaceholderConfigurer 会首先从这里取值 取完以后就缓存了，在bean工厂初始化后再修改值就不会变了
        //System.setProperty("integer","100");
        ServiceXML myService = (ServiceXML)applicationContext.getBean("serviceXML");
        myService.call();
        ServiceMixed serviceMixed = (ServiceMixed)applicationContext.getBean("serviceMixed");
        serviceMixed.call();
        ServiceAnnotation serviceAnnotation = (ServiceAnnotation)applicationContext.getBean("serviceAnnotation");
        serviceAnnotation.call();

        System.setProperty("integer","200");
        ServicePrototype servicePrototype = (ServicePrototype)applicationContext.getBean("servicePrototype");
        System.out.println("after change System Properties integer : " + servicePrototype.getInteger());

        applicationContext.destroy();
    }
}
