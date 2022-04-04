package spring.wired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Created by aoyonggang on 2022/4/4.
 */
@Data
public class Farmer {
    private String name;
    private String occupy;
    public void saySomething() {
        System.out.println("I'm " + name + " and my occupy is " + occupy);
    }
}
