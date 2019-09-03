package core.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/spring-transaction.xml")
@MapperScan("core.study.dao")
public class StartBoot {

    public static void main(String[] args) {
        SpringApplication.run(StartBoot.class,args) ;
    }
}
