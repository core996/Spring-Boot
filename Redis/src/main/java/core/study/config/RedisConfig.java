package core.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @description: Redis配置文件
 * @author: Xin Wu
 * @create: 2019-09-02 15:58
 **/
@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String , Object> getRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String , Object> template = new RedisTemplate<>() ;
        template.setConnectionFactory(redisConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return template ;
    }
}
