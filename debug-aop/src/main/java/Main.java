import net.xuele.debugAop.param.AParam;
import net.xuele.debugAop.service.MyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GaoQingming on 2018/9/26 0026.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/application-context.xml");
        MyService myService = (MyService)applicationContext.getBean("myService");
        System.out.println("getNum begin=====================================================");
        int i = myService.getNum(new AParam("ssss"));
        System.out.println(i);

        System.out.println("selectNum begin=====================================================");
        int j = myService.selectNum(2);
        System.out.println(j);

        System.out.println("other no aop begin=====================================================");
        int k = myService.other(3);
        System.out.println(k);

        System.out.println("ExposeInvocationInterceptor.ADVISOR 重写了toString方法？ " + myService.toString());
    }
}
