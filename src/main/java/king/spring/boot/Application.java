package king.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hongfei.rong@mtime.com on 2016/6/24.
 */
@ComponentScan
@EnableAutoConfiguration
@Configuration
public class Application {

    public static void  main(String [] args){
        SpringApplication.run(Application.class,new String[]{"--debug"});
    }
}
