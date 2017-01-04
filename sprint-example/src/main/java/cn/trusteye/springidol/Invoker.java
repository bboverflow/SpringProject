package cn.trusteye.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rayman on 2017/1/4.
 */
public class Invoker {
    public static void main(String[] args) throws PerformanceExeption {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Stage stage = Stage.getInstance();
        stage.setContent("hello");
        System.out.println(stage.getContent());
    }
}
