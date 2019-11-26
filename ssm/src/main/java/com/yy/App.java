package com.yy;




import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public void testB(){
        List<String> list = new ArrayList();
        list.add("1");
        List<String> list1 = new ArrayList();
        list1.add("1");
        System.out.println(list.equals(list1));
        System.out.println(list == list1);
    }


    @Test
    public void test(){
        System.out.println("Hello");
    }

    @Test
    public void hhh(){
        System.out.println("99999909");
    }



    public static void main(String[] args) {
        System.out.println("hello");
    }
}
