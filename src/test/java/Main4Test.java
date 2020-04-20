import com.fan.cap4.config.Cap4Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main4Test {

    @Test
    public void testMain4() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap4Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String a:beanDefinitionNames){
//            System.out.println(a);
//        }
    }
}
