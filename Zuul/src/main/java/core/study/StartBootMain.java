package core.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description: 程序启动类
 * @author: Xin Wu
 * @create: 2019-09-05 16:06
 **/
@SpringBootApplication
@EnableZuulProxy
public class StartBootMain {

    public static void main(String[] args) {
        SpringApplication.run(StartBootMain.class,args) ;
    }
}
