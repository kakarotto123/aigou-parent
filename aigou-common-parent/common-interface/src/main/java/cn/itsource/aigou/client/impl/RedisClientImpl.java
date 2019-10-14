package cn.itsource.aigou.client.impl;

import cn.itsource.aigou.client.RedisClient;
import org.springframework.stereotype.Component;

/**
 * @author 卡卡罗特
 */
public class RedisClientImpl implements RedisClient {

    @Override
    public String get(String key) {
        return "{\"message\":\"服务器异常!\"}";
    }

    @Override
    public void set(String key, String value) {

    }
}