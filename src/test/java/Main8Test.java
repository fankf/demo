import com.fan.cap8.config.Cap8MainConfig;
import com.fan.cap8.dao.TestDao;
import com.fan.cap8.service.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main8Test {

    @Test
    public void testMain() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        TestService bean = applicationContext.getBean(TestService.class);
        bean.plintln();

        TestDao testDao = applicationContext.getBean(TestDao.class);
        System.out.println(testDao);


    }
}
