package cn.com.header.app.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Slf4j
public class AppContextTest {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.com.header");
        Student bean = (Student)context.getBean("student");
    log.info(bean.getName());
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Student student = (Student)context.getBean("student");

        log.info(student.getName());
    }

    @Test
    public void test3(){
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
    }

    @Test
    public void test4(){
        EmbeddedWebApplicationContext context = new EmbeddedWebApplicationContext();
        log.info(context.getNamespace());
        context.refresh();
    }
}
