package core.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource("classpath:spring/spring-transaction.xml")
public class StartBoot {

    public static void main(String[] args) {
        SpringApplication.run(StartBoot.class,args) ;
    }
}
