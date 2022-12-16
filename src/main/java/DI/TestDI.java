package DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Controllers  client = applicationContext.getBean(Controllers.class);
        client.processMsg("hi 1234");
    }
}
