package com.techproed;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstJUnit {
    @Before
    public void setUp(){
        System.out.println("this is before method");
    }

@Test

    public void test1(){

        System.out.println("this is my first test case");



    }

    @Test
    public void test2(){
        System.out.println("this is my second test case");


    }@Test public void test3(){
        System.out.println("this is my third test case");
    }

    @After
    public void tearDown(){
        System.out.println("this is my after method.this runs after each method done");

    }




}
