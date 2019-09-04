package core.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @description: Ribbon启动程序类
 * @author: Xin Wu
 * @create: 2019-09-04 10:46
 **/
@SpringBootApplication
@RibbonClient(name = "clientRibbon" )
public class StartBootMain {
    public static void main(String[] args) {
        SpringApplication.run(StartBootMain.class,args) ;
    }
}
