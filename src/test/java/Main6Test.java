import com.fan.cap5.config.Cap5Config;
import com.fan.cap6.config.Cap6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main6Test {

    @Test
    public void testMain() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap6Config.class);
        System.out.println(" IOC 容器被创建了 ... ");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
