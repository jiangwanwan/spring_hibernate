package com.wanwan.test;

import com.wanwan.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author: Wanwan Jiang
 * @Description:
 * @Date: Created in 10:43 2017/9/29
 * @Modified By:
 * @Email: jiangwanwan0327@163.com
 */
public class App {

    /**
     * 测试hibernate
     */
    @Test
    public void test(){
        Employee employee = new Employee();
        employee.setEmpName("湾湾");
        employee.setWorkDate(new Date());

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    /**
     * 测试spring+hibernate
     */
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        SessionFactory sessionFactory = context.getBean(SessionFactory.class);
        System.out.println(sessionFactory);
    }
}
