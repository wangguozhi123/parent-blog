package com.seven.articleblog;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleBlogApplicationTests {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void test(){
        Map<String,Object> map=new HashedMap();
        map.put("code","200");
        map.put("message", Arrays.asList("hello",123,true));
        rabbitTemplate.convertAndSend("student.dir","pub.news","11111111");
    }

    @Test
    public void recive(){
        Object o = rabbitTemplate.receiveAndConvert("pub.news");
        System.out.println(o);
    }
}
