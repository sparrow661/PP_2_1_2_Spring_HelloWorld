import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        Cat bean3 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean3.getVoice());
        Cat bean4 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(bean4.getVoice());
        System.out.println(bean1 == bean2);
        System.out.println(bean3 == bean4);

    }
}