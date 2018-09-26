import net.xuele.initialize.service.ServiceAnnotation;
import net.xuele.initialize.service.ServiceMixed;
import net.xuele.initialize.service.ServiceXML;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args ) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/application-context.xml");
        ServiceXML myService = (ServiceXML)applicationContext.getBean("serviceXML");
        myService.call();
        ServiceMixed serviceMixed = (ServiceMixed)applicationContext.getBean("serviceMixed");
        serviceMixed.call();
        ServiceAnnotation serviceAnnotation = (ServiceAnnotation)applicationContext.getBean("serviceAnnotation");
        serviceAnnotation.call();
        applicationContext.destroy();
    }
}
