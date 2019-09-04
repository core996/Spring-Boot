package core.study.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 负载规则配置类
 * @author: Xin Wu
 * @create: 2019-09-04 11:24
 **/
@Configuration
public class ClientRibbonConfiguration {

    @Bean
    public IRule ribbonRule(){  //轮训规则
        return new BestAvailableRule();
    }

}
