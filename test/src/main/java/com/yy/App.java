package com.yy;

import com.yy.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.awt.*;

/**
 * Hello world!
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    @Test
    public void test(){
        System.out.println("Hello");
        Color color = new Color(1,2,3);
    }

    @Autowired
    private UserServiceImpl service;

    @Test
    public void testGet(){
        System.out.println(service.getOne(1L));
    }
}
