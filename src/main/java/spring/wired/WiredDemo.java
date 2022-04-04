package spring.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.wired.beans.Farmer;
import spring.wired.beans.NewWorker;
import spring.wired.beans.Worker;
import spring.wired.config.WiredConfig;

/**
 * Created by aoyonggang on 2022/4/4.
 */
public class WiredDemo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //wired by annotation
        System.out.println("------wired by annotation------");
        Worker worker = (Worker) context.getBean(Worker.class);
        System.out.println(worker.toString());
        worker.setAge(76);
        worker.setName("aolm");
        System.out.println(worker.toString());
        worker.saySomething();

        //wired by xml
        System.out.println("------wired by xml-----");
        Farmer farmer = (Farmer)context.getBean("farmer001");
        System.out.println(farmer.toString());
        farmer.saySomething();
        //wired by javaconfig
        System.out.println("------wired by javaconfig------");
        AnnotationConfigApplicationContext contextconfig = new AnnotationConfigApplicationContext(WiredConfig.class);
        //contextconfig.register(WiredConfig.class);
        //contextconfig.refresh();
        NewWorker worker1 = (NewWorker) contextconfig.getBean(NewWorker.class);
        System.out.println(worker1.toString());
        worker1.saySomething();
        worker1.saySomething();
        contextconfig.close();

    }
}
