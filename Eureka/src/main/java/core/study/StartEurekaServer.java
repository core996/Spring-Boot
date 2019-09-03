package core.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: EurekaServer启动类
 * @author: Xin Wu
 * @create: 2019-09-03 15:29
 **/
@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(StartEurekaServer.class,args) ;
    }
}
