package cn.itsource.aigou;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class FastJsonTest {

    @Test
    public void test() throws Exception{
        //java对象转字符串
        User user = new User(1L,"章若楠");
        String s = JSON.toJSONString(user);
        System.out.println(s);
    }
}
