package spring.wired.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Created by aoyonggang on 2022/4/4.
 */
@Data
@Component
public class Worker {
    @Value("aoyg")
    private String name;
    @Value("42")
    private Integer age;
    public void saySomething(){
        System.out.println("My name is " + name + " and my age is " + age );
    }
}
