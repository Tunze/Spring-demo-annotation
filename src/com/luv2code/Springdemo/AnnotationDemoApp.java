package com.luv2code.Springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        //call method to get the daily fortune
        System.out.println(coach.getDailyFortune());


        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        //close the context
        context.close();
    }

}
