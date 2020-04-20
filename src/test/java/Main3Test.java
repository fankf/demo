import com.alibaba.fastjson.JSON;
import com.fan.cap3.config.Main3Config;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fan
 * @create 2019-10-13 23:21
 * @description
 * @see
 */
public class Main3Test {

    @Test
    public void testMain3() throws JSONException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main3Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String a : beanDefinitionNames) {
            System.out.println(a);
        }
    }
}
