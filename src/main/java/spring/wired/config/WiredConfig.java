package spring.wired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.wired.beans.NewWorker;

/**
 * Created by aoyonggang on 2022/4/4.
 */
@Configuration
public class WiredConfig {
    @Bean(name="aoyf")
    //@Scope("prototype")

    public NewWorker worker() {
        NewWorker worker1 = new NewWorker();
        //in here, initialization is useless,because of the @Value annotaion in NewWorker will re-populate the value
        worker1.setName("aoyf");
        worker1.setAge(12);
        worker1.setCount(1000);

        return worker1;
    }
}
