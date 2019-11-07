import com.fan.cap8.config.Cap8MainConfig;
import com.fan.cap8.dao.TestDao;
import com.fan.cap8.service.TestService;
import com.fan.cap9.bean.Calculate;
import com.fan.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main9Test {

    @Test
    public void testMain() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        Calculate calculate = (Calculate) applicationContext.getBean("calculate");

        int div = calculate.div(3, 0);

        System.out.println(div);
    }
}
