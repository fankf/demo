import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.fan.cap3.config.Main3Config;
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
        System.out.println();
        System.out.println("中科曙光应用交付平台[简称：AppFoundry] V1.01".equals("中科曙光应用交付平台[简称：AppFoundry] V1.01"));
        String str2 = "123123123123qweqweq";
        System.out.println(str2.length() > 20 ? str2.substring(0, 20) : str2);

        String match = "-?\\d+?[.]?\\d{0,8}";

        System.out.println("1.1231231334".matches(match));

        String str = "{\n" +
                "    \"CallbackCommand\": \"C2C.CallbackBeforeSendMsg\", \n" +
                "    \"From_Account\": \"121f6dc1075c4f0dab15f27e5cf191e1\", \n" +
                "    \"To_Account\": \"17310243382\", \n" +
                "    \"MsgSeq\": 48374, \n" +
                "    \"MsgRandom\": 2837546, \n" +
                "    \"MsgTime\": 1557481126, \n" +
                "    \"MsgKey\": \"5412975_1496325741_1579054156\", \n" +
                "    \"MsgBody\": [ \n" +
                "        {\n" +
                "    \"MsgType\": \"TIMImageElem\",\n" +
                "    \"MsgContent\": {\n" +
                "        \"UUID\": \"1853095_D61040894AC3DE44CDFFFB3EC7EB720F\",\n" +
                "        \"ImageFormat\": 1,\n" +
                "        \"ImageInfoArray\": [\n" +
                "            {\n" +
                "                \"Type\": 1,           \n" +
                "                \"Size\": 1853095,\n" +
                "                \"Width\": 2448,\n" +
                "                \"Height\": 3264,\n" +
                "                \"URL\": \"http://xxx/3200490432214177468_144115198371610486_D61040894AC3DE44CDFFFB3EC7EB720F/0\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"Type\": 2,      \n" +
                "                \"Size\": 2565240,\n" +
                "                \"Width\": 0,\n" +
                "                \"Height\": 0,\n" +
                "                \"URL\": \"http://xxx/3200490432214177468_144115198371610486_D61040894AC3DE44CDFFFB3EC7EB720F/720\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"Type\": 3,   \n" +
                "                \"Size\": 12535,\n" +
                "                \"Width\": 0,\n" +
                "                \"Height\": 0,\n" +
                "                \"URL\": \"http://xxx/3200490432214177468_144115198371610486_D61040894AC3DE44CDFFFB3EC7EB720F/198\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}\n" +
                "    ]\n" +
                "}";
        JSONObject jsonAll = JSON.parseObject(str);
        JSONArray msgBody = jsonAll.getJSONArray("MsgBody");
        JSONObject msg0 = (JSONObject) msgBody.get(0);
        JSONObject msgContent = (JSONObject) msg0.get("MsgContent");
        JSONArray imageInfoArray = (JSONArray) msgContent.get("ImageInfoArray");
        JSONObject o = (JSONObject) imageInfoArray.get(0);
        String url = (String) o.get("URL");
        System.out.println(url);
        o.put("URL", "AAA");
        System.out.println(imageInfoArray);
        System.out.println(jsonAll);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main3Config.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String a : beanDefinitionNames) {
            System.out.println(a);
        }
    }
}
