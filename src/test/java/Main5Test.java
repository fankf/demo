import com.fan.cap4.config.Cap4Config;
import com.fan.cap5.bean.Pig;
import com.fan.cap5.config.Cap5Config;
import com.fan.cap5.config.PigImportBeanDefinitionRegistrar;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main5Test {

    @Test
    public void testMain4(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap5Config.class);
        Object monkeyFactoryBean = applicationContext.getBean("monkeyFactoryBean");
        System.out.println(monkeyFactoryBean);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String a:beanDefinitionNames){
            System.out.println(a);
        }
    }
}
