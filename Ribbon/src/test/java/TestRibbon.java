import core.study.StartBootMain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 测试Ribbon
 * @author: Xin Wu
 * @create: 2019-09-04 11:14
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    // 表示需要启动Web配置才可以进行测试
@SpringBootTest(classes = StartBootMain.class)  // 定义要测试的启动类
public class TestRibbon {

    private static final String DEPT_ADD_URL = "http://MICRO-DEPT/dept/add" ;

    @Autowired
    private RestTemplate restTemplate ;

    @Test
    public void testAdd(){
        System.out.println(restTemplate.getForObject(DEPT_ADD_URL,String.class));
    }

}
