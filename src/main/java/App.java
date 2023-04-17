import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean(HelloWorld.class);
//        HelloWorld tree = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
//        HelloWorld leaf = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = applicationContext.getBean(Cat.class);
        Cat catBean2 = applicationContext.getBean(Cat.class);
//        Cat one = (Cat) applicationContext.getBean("cat");
//        Cat two = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean2));
        System.out.println(catBean1.equals(catBean2));
    }
}