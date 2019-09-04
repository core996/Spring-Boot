package core.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: Feign启动类
 * @author: Xin Wu
 * @create: 2019-09-04 12:06
 **/
@SpringBootApplication
@EnableFeignClients(basePackages = {"core.study.service"})
public class StartBootMain {

    public static void main(String[] args) {
        SpringApplication.run(StartBootMain.class,args) ;
    }
}
