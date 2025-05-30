// package com.tms_statistic.cmmn.config;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.redis.connection.RedisConnectionFactory;
// import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
// import org.springframework.data.redis.core.RedisTemplate;
// import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
// import org.springframework.data.redis.serializer.StringRedisSerializer;

// @Configuration
// public class RedisConfig {

//     @Value("${spring.data.redis.host}")
//     private String host;

//     @Value("${spring.data.redis.port}")
//     private int port;

//     // Creating Connection with Redis
//     @Bean
//     public RedisConnectionFactory redisConnectionFactory() {
//         LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
//         lettuceConnectionFactory.setHostName(host);
//         lettuceConnectionFactory.setPort(port);
// //        lettuceConnectionFactory.setPassword("");
//         return lettuceConnectionFactory;
//     }

//     // Creating RedisTemplate for Entity
//     @Bean
//     public RedisTemplate<String, Object> redisTemplate() {
//         RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//         redisTemplate.setConnectionFactory(redisConnectionFactory());
//         redisTemplate.setKeySerializer(new StringRedisSerializer());
//         redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//         return redisTemplate;
//     }
// }
