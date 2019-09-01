

import core.study.StartBoot;
import core.study.dao.INewsDAO;
import core.study.vo.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    // 表示需要启动Web配置才可以进行测试
@SpringBootTest(classes = StartBoot.class)  // 定义要测试的启动类
public class TestNewsDAO {
    @Autowired
    private INewsDAO newsDAO ;
    @Test
    public void testAdd() throws Exception {
        News news = new News() ;
        news.setTitle("9-1");
        news.setContent("happy");
        System.out.println(this.newsDAO.doCreate(news));
    }
    @Test
    public void testGet() throws Exception {
        System.out.println(this.newsDAO.findById(1L));
    }
}
