import net.xuele.debugAop.service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GaoQingming on 2018/9/26 0026.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/application-context.xml");
        MyService myService = (MyService)applicationContext.getBean("myService");
        int i = myService.getNum(1);
        System.out.println(i);
    }
}
