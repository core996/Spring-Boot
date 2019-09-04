import core.study.StartBootMain;
import core.study.service.IDeptService;
import core.study.vo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: Feign测试类
 * @author: Xin Wu
 * @create: 2019-09-04 12:13
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    // 表示需要启动Web配置才可以进行测试
@SpringBootTest(classes = StartBootMain.class)  // 定义要测试的启动类
public class TestFeign {
    @Autowired
    private IDeptService deptService ;

    @Test
    public void testAdd(){
        System.out.println(deptService.list());
    }
}
