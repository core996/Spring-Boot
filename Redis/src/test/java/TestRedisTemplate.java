import core.study.StartBoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: Redis测试类
 * @author: Xin Wu
 * @create: 2019-09-02 16:05
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    // 表示需要启动Web配置才可以进行测试
@SpringBootTest(classes = StartBoot.class)  // 定义要测试的启动类
public class TestRedisTemplate {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate ;
    @Test
    public void testSave()throws Exception {
        Map<String, String > map = new HashMap<>();
        map.put("ww","core") ;
        map.put("w1","core") ;
        map.put("w2","core") ;
        this.redisTemplate.opsForValue().set("1",map);
    }

    @Test
    public void testGet(){
        System.out.println(this.redisTemplate.opsForValue().get("1"));
    }
}
