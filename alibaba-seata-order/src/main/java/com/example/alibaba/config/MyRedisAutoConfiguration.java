package com.example.alibaba.config;

import com.example.alibaba.entity.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

@Configuration
public class MyRedisAutoConfiguration {

    @Bean
    public RedisTemplate<Object, Order> redisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, Order> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        final Jackson2JsonRedisSerializer Jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Order.class);
        template.setDefaultSerializer(Jackson2JsonRedisSerializer);
        return template;
    }
}
