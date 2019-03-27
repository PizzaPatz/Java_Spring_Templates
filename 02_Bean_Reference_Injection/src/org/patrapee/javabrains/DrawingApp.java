package org.patrapee.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}

