package spring.wired.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

/**
 * Created by aoyonggang on 2022/4/4.
 */
public class NewWorker {
    private int count;
    @Value("aoyx")
    private String name;

    @Value("8")
    private Integer age;

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getCount() {

        return count;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }




    public void saySomething(){
        count++;
        System.out.println("My name is " + name + " and my age is " + age + " count is " + count );

    }
}
