package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("MovieA", Movie.class);
        Movie movie1 = context.getBean("MovieB", Movie.class);
        System.out.println(movie);
        System.out.println(movie==movie1);
    }
}