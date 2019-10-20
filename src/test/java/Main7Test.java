import com.fan.cap6.config.Cap6Config;
import com.fan.cap7.bean.Bird;
import com.fan.cap7.config.Cap7Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main7Test {

    @Test
    public void testMain(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap7Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("Bean: "+ beanDefinitionName);
        }
        System.out.println(" IOC 容器被创建了 ... ");
        Bird bird = (Bird) applicationContext.getBean("bird");
        System.out.println(bird);

        //拿到环境变量
        Environment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("bird.color");
        System.out.println(property);
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
