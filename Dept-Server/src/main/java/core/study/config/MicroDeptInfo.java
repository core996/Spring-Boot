package core.study.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @description: 部门微服务说明
 * @author: Xin Wu
 * @create: 2019-09-03 17:33
 **/
@Component
public class MicroDeptInfo implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("作者","core") ;
        builder.withDetail("说明","部门微服务") ;
    }
}
