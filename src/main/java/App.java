import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHelloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Пара HelloWorld: " + (beanHelloWorld1 == beanHelloWorld2)); // Выведет true
        System.out.println("Пара Cat: " + (beanCat1 == beanCat2));
    }
}