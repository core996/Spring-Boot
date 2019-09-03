package core.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ImportResource("classpath:spring/spring-transaction.xml")
@MapperScan("core.study.dao")
public class StartBoot {

    public static void main(String[] args) {
        SpringApplication.run(StartBoot.class,args) ;
    }
}
