package cn.itsource.aigou;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FastJsonTest {

    @Test
    public void test() throws Exception{
//        //java对象转字符串
//        User user = new User(1L,"章若楠");
//        String s = JSON.toJSONString(user);
//        System.out.println(s);

        //java集合json字符串
//        List<User> users = Arrays.asList(
//                new User(1L,"章若楠"),
//                new User(2L,"阚清子")
//        );
//        String s = JSON.toJSONString(users);
//        System.out.println(s);

        //json字符串转java对象
//        String jsonStr = "{\"id\":1,\"name\":\"章若楠\"}";
//        User user = JSONObject.parseObject(jsonStr, User.class);
//        System.out.println(user);

        //json字符串转java集合
        String jsonStr = "[{\"id\":1,\"name\":\"章若楠\"},{\"id\":2,\"name\":\"阚清子\"}]";
        List<User> users = JSONArray.parseArray(jsonStr, User.class);
        System.out.println(users);
    }
}
