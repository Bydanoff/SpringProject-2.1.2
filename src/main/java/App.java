import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW1.getMessage());
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println((cat1 == cat2) ? "cat и cat2 имеют одинаковые ссылки" : "cat и cat2 имеют разные ссылки");
        System.out.println((beanHW1 == beanHW2) ? "beanHW и beanHW2 имеют одинаковые ссылки" : "beanHW1 и beanHW2 имеют разные ссылки");
    }
}