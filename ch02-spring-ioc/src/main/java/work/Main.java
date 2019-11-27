package work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_work.xml");
//        SqlSessionFactory a = context.getBean("A", SqlSessionFactory.class);
//        System.out.println(a);

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_work.xml");
        SqlSessionFactory c = context.getBean("C", SqlSessionFactory.class);
        System.out.println(c);


    }
}
